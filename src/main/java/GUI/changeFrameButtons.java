package GUI;

import javax.swing.*;
import java.awt.*;

public class changeFrameButtons {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo");
        JPanel panel = new JPanel();
        frame.getContentPane();

        JButton button = new JButton("Demo button");
        Dimension size = button.getPreferredSize();
        button.setBounds(300,180,size.width,size.height);
        panel.setLayout(null);
        panel.add(button);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
}
