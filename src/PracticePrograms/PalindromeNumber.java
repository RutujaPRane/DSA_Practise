package PracticePrograms;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n,ogn,r,s=0;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ogn = n;
        while (n>0){
            r = n%10;
            s = (s * 10) + r;
            n = n/10;
        }
        if(ogn == s){
            System.out.println("Is Palindrome");

        }else{
            System.out.println("Not Palindrome");
        }
    }
}
