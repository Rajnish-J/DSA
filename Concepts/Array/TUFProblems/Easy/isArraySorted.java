package Concepts.Array.TUFProblems.Easy;

public class isArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,7,18};
        System.out.println(isSorted(arr) ? "The given array is sorted" : "The given array is not sorted");
    }

    public static boolean isSorted(int[] arr){
        for(int i = 1; i<arr.length ; i++){
            if(arr[i] > arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
