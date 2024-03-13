package GUI;

import javax.swing.*;
import java.awt.*;

public class adding2Buttons {

    public static void main(String args[]){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        frame.getContentPane().add(button1);
        frame.add(button1, BorderLayout.NORTH);
       frame.getContentPane().add(button2);
       frame.add(button2,BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
