package GUI;

import javax.swing.*;

public class ContainerClass {

        public static void main(String[] args) {
            JFrame frame = new JFrame("My First GUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocation(200,300);
            frame.setSize(300,300);
            JButton button = new JButton("Click Me");
            button.setBounds(400,1000,100,60);
            button.setLocation(105, 200);
            frame.add(button); // Adds Button to content pane of frame
            frame.setVisible(true);


            JFrame frame1 = new JFrame("LOOK AT THIS SIZE");
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame1.setLocation(500,500);//
            frame1.setTitle("Do Do Do");
            frame1.setSize(800,400);
            JButton button2 = new JButton("Just Click");
            frame1.add(button2);
            frame1.setVisible(true);



        }
    }

