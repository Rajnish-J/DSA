package Concepts.Array.Operations;

import java.util.Arrays;
import java.util.Scanner;

/*

! Pseudo code:

? use this before the array is full condition

resize()
    capacity = capacity * 2
    int[] newArray = new int[capacity]
    for(int i = 0; i < size; i++)
        newArray[i] = array[i]
    arr = newArray
    
? (The older array will be automationcally deleted by the garbage collector in java)

*/

public class ResizingArrayManually {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int size = 0;

        arr[size++] = 1;
        arr[size++] = 2;
        arr[size++] = 3;
        arr[size++] = 4;

        System.out.print("Enter the index: ");
        int index = sc.nextInt();

        System.out.print("Enter the value to insert: ");
        int value = sc.nextInt();

        // Insert with resizing support
        Result result = customInsert(arr, size, index, value);
        arr = result.array;
        size = result.size;

        System.out.println(result.message);
        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    static class Result {
        int[] array;
        int size;
        String message;

        Result(int[] array, int size, String message) {
            this.array = array;
            this.size = size;
            this.message = message;
        }
    }

    static int[] resize(int[] array) {
        int newCapacity = array.length * 2;
        int[] newArray = new int[newCapacity];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static Result customInsert(int[] array, int size, int index, int value) {
        if (index < 0 || index > size) {
            return new Result(array, size, "Invalid index: " + index);
        }

        if (size >= array.length) {
            array = resize(array);
        }

        for (int j = size; j > index; j--) {
            array[j] = array[j - 1];
        }

        array[index] = value;
        size++;

        return new Result(array, size, "Value inserted successfully");
    }
}
