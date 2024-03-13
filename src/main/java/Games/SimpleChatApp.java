package Games;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleChatApp {
    private JFrame frame;
    private JTextArea chatArea;
    private JTextField messageField1;
    private JTextField messageField2;
    private JButton sendButton1;
    private JButton sendButton2;


    public SimpleChatApp(){
        frame = new JFrame("Simple Chat Application");
        frame.setTitle("Simple Chat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setSize(1000,800);
        frame.setBounds(100,200,350,300);
        Color color = new Color(229, 132, 15);
        frame.getContentPane().setBackground(color);
       // frame.getContentPane().setBackground(Color.blue);
        //frame.setLayout(new BorderLayout());

        chatArea = new JTextArea(55,40);
        chatArea.setEditable(false);
        frame.add(new JScrollPane(chatArea),BorderLayout.CENTER);

        messageField1 = new JTextField(10);
        messageField2 = new JTextField(10);

        frame.add(messageField1,BorderLayout.SOUTH);
        frame.add(messageField2,BorderLayout.NORTH);


        sendButton1 = new JButton("Send");
        sendButton2 = new JButton("Send");
        frame.add(sendButton1, BorderLayout.EAST);
        frame.add(sendButton2, BorderLayout.WEST);

        sendButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(messageField1,"user 1");

            }
        });
        sendButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage(messageField2,"user 2");

            }
        });

        frame.setVisible(true);

    }

    private void sendMessage(JTextField messageField, String user) {
        String message = messageField.getText();
        chatArea.append("You: " + message + "\n");
        messageField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleChatApp();
            }
        });
    }

}
