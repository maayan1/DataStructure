package LeetCode.Sort;

import java.util.ArrayList;
import java.util.Arrays;

class Solution1 {
    // Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> solution = new ArrayList<Integer>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (arr1.length > arr2.length) {
            searchArr(arr1, arr2, solution);
        } else {
            searchArr(arr2, arr1, solution);
        }
        return solution;
    }

    public static ArrayList<Integer> searchArr(int[] shortArr, int[] longArr, ArrayList<Integer> solution) {
        for (int i = 0; i < longArr.length; i++) {
            for (int j = 0; j < shortArr.length - 1; j++) {
                if (longArr[i] == shortArr[j]) {
                    solution.add(longArr[i]);
                    // Break out of the inner loop if a match is found.
                    break;
                }
            }
        }

        // Handle the last element of shortArr separately.
        if (shortArr.length > 0 && longArr[longArr.length - 1] == shortArr[shortArr.length - 1]) {
            solution.add(longArr[longArr.length - 1]);
        }

        return solution;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 6};

        ArrayList<Integer> intersection = printIntersection(arr1, arr2, arr1.length, arr2.length);

        System.out.println("Intersection of the two arrays: " + intersection);
    }
}

