package LeetCode.HashTable;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class arraySubsetArray {
    // return true if arr2[] is subset of arr1[]
    public static void main(String[] args) {

        int [] arr1 =  {11, 1, 13, 21, 3, 7};
        int [] arr2 = {11, 3, 7, 1};
       // System.out.println(isSubsetFound(arr1,arr2));
        System.out.println(isSubsetBinary(arr1,arr2));


    }
    //naive solution----------------------------
    public static boolean isSubsetFound(int arr1[], int arr2[]){
        int i, j = 0;
        for (i = 0; j < arr2.length; i++){
            for ( j =0; j < arr1.length ; j++ ){
                if (arr2[i] == arr1[j])
                    break;
            }
            if(j == arr1.length){
                return false;
            }
        }/* If we reach here then all
        elements of arr2[] are present
        in arr1[] */
        return true;
    }
//-----------------------------------------------------------
    //find subset using sorting and binary search

    public static boolean isSubsetBinary(int arr1[], int arr2[]){
        int i = 0;
        sort(arr1, 0, arr1.length - 1);
        for (i = 0; i < arr2.length; i++) {
            if (binarySearch(arr1, 0, arr1.length - 1, arr2[i]) == -1)
                return false;
        }

        /* If we reach here then all elements of arr2[]
          are present in arr1[] */

        return true;
    }

    public static void sort(int arr[], int low, int high) {

        if (low < high) {
            /* pi is partitioning index, arr[pi] is
            now at right place */
            int pi = partition(arr, low, high);
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

        public static int partition(int arr[], int low, int high){

        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i +1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i +1;
        }


    /* FOLLOWING FUNCTIONS ARE ONLY
    FOR SEARCHING AND
     * SORTING PURPOSE */
    /* Standard Binary Search function*/
    static int binarySearch(int arr[], int low, int high,
                            int x)
    {
        if (high >= low) {
            /*low + (high - low)/2;*/
            int mid = (low + high) / 2;

            /* Check if arr[mid] is the first occurrence of
            x. arr[mid] is first occurrence if x is one of
            the following is true: (i)  mid == 0 and
            arr[mid] == x (ii) arr[mid-1] < x and arr[mid]
            == x
         */
            if ((mid == 0 || x > arr[mid - 1])
                    && (arr[mid] == x))
                return mid;
            else if (x > arr[mid])
                return binarySearch(arr, (mid + 1), high,
                        x);
            else
                return binarySearch(arr, low, (mid - 1), x);
        }
        return -1;
    }





//-------------------------------------------------------------------------------------------------------------------


    //naive solution
    //second solution - using map and contain function

    public static boolean isSunsetMap1(int arr1[], int arr2[]) {
        boolean rply = false;

        Map<Integer, int[]> map = new TreeMap<>();
        map.put(1,arr1);

        Iterator<Integer> iter = map.keySet().iterator();

        while(iter.hasNext()){
            Integer arrayName = iter.next();
            arr1 = map.get(arrayName);
            System.out.println(arrayName + ": ");
            for (int i = 0 ; i < arr1.length;i++){
                System.out.print( arr1[i]+", ");
            }
            System.out.println();
            System.out.println("---------------------");
        }
        System.out.print("defult result: ");

        System.out.println(map.containsValue(6));
        System.out.println();
        System.out.print("here: ");
       return rply;
    }


    public static boolean isSunsetMap(int arr1[], int arr2[]) {

        //time complexity O(m*n)

        boolean rply = false;

        Map<Integer, int[]> map = new TreeMap<>();
        map.put(1, arr1);

        // Iterate over the map values (arrays)
        for (int[] array : map.values()) {
            System.out.print("Array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ", ");
                // Check if the array contains the value 6
                if (array[i] == 7) {
                    rply = true;
                    break; // Exit the loop if we found a 6 in any array
                }
            }
            System.out.println();
            System.out.println("---------------------");
            if (rply) {
                break; // Exit the loop if we found a 6 in any array
            }
        }

        System.out.print("Result: ");
        System.out.println(rply);
        return rply;
    }


    //find subset using sorting and binary search



}
