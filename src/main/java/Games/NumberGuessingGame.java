package Games;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random =  new Random();
        int numberToGuess = random.nextInt(100) +1;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the number guessing game");
        System.out.println("i've selected a randome number between 1 and 100");

        while(!hasGuessedCorrectly){

            System.out.println("Enter your numbe: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if(userGuess < numberToGuess) {
                System.out.println("the number is higher try again");
            } else if ((userGuess > numberToGuess)) {
                System.out.println("the number is lower try again");
            }
            else{
                hasGuessedCorrectly = true;
            System.out.println("congrats");
            }
        }
    scanner.close();
    }

}
