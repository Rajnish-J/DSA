package Concepts.array.Operations;
import java.util.Arrays;
import java.util.Scanner;

/* 

! Pseudo code:

insert(index:3, value:18)
    if size < capacity
        for (j=size; j < index; j--)
            arr[j] == arr[j-1]
        arr[index] = value
        size ++
    else
        return -1

    ? Finding the size from the array is manual logic there is no functions to do this

*/

public class InsertingAnElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int size = 0; // ? variable to find the size in the run time
        arr[size++] = 1;
        arr[size++] = 2;
        arr[size++] = 3;
        arr[size++] = 4;

        // ? Here I want to add an value 18 in the 2nd Index
        System.out.print("Enter the index: ");
        int index = sc.nextInt();

        System.out.print("Enter the value to insert: ");
        int value = sc.nextInt();

        System.out.println(customInsert(arr, size, index, value));

        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    public static String customInsert(int[] array, int size, int index, int value){
        int capacity = array.length;

        // ? space checking case to perform the operation
        if(size >= capacity){
            return ("Array is full, Cannot insert here" + size);
        }

        // ? Invalid indexing case
        if (index < 0 || index > size){
            return ("There are no index number with index number " + index);
        }

        // ? Inserting Operations
        if(size < capacity){
            for (int j = size; j < index; j--){
                array[j] = array[j-1];
            }
            array[index] = value;
            size++;
            return "Value Inserted";
        }
        else{
            return "Failed to Insert";
        }
    }
}
