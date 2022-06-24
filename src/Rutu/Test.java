package Rutu;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n,a = 0,b = 1,tem,count = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth term");
        n = sc.nextInt();
        while(count<=n){
            System.out.println(a+" ");
            tem = a+b;
            a=b;
            b=tem;
            count++;
        }
        System.out.println();
    }
}
