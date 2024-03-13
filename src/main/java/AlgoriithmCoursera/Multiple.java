package AlgoriithmCoursera;

import java.util.ArrayList;
import java.util.Scanner;

public class Multiple {

public ArrayList<Integer> getDigits() {
    ArrayList<Integer> digit = new ArrayList<>();


    Scanner scanner = new Scanner(System.in);

    // Input the first number
    System.out.print("Enter the first number (N-digit): ");
    int x = scanner.nextInt();
    digit.add(x);

    // Input the second number
    System.out.print("Enter the second number (N-digit): ");
    int y = scanner.nextInt();
    digit.add(y);
    
    

    // Calculate the product
    long product = (long) x * y;

    // Output the product
    System.out.println("Product of " + x + " and " + y + " is: " + product);

    scanner.close();


    return digit;
}


 public int multipleDigit(ArrayList<Integer> digit){
    int results = 0;
     for (int i=0; i<digit.size(); i++){
         int num= digit.get(i);
         int length = String.valueOf(num).length();
         System.out.println(length);
     }
    return results;
 }


    public static void main(String[] args) {
        Multiple multiple = new Multiple();
        ArrayList<Integer> digit=new ArrayList<>();
        digit =multiple.getDigits();
        multiple.multipleDigit(digit);


    }



}
