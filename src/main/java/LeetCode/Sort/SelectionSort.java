package LeetCode.Sort;

import java.util.Arrays;

public class SelectionSort {



    public static int [] sortArr(int [] arr) {
        int[] sortArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index])
                    min_index = j;


            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
            return sortArr;
        }


    public void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }


    public static void main(String[] args) {
        int arr[]={65,25,12,22,11};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }
}
