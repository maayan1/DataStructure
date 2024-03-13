package LeetCode.Sort;

import java.util.ArrayList;
import java.util.Arrays;

/*hiring challenge exclusively for Freshers

banner
The intersection of two arrays contains the elements common to both the arrays. The intersection should not count duplicate elements.
Given two sorted arrays arr1[] and arr2[] of sizes N and M respectively. Find their intersection



Example 1:

Input:
N = 4, arr1[] = {1, 2, 3, 4}
M = 5, arr2 [] = {2, 4, 6, 7, 8}
Output: 2 4
Explanation: 2 and 4 are only common
elements in both the arrays. */

class Solution
{
    //Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m) {
     ArrayList<Integer> solution = new ArrayList<Integer>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(arr1.length > arr2.length){
                searchArr(arr2,arr1,solution);
        }else{
                searchArr(arr1,arr2,solution);
        }
      return solution;
    }
    public static ArrayList<Integer> searchArr(int[] shortArr , int [] longArr,ArrayList<Integer> solution) {
        for(int i =0 ; i < longArr.length; i++){
            for(int j=0; j < shortArr.length; j++){
                if(longArr[i] == shortArr[j]){
                    solution.add(longArr[i]);
                    if( j == shortArr.length-1 ){
                        break;
                    }
                }
            }
        }
        return solution;
    }


    public static void main(String[] args) {
        //int [] arr1={1,7,3,4};//{1,2,3,4};
        //int [] arr2 ={2,1,6,7,1};//{6,7,8,2,4};

        int[] arr1 = {9, 4, 6, 8};
        int[] arr2 = {2, 4, 10, 8};
        int n =arr1.length,m=arr2.length;

        System.out.println(printIntersection(arr1,arr2,n,m));

    }
}

/*hiring challenge exclusively for Freshers

banner
The intersection of two arrays contains the elements common to both the arrays. The intersection should not count duplicate elements.
Given two sorted arrays arr1[] and arr2[] of sizes N and M respectively. Find their intersection



Example 1:

Input:
N = 4, arr1[] = {1, 2, 3, 4}
M = 5, arr2 [] = {2, 4, 6, 7, 8}
Output: 2 4
Explanation: 2 and 4 are only common
elements in both the arrays. */

