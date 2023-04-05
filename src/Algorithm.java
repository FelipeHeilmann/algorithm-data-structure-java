import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args){
        //***************************Searching algorithms***************************
        // linear search iterate through a collection one element at time

        // run time complexity: O(n)

        // Disadvantages:
        //  slow for large data sets

        // Advantages:
        //  Fast for searches of small to medium data sets
        //  Does not need to sorted
        //  Useful for data structures that do not have random access (linkedList)

        //int[] array = {9,1,8,2,7,3,6,4,5};

        //int index = linearSearch(array, 10);
        //if(index != -1){
            //System.out.println("Element found at index: " + index);
        //}
        //else {
            //System.out.println("Element not found");
        //}



        // binary search = Search algorithm that finds the position of a target value within a sorted array.
        //                  Half of the array is eliminated during each "step"

        //int[] array = new int[1000000];
        //int target = 777777;
        //for(int i =0; i < array.length; i++){
        //    array[i] = i;
        //}
        //int index = binarySearch(array, target);
        //if(index != -1){
        //    System.out.println("Element found at index : " + index);
        //}
        //else{
        //    System.out.println("Element not found");
        //}



        // interpolation search = improvement over binary search best used for "uniformly" distributed data "guesses"
        //                        where a value might be based on calculated probes results
        //                        if probe is incorrect, search area is narrowed, and a new probe is calculated

        //                        average case: O(log(log(n)))
        //                        worst case: O(n) [values increase exponentially]

        //int[] array = {1,2,4,6,8,10,12,14,16,18,20};
        //int index =  interpolationSearch(array, 8);
        //if(index != -1){
        //    System.out.println("Element found at index: " + index);
        //}
        //else{
        //    System.out.println("Element not found");
        //}

        //***************************Sorting algorithms***************************
        // bubble sort = pair of adjacent elements are compared, and the elements
        //               swapped if they are not in order

        //               Quadratic time O(n²)
        //               small data set = okay-ish
        //               large data set = bad

        int[] array = {9,1,8,2,7,3,6,4,5};
        bubbleSort(array);
        for(int i : array){
            System.out.print(i);
        }
    }


    private static int linearSearch(int[] arr, int value){
        for(int i = 0; i < arr.length; i++ ){
            if(arr[i] == value){
                return i;
            }
        }
        return  -1;
    }
    private static int binarySearch(int arr[], int target){
       int low = 0;
       int high = arr.length-1;

       while(low <= high){
           int middle = low + (high- low)/2;
           int value = arr[middle];
           System.out.println("middle: " + value);
           if(value < target){
               low = middle + 1;
           }
           else if(value > target){
               high = middle - 1;
           }
           else{
               return  middle;
           }
       }
       return 0;
    }
    private static int interpolationSearch(int[] array, int value) {
        int high = array.length-1;
        int low = 0;

        //search area
        while(value >= array[low] && value <= array[high] && low<= high){
            int probe = low + (high-low) * (value-array[low]) / (array[high] - array[low]);
            System.out.println("probe: " + probe);

            if(array[probe] == value){
                return probe;
            }
            else if(array[probe] < value){
                low = probe + 1;
            }
            else{
                high = probe -1;
            }
        }
        return -1;
    }

    public static void bubbleSort(int[] array){
        for (int i =0; i < array.length-1; i++){
            for (int j = 0; j < array.length - i - 1; j++ ){
                   if(array[j] > array[j+1]){
                       int temp = array[j];
                       array[j] = array[j+1];
                       array[j+1] = temp;
                   }
            }
        }
    }
}
