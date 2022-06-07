package PracticePrograms;

import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {
        int n=1,sum = 0;
        Scanner sc = new Scanner(System.in);
        while(n>0){
            System.out.println("Enter a number");
                n = sc.nextInt();
            sum = sum+n;
            }
        if(n==0) {
            System.out.println(sum);
        }
    }
}

