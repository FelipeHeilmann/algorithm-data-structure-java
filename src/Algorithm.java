import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {
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

        //int[] array = {9,1,8,2,7,3,6,4,5};
        //bubbleSort(array);
        //for(int i : array){
        //System.out.print(i);
        //}
        //}

        // selection sort = search through an array and keep track of the minimum value during each interaction. At the
        //                  end of each iteration, we swap variables

        //                  Quadratic time O(n²)
        //                  small data set = okay
        //                  large data set = BAD

        //    int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};
        //    selectionSort(array);
        //    for(int i : array){
        //        System.out.print(i);
        //    }

        // insertion sort = after comparing elements to the left, shift elements to the right to make room to insert a
        //                  value
        //                  Quadratic time O(n²)
        //                  small data set = decent
        //                  large data set = BAD
        //                  less steps than bubble sort
        //                  best case is O(n) compared to selection sort O(n²)

        //  int[] array = {9,1,8,2,7,3,6,5,4};
        //  insertionSort(array);
        //  for(int i : array){
        //    System.out.print(i + " ");
        //}

        // merge sort = recursively divide array in 2, sort, re-combine
        //
        //              run time complexity: Quasilinear time O(n log(n))
        //              space complexity: linear O(n)

        //int[] array={8,2,5,3,4,7,6,1};
        //mergeSort(array);
        //for(int i : array){
        //    System.out.println(i + " ");
        //}

        // quick sort = moves smaller elements to the left of a pivot.
        //              recursively divide array in 2 partitions

        //              run time complexity = Best case O(n log(n))
        //                                    Average case O(n log(n))
        //                                    Worst case O(n²) if already sorted
        //              space complexity = O(log(n)) due to recursion


        int[] array={8,2,5,3,4,7,6,1};
        quickSort(array, 0, array.length-1);
        for(int i : array){
            System.out.println(i + " ");
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
    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int min = i;
            for(int j = i+1; j <array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i]  = array[min];
            array[min] = temp;
        }
    }
    private static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;

        }
    }

    private static void mergeSort(int[] array){
        int length = array.length;
        if(length <= 1){
            return; // base case
        }
        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length-middle];

        int i = 0; // left array
        int j = 0; // right array

        for(;i < length; i ++ ){
            if(i < middle){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        int i = 0, left = 0, right = 0;

        while (left < leftSize && right < rightSize){
            if(leftArray[left] < rightArray[right]){
                array[i] = leftArray[left];
                i++;
                left++;
            }
            else{
                array[i] = rightArray[right];
                i++;
                right++;
            }
        }
        while(left < leftSize){
            array[i] = leftArray[left];
            i++;
            left++;
        }
        while (rightSize < rightSize){
            array[i] = rightArray[right];
            i++;
            right++;
        }
    }

    private static void quickSort(int[] array, int start, int end){
        if(end <=start){
            return; // base case
        }
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot-1);
        quickSort(array, pivot+1, end);
    }

    private static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start-1;
        for(int j = start; j <=end-1; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i]= array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i]= array[end];
        array[end] = temp;
        return i;
    }

}
