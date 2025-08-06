package DSA.Array.Operations;
import java.util.Arrays;
import java.util.Scanner;

/*

! Pseudo code

delete(index: 3)
    if index < size
        for (j=index; j < size; j++)
            arr[j] = arr[j+1]
        size --
    else
        return -1

    ? Finding the size from the array is manual logic there is no functions to do this

*/

public class DeletingAnElementAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int size = 0; // ? variable to find the size in the run time
        arr[size++] = 1;
        arr[size++] = 2;
        arr[size++] = 3;
        arr[size++] = 4;

        // ? Give me the index to delete value from that index
        System.out.print("Enter the Index: ");
        int index = sc.nextInt();

        System.out.println(customDelete(index, arr, size));

        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    public static String customDelete(int index, int[] array, int size){

        // ? Invalid indexing case
        if (index < 0 || index > size){
            return ("There are no index number with index number " + index);
        }

        // ? Deleting Operation
        if (index < size){
            for (int j = index; j < size; j++){
                array[j] = array[j+1];
            }
            size --;
            return ("Delete Operation Succeded");
        }
        else{
            return ("Delete Operation Failed");
        }
    }
}
