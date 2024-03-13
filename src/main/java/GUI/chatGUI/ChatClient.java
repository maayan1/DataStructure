package GUI.chatGUI;

import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatClient {
    private JFrame clientFrame;
    private JTextField messageField;
    private JTextArea chatArea;
    private PrintWriter out;

    public ChatClient() {
        clientFrame = new JFrame("Chat Client");
        clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clientFrame.setSize(400, 300);

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        messageField = new JTextField();
        messageField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sendMessage(messageField.getText());
                messageField.setText("");
            }
        });

        clientFrame.add(new JScrollPane(chatArea), BorderLayout.CENTER);
        clientFrame.add(messageField, BorderLayout.SOUTH);

        String serverAddress = JOptionPane.showInputDialog("Enter Server IP Address:");
        try {
            Socket socket = new Socket(serverAddress, 12345);
            out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message;
            while ((message = in.readLine()) != null) {
                chatArea.append(message + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        clientFrame.setVisible(true);
    }

    private void sendMessage(String message) {
        out.println(message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ChatClient());
    }
}
