package LeetCode;

import java.util.ArrayList;
import java.util.List;

/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
 */
public class addTwoNumbers {


    public ArrayList getNumber(ArrayList <Integer> list){
        ArrayList <Integer> newList = new ArrayList<Integer>();
        for (int i = list.size(); i > 1 ;i--){
            int number = list.get(list.size()-1);
            newList.add(number);
            int numToRemove = list.size()-1;
            list.remove(numToRemove);
        }
        if(list.size() == 1){
            newList.add(list.get(0));
            list.remove(0);
        }
        return newList;
    }

    public static int createNumber(List<Integer> numbers) {
        StringBuilder sb = new StringBuilder();
        for (Integer num : numbers) {
            sb.append(num);
        }
        return Integer.parseInt(sb.toString());
    }

    public static int createNumberFromList(List<Integer> numbers) {
        StringBuilder sb = new StringBuilder();
        for (Integer num : numbers) {
            sb.append(num);
        }
        return Integer.parseInt(sb.toString());
    }

    public int sumNumbers(int a,int b){
        int ans=a+b;
        return ans;
    }

    public static List<Integer> createList(int number) {
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(0, number % 10);
            number /= 10;
        }
        return digits;
    }
    public static void main(String[] args) {
        addTwoNumbers addTwoNumbers1 = new addTwoNumbers();
        List<Integer> al = new ArrayList<Integer>();
        List<Integer> afterRevers;
        List<Integer> sumNumberListBeforeRevers;
        List<Integer> sumNumberListAfterRevers;



        al.add(2);
        al.add(4);
        al.add(3);
        System.out.println("list before revers"+al.toString());
        afterRevers = addTwoNumbers1.getNumber((ArrayList) al);
        System.out.println("list after reverse: "+afterRevers.toString());
        int number = createNumber(afterRevers);
        System.out.println("number 1:  " + number);
        List<Integer> al1 = new ArrayList<Integer>();
        List<Integer> afterRevers1 = new ArrayList<Integer>();
        al.add(5);
        al.add(6);
        al.add(4);
        System.out.println();
        System.out.println("list before revers"+al.toString());
        afterRevers = addTwoNumbers1.getNumber((ArrayList) al);
        System.out.println("list after reverse: " + afterRevers.toString());
        int number2 = createNumber(afterRevers);
        System.out.println("number 2:  " + number2);

        int sumToReverse = addTwoNumbers1.sumNumbers(number,number2);
        System.out.println("sum: " +sumToReverse);
        sumNumberListBeforeRevers = createList(sumToReverse);
        System.out.println(sumNumberListBeforeRevers.toString());
        sumNumberListAfterRevers = addTwoNumbers1.getNumber((ArrayList)sumNumberListBeforeRevers);
        System.out.println("last Result" +sumNumberListAfterRevers);







    }
}
