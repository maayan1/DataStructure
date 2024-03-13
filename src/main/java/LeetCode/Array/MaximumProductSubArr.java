package LeetCode.Array;

public class MaximumProductSubArr {


    //o(n^2)

    public static int maxSubProductArr(int arr[]) {
        // init result
        int result = arr[0];
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int mull = arr[i];
            for (int j = i + 1; j < n; j++) {
             //   result = Math.max(result, mull);
                mull *= arr[j];
            }
        }
        return result;
    }

//O(N)


    static int maxSubarrayProduct(int arr[], int n)
    {

        // max positive product
        // ending at the current position
        int max_ending_here = arr[0];

        // min negative product ending
        // at the current position
        int min_ending_here = arr[0];

        // Initialize overall max product
        int max_so_far = arr[0];

        // /* Traverse through the array.
        // the maximum product subarray ending at an index
        // will be the maximum of the element itself,
        // the product of element and max product ending
        // previously and the min product ending previously.
        // */
        for (int i = 1; i < n; i++) {
        //    int temp = Math.max(
                 //   Math.max(arr[i], arr[i] * max_ending_here),
                //    arr[i] * min_ending_here);
         //   min_ending_here = Math.min(
              //      Math.min(arr[i], arr[i] * max_ending_here),
             //       arr[i] * min_ending_here);
       //     max_ending_here = temp;
        //    max_so_far
             //       = Math.max(max_so_far, max_ending_here);
        }

        return max_so_far;
    }

 //   public static void main(String[] args)
    {
        int arr[] = { 1, -2, -3, 0, 7, -8, -2 };
    //    System.out.println("Maximum Sub array product is "
      //          + maxSubProductArr(arr));
    //    System.out.println("***********************************");
        int n = arr.length;
    //    System.out.printf("Maximum Sub array product is %d",
       //        + maxSubarrayProduct(arr, n));
    }
}



