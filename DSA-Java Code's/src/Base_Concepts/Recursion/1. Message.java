package Base_Concepts.Recursion;

class Message {
    
    // ? print Hello world 5 times using function without altering the function

    public static void main(String[] args) {

        // * approach 1:
        for(int i = 0; i<= 5; i++){
            message();
        }

        // * approach 2:
        message1();
        
    }

    public static void message(){
        System.out.println("Hello world");
    }

    public static void message1(){
        System.out.println("Hello world");
        message2();
    }

    public static void message2(){
        System.out.println("Hello world");
        message3();
    }

    public static void message3(){
        System.out.println("Hello world");
        message4();
    }

    public static void message4(){
        System.out.println("Hello world");
        message5();
    }

    public static void message5(){
        System.out.println("Hello world");
    }
}
