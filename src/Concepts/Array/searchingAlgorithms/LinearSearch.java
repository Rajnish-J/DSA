package Concepts.array.searchingAlgorithms;

import java.util.Scanner;

/* 

! Pseudo code

search(element: 18)
    for (0; arr.length; i++)
        if (index == arr[index])
            return index
    
    return -1

*/

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 80, 11, 10, 44, 62, 56, 49, 100, 15, 22, 75, 90, 86,
                67, 58, 63, 33, 22, 91, 67 };

        // ? Give me the value to find value from the array
        System.out.print("Enter the Value: ");
        int value = sc.nextInt();

        System.out.println(linearSearch(value, arr));

        sc.close();
    }

    public static int linearSearch(int value, int[] arr) {

        for (int index = 0; index < arr.length; index++) {
            if (value == arr[index]) {
                return index;
            }
        }
        return -1;
    }
}
