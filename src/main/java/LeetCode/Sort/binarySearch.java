package LeetCode.Sort;

public class binarySearch {





public static boolean binaryRecursive(int [] arr, int x, int left, int right){
    if(left > right){
        return false;
    }
    int mid = left + ((right - left) / 2);
    if(arr[mid] == x ){
        return true;
    }else if ( x < arr[mid]){
        return binaryRecursive(arr,x,left,mid -1);
    }else{
        return binaryRecursive(arr,x,mid + 1, right);
    }

}

    public static int binarySearch1(int [] arr, int n){
        int found = -1;

        int mid = arr.length/2, right=arr.length-1, left=0;

        while(left <= right){
                mid = left + (right-left)/2;

            if(n == arr[mid]){
                return mid;
            }

            if( n > arr[mid]){
                left = mid + 1;
            }
            else if (n < arr[mid]){
             right = mid - 1 ;
            }

        }


        return found;
    }

    public  int binarySearch(int arr[], int left, int right, int x){

        // If the element is present at the
        // middle itself
        while( left <= right ){
            int mid =(left + right)/ 2;

            if(arr[mid] == x){
                return mid;
            }
            // If element is smaller than mid, then
            // it can only be present in left sub array
            // so we decrease our r pointer to mid - 1
        else if(arr[mid] > x){
            right = mid -1;
            }
            // Else the element can only be present
            // in right sub array
            // so we increase our l pointer to mid + 1
        else{
            left = mid +1;
            }
        }
        // We reach here when element is not present
        //  in array
        return -1;
    }

    public int binarySearchRecursive(int arr[], int l, int r, int x) {

        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;


            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            // Else the element can only be present
            // in right sub array
            return binarySearch(arr, mid + 1, r, x);
        }
        // We reach here when element is not present
        // in array
        return -1;
    }


    public static void main(String args[])
    {
        binarySearch ob = new binarySearch();
        binarySearch bs = new binarySearch();

        int arr[] = { 2, 5,8,12,16,23,38,56,72,91 };
   /*     int n = arr.length;
        int x = 23;
       // int result = ob.binarySearch(arr, 0, n - 1, x);
        int result1 = bs.binarySearchRecursive(arr, 0, n - 1, x);


        if (result1 == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                    + result1);*/
        System.out.println(binarySearch1(arr,72));
    }
}
