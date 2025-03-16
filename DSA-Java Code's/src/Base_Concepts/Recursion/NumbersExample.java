package Base_Concepts.Recursion;

public class NumbersExample {

    // ? Ask a number from user and print it using recursion
    // ? Restrictions:
    // * the function could be called once
    // * do not use any loop
    // ? Example: n = 5 => 1, 2, 3, 4, 5

    public static void main(String[] args) {
        print1(1);
        
    }

    public static void print1(int n){
        System.out.println(n);
        print2(2);
    }

    public static void print2(int n){
        System.out.println(n);
        print3(3);
    }

    public static void print3(int n){
        System.out.println(n);
        print4(4);
    }

    public static void print4(int n){
        System.out.println(n);
        print5(5);
    }

    public static void print5(int n){
        System.out.println(n);

    }
}