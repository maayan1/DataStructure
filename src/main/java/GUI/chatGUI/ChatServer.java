package GUI.chatGUI;

import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatServer {
    private Set<PrintWriter> clientWriters = new HashSet<>();
    private JTextArea chatArea;

    public ChatServer() {
        JFrame serverFrame = new JFrame("Chat Server");
        serverFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        serverFrame.setSize(400, 300);

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        serverFrame.add(new JScrollPane(chatArea), BorderLayout.CENTER);

        serverFrame.setVisible(true);

        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            chatArea.append("Server started on port 12345.\n");
            while (true) {
                new ClientHandler(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                out = new PrintWriter(socket.getOutputStream(), true);
                clientWriters.add(out);

                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String message;
                while ((message = in.readLine()) != null) {
                    broadcast(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                clientWriters.remove(out);
            }
        }

        private void broadcast(String message) {
            for (PrintWriter writer : clientWriters) {
                writer.println(message);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ChatServer());
    }
}
