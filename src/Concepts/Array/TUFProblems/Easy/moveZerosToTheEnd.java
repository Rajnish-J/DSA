package Concepts.array.TUFProblems.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class moveZerosToTheEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1, 0 };
        System.out.println("Brute Force: " + Arrays.toString(bruteForce(arr)));
        System.out.println("optimal solution: " + Arrays.toString(OptimalSolution(arr)));
    }

    public static int[] bruteForce(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        int tempLength = temp.size();
        for (int i = 0; i < tempLength; i++) {
            arr[i] = temp.get(i);
        }

        for (int i = tempLength; i < len; i++) {
            arr[i] = 0;
        }
        return arr;
    }

    public static int[] OptimalSolution(int[] arr) {
        int len = arr.length;
        int j = -1;

        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                j = i;
                break;  
            }
        }
        if (j == 1){
            return arr;
        }

        for(int i = j+1; i<len; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}