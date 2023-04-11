package algorithms.searching;

public class BinarySearch {
    public static void main(String[] args) {
        // binary search = Search algorithm that finds the position of a target value within a sorted array.
        //                  Half of the array is eliminated during each "step"

        int[] array = new int[1000000];
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
