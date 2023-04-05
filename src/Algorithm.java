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

        int[] array = {9,1,8,2,7,3,6,4,5};

        int index = linearSearch(array, 10);
        if(index != -1){
            System.out.println("Element found at index: " + index);
        }
        else {
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
}
