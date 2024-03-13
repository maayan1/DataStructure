package LeetCode.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int indexes[]= new int[nums.length * nums.length];
        int k=0;
        Map<Integer, Integer> numToIndexMap = new HashMap<>();

        for (int i=0; i <nums.length;i++){
            for (int j=1;j<nums.length;j++){
                if(nums[i]+nums[j] == target) {
                    indexes[k] = i;
                    indexes[k + 1] = j;
                    k++;
                    k++;
                }
            }

        }

        return indexes;
    }

    public static int[] twoSum2(int[] nums, int target) {
        // Create a map to store the numbers and their corresponding indices
        Map<Integer, Integer> numToIndexMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement is in the map
            if (numToIndexMap.containsKey(complement)) {
                // If yes, return the indices of the current number and its complement
                return new int[]{numToIndexMap.get(complement), i};
            }

            // If the complement is not in the map, add the current number to the map
            numToIndexMap.put(nums[i], i);
        }

        // If no solution is found, return an empty array or handle it according to your requirements.
        return new int[0];
    }


    public static void main(String[] args) {
        int []nums ={2,7,11};
        int target = 9;


        System.out.println("-------------------------------------------------------------");
        int [] indexes1 = twoSum2(nums,target);
        System.out.println("Indexes array contents: " + Arrays.toString(indexes1));
        System.out.println("-------------------------------------------------------------");
        int [] indexes = twoSum(nums,target);
        System.out.println("Indexes array contents: " + Arrays.toString(indexes));
    }


}
