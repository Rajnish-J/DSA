package DSA.Pattern;
import java.util.*;

class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("I am having 22 patterns for example so, Enter the number of pattern U need: ");
        int n = sc.nextInt();

        System.out.print("Enter the number for pattern printing: ");
        int size = sc.nextInt();
        
        switch (n) {
            case 1:
                patternOne(size);
                break;
        
            default:
                System.out.println("Pattern not available for the given number.");
                break;
        }

        sc.close();
    }

    public static void patternOne(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // public static void patternTwo(int N){
    //     for (int i = 0; i < N; i++){

    //     }
    // }

}