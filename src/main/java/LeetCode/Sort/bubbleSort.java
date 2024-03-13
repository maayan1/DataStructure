package LeetCode.Sort;

import java.util.Arrays;

public class bubbleSort {

public static int[]  bubbleSort(int [] arr){

   int temp;
   for(int i =0 ; i < arr.length-1;i++){
       for(int j=0;j<arr.length-1;j++) {
           if (arr[j] > arr[j + 1]) {
               temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
           }
       }
    }

    return arr;
}


    public static int[]  bubbleSortIsSorted(int [] arr){

        int temp;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        isSorted = false;
                    }
            }
        }

        return arr;
    }

    public static int[]  OptimizationbubbleSortIsSorted(int [] arr){

        int temp;
        boolean isSorted = false;
        int lastUnsorted = arr.length-1;
        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < lastUnsorted; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
        return arr;
    }
    public static int [] sortedArr(int [] arr){

        // After pushing the maximum element to the end, check all the first elements again
        // to ensure the sorting process continues
        int k=0;
        while(k < arr.length) {
            for (int i = k; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    System.out.println("************************");
                    System.out.println(Arrays.toString(arr));
                    System.out.println();

                }
            }
            k++;
        }
        return arr;
    }


    public static int[] sortedArrGpt(int[] arr) {
        int k = 0;
        while (k < arr.length) {
            for (int i = 0; i < arr.length - 1 - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    System.out.println("************************");
                    System.out.println(Arrays.toString(arr));
                    System.out.println();
                }
            }
            k++;
        }
        return arr;
    }
    static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }



    public static void main(String[] args) {

        int arr1[] = { 64, 34, 25, 12, 22, 11, 90 };

        int arr2[] = { 614, 34, 25, -12, 22, 11, 90 };
        int arr3[] = { 64, -34, 25, 12, 22, 111, 90 };

        int n = arr1.length;
       // sortedArrGpt(arr1);
       // System.out.println(Arrays.toString(arr1));
       /* bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("arr2 before sort:   "+Arrays.toString(arr2));
        bubbleSort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("arr3 before sort:   "+Arrays.toString(arr3));
        bubbleSort(arr3);
        System.out.println(Arrays.toString(arr3));*/

        OptimizationbubbleSortIsSorted(arr2);

        System.out.println("arr3 before sort:   "+Arrays.toString(arr3));
        bubbleSortIsSorted(arr3);
        System.out.println(Arrays.toString(arr3));

        //int [] arr ={6,0,3,5};
        //sortedArr(arr1);
       // System.out.println(Arrays.toString(arr1));

    }
}
