// PIVOT AND PARTITION
// DOESN'T TAKE EXTRA SPACE LIKE MERGE SORT
// IT'S AVERAGE CASE TIME COMPLEXITY IS SAME AS THAT OF MERGE SORT
// Avg case time complexity - O(nlogn)  worst case- O(n^2)
// Space complexity- O(1)

/* 1) Choose a pivot first of all 
    2) Do partition(parts) 
    elements < pivot -- aligned towards left of pivot
    elements > pivot -- aligned towards right of pivot
    3) Recursively call quicksort for sorting left & right part
    4) base case - single element - already sorted
*/


// Code

public class QuickSort{
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int si, int ei){
        // Base case
        if(si >= ei){
            return;
        }
        // partition fn will take pivot then will arrange smaller elements before pivot and larger elements after pivot
        // Then pivot will be placed at correct place and will return its index
        
        // last element
        int pidx = partition(arr,si,ei);
        quickSort(arr, si, pidx-1);   // left part
        quickSort(arr, pidx+1, ei);   // right part 
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];  // last element of array is pivot
        int i = si-1;   // to make place for elements smaller than pivot
        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){    // compare elements with pivot , if element is smaller than pivot make space for element and add it before pivot
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String args[]){
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}







soln2
    class Solution {
    static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }

    static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }
    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here.
        qs(arr, 0, arr.size() - 1);
        return arr;
    }
}
