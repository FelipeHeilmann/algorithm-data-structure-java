import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args){
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

        int array[] = new int[1000000];
        int target = 777777;
        for(int i =0; i < array.length; i++){
            array[i] = i;
        }
        int index = binarySearch(array, target);
        if(index != -1){
            System.out.println("Element found at index : " + index);
        }
        else{
            System.out.println("Element not found");
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
}
