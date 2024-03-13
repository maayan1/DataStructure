package Algorithms;

import java.util.ArrayList;

public class Fibonacci {


    public static void fibonacciGeneratore(int n, ArrayList<Integer> output){

        if( n == 1){
            output.add(0);
        }
        else if( n ==2){
            output.add(0);
            output.add(1);
        }
        else{
            output.add(0);
            output.add(1);

            for(int i = 2 ; i < n; i++){
                output.add((output.get(output.size()-2)) + (output.get(output.size()-1)));
            }
        }


    }


    public static void main(String[] args) {
        ArrayList<Integer> output = new ArrayList<>();
        int n = 8;
         fibonacciGeneratore(n,output);
        System.out.println(output.toString());
    }
}
