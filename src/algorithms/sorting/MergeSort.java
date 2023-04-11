package algorithms.sorting;

public class MergeSort {
    public static void main(String[] args) {
        // merge sort = recursively divide array in 2, sort, re-combine
        //
        //              run time complexity: Quasilinear time O(n log(n))
        //              space complexity: linear O(n)

        int[] array={8,2,5,3,4,7,6,1};
        mergeSort(array);
        for(int i : array){
            System.out.println(i + " ");
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
}
