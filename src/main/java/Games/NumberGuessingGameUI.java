package Games;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NumberGuessingGameUI {

    private int numberToGuess;
    private int numberOfTries;
    private JFrame frame;
    private JTextField inputField;
    private JTextArea outputArea;


    public NumberGuessingGameUI(){
        numberToGuess = new Random().nextInt(100) +1;
        numberOfTries = 0;

        frame = new JFrame("Number Guessing Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,800);
        frame.setLayout(new BorderLayout());

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        frame.add(new JScrollPane(outputArea), BorderLayout.CENTER);

        inputField = new JTextField();
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processGuess();
            }
        });
        frame.add(inputField, BorderLayout.SOUTH);

        outputArea.setText("Welcome to the Number Guessing Game!\nI've selected a random number between 1 and 100. Try to guess it.\n");

        frame.setVisible(true);

    }
    private void processGuess() {
        String input = inputField.getText();
        int userGuess;

        try {
            userGuess = Integer.parseInt(input);
            numberOfTries++;

            if (userGuess < numberToGuess) {
                outputArea.append("Guess #" + numberOfTries + ": The number is higher. Try again.\n");
            } else if (userGuess > numberToGuess) {
                outputArea.append("Guess #" + numberOfTries + ": The number is lower. Try again.\n");
            } else {
                outputArea.append("Congratulations! You've guessed the number in " + numberOfTries + " tries.\n");
                inputField.setEnabled(false);
            }

            inputField.setText("");
        } catch (NumberFormatException e) {
            outputArea.append("Please enter a valid number.\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NumberGuessingGameUI();
            }
        });
    }
}
