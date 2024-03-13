package LeetCode.Sort;

public class MergeSort {

public static  void merge( int [] arr, int left,int middle, int right){

    //first subarr is arr [left..middle]
    int n1 = middle - left +1;
    //second subarr is arr[m+1..right]
    int n2 = right - middle;


    //create temp arrays

    int L[] = new int[n1];
    int R[] = new int[n2];

    //copy data to temp arrays

    for(int i =0; i < n1; i++)
        L[i] = arr[left + i];
    for (int j=0; j<n2;j++)
        R[j]=arr[middle+1+j];

    int i = 0, j =0;
//initial index of merged subbarray
    int k = left;
    while( i < n1 && j < n2){
        if(L[i] <= R[j]){
            arr[k] =L[i];
            i++;
        }
        else{
            arr[k]=R[j];
            j++;
        }
        k++;
    }
// Copy remaining elements of L[] if any
    while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    }

    // Copy remaining elements of R[] if any
    while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
    }

   }


public void sort(int arr[] , int left, int right){

    if(right > left){
        int middle = (left + right)/2;
        // sort the first and second halves
        sort(arr,left,middle);
        sort(arr,middle+ 1, right);

        // Merge the sorted halves
        merge(arr, left, middle, right);

    }

}

    // A utility function to print array of size n
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[])
    {
        int arr1[] = { 12, 11, 13, 5, 6, 7 };
        int arr[] = { 1, 3, 5, 2, 4,6 };


        System.out.println("Given array is");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        printArray(arr);
    }


}
