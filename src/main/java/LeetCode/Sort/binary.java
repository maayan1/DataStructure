package LeetCode.Sort;

public class binary {

    public static boolean binarySearchRecur(int [] arr, int x, int left, int right){
        if (left > right){
            return false;
        }
        int mid =left +((left + right))/2;
        if(arr[mid] == x){
            return true;
        } else if (x <arr[mid]) {
            right=mid;
            return binarySearchRecur(arr,x,left,mid-1);
        } else {
            return binarySearchRecur(arr,x,mid+1,right);
        }


    }

    public static boolean binarySearchRecur(int [] arr, int x){
        return binarySearchRecur(arr, x, 0,arr.length-1);
    }
}
