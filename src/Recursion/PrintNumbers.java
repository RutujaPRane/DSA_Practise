package Recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        //print numbers till 1 to 5
        print(1);
    }
    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        //This is the tail recursion
        print(n + 1);
    }

}
