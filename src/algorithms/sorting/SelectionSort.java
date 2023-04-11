package algorithms.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        // selection sort = search through an array and keep track of the minimum value during each interaction. At the
        //                  end of each iteration, we swap variables

        //                  Quadratic time O(n²)
        //                  small data set = okay
        //                  large data set = BAD

        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};
        selectionSort(array);
        for(int i : array){
            System.out.print(i);
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
}
