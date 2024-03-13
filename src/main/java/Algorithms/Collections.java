package Algorithms;

import java.util.Arrays;
import java.util.HashSet;

public class Collections {

    public static int [] findPairs(int sum, int[]arr){
        int result=0;
        int [] resultArr = {0,0};
        int size = arr.length;
        for (int i = 0; i < size ; i++){
            for (int j=1; j<size;j++){
                result=arr[i]+arr[j];
                if((result == sum) & (i != j) ){
                    resultArr[0]=i;
                    resultArr[1]=j;
                    return resultArr;
                }else{
                    result=0;
                }

            }
        }
        System.out.println("no pairs equal to " +sum);
        return resultArr;
    }

    public static boolean hasPairWithSum(int[] data, int sum) {
        int low = 0;
        int high = data.length - 1;

        while (low < high) {
            int s = data[low] + data[high];
            if (s == sum) {
                return true;
            } else if (s < sum) {
                low++;
            } else {
                high--;
            }
        }

        return false;
    }


    public static boolean hasPairWithSum1(int[] data, int sum) {
        HashSet<Integer> comp = new HashSet<>(); // complements
        for (int value : data) {
            if (comp.contains(value)) {
                return true;
            }
            comp.add(sum - value);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr1[]={1,2,3,9};
        int sum1 = 8;
        int sum2 = 8;
        int arr2[]={1,2,4,4};
        int arr3[]={2,2,6,9};
        int arr4[]={2,2,5,3};

     //   int [] ans =new int[2];
       // ans = findPairs(sum1,arr4);
       // String arrayAsString = Arrays.toString(ans);
       // System.out.println("Array: " + arrayAsString);

       // int[] data = { 1, 2, 4, 4 };
       // int targetSum = 8;

       // boolean hasPair = hasPairWithSum(data, targetSum);
        //System.out.println("Has pair with sum " + targetSum + ": " + hasPair);

        int[] data = { 1, 2, 3, 4, 4 };
        int sum = 8;
        boolean result = hasPairWithSum1(data, sum);
        System.out.println("Has pair with sum: " + result);



    }


}/*
bool HasPairWithSum(const vector<int>& data, int sum){
    int low=0;
    int high= data.size()-1;
    while(low < high){
        int s = data[low] + data[high];
        if(s==sum) return true;
    }
}
 bool HasPairWithSum(const vectore<int>data, int sum){
        unorderd_set<int> comp;//complements
        for (int value : data){
            if(comp.find(value) != comp.end)
                return true;
            comp.add(sum-value);
        }
        return false;
    }
*/


