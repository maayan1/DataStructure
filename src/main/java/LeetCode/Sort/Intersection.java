package LeetCode.Sort;

import java.util.ArrayList;
import java.util.Arrays;

class Intersection
{
    //Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> solution = new ArrayList<Integer>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println("****************");
        System.out.println();
        System.out.println(Arrays.toString(arr2));


        if(m > n){
              searchArr(arr1,arr2,solution);
        }else{
              searchArr(arr2,arr1,solution);
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
        int [] arr2={1,2,3,4};
        int [] arr1 ={6,7,8,2,4};
        int n =4,m=5;
        System.out.println(printIntersection(arr1,arr2,n,m));

    }

}