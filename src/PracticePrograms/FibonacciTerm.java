package PracticePrograms;

import java.util.Scanner;

public class FibonacciTerm {
    public static void main(String[] args) {
        int a = 0,b = 1,temp,n,count = 2;
        System.out.println("Enter the term");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(count<=n){
            temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
