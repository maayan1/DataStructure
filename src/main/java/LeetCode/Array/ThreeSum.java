package LeetCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {


    public ArrayList<ArrayList<Integer>> ThreeSum(int[] arr) {
        ArrayList<ArrayList<Integer>> tripleResults = new ArrayList<ArrayList<Integer>>();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = i + 2; k < arr.length - 2; k++) {
                    if ((i != j) && (i != k) && (j != k)) {// I think it's a redundant line
                        if ((arr[i] + arr[j] + arr[k]) == 0) {
                            ArrayList<Integer> triple = new ArrayList<>();
                            triple.add(arr[i]);
                            triple.add(arr[j]);
                            triple.add(arr[k]);
                            tripleResults.add(triple);
                        }
                    }

                }
            }
        }


        return tripleResults;
    }






    public List<List<Integer>> threeSum1(int[] nums) {
        ArrayList<ArrayList<Integer>> tripleResults = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        ArrayList<Integer> triple = new ArrayList<>();
                        triple.add(nums[i]);
                        triple.add(nums[j]);
                        triple.add(nums[k]);
                        tripleResults.add(triple);
                    }
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>(tripleResults); // Correcting the data structure
        return result;
    }


    public ArrayList<ArrayList<Integer>> threeSum(int[] arr) {
        ArrayList<ArrayList<Integer>> tripleResults = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        ArrayList<Integer> triple = new ArrayList<>();
                        triple.add(arr[i]);
                        triple.add(arr[j]);
                        triple.add(arr[k]);
                        tripleResults.add(triple);
                    }
                }
            }
        }

        return tripleResults;
    }

    public List<List<Integer>> threeSum2(int[] nums) {// o(n^2)
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) { // Skip duplicates
                int left = i + 1, right = nums.length - 1;
                int target = -nums[i];

                while (left < right) {
                    if (nums[left] + nums[right] == target) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        // Skip duplicate numbers
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (nums[left] + nums[right] < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
       // int[] arr = {-1, 0, 1, 2, -1, -4};
      //  ThreeSum solution = new ThreeSum();
     //   ArrayList<ArrayList<Integer>> result = solution.ThreeSum(arr);
      //  System.out.println(result);

        int[] nums = {-1, 0, 1, 2, -1, -4};
        ThreeSum solution = new ThreeSum();
        List<List<Integer>> result = solution.threeSum2(nums);
        System.out.println(result);

    }
}