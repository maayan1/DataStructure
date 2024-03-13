package LeetCode.Array;

public class maximumSubArr {

    public static int maxSubArr1(int a[]){
        int size = a.length;
        int max_soFar = Integer.MIN_VALUE,max_ending_here=0;

        for(int i =0; i <size; i++){
            max_ending_here = max_ending_here + a[i];
            if(max_soFar  < max_ending_here)
                max_soFar = max_ending_here;
            if(max_ending_here < 0)
                max_ending_here =0;
        }
        return max_soFar;
    }



    public static int macSubArr2(int [] nums){

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for ( int num : nums){//for each num element iterate all nums array and do
            currentSum += num;

            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum =0;
            }
        }

        return maxSum;
    }

    //Given an integer array nums, find the
    //sub array with the largest sum, and return its sum.O(n)

    public static int maxSubArr(int [] nums){

        int maxSum =Integer.MIN_VALUE;
        int currentSum = 0;

        for ( int num : nums){
            currentSum += num;

            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if (currentSum < 0){
                currentSum = 0;
            }
        }


        return maxSum;
    }
    // Returns maximum sum in a subarray of size k.
    public static int maxSumWindow(int arr[], int n, int k)
    {
        // k must be smaller than n
        if (n < k)
        {
            System.out.println("Invalid");
            return -1;
        }

        // Compute sum of first window of size k
        int res = 0;
        for (int i=0; i<k; i++)
            res += arr[i];

        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int curr_sum = res;
        for (int i=k; i<n; i++)
        {
            curr_sum += arr[i] - arr[i-k];
            res = Math.max(res, curr_sum);
        }

        return res;
    }


    public static void main(String[] args) {
        maximumSubArr maximumSubArr = new maximumSubArr();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = maximumSubArr.maxSubArr(nums);
        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.println("*************************");
        int k=4, n=nums.length;
        int maxSum1 = maximumSubArr.maxSumWindow(nums,n,k);
        System.out.println("Maximum subarray sum: " + maxSum1);

    }
}
