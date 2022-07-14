package PracticePrograms;

import java.util.Scanner;

public class DifferenceOfProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        int product = 1;
        int sum = 0;
        while (n > 0) {
            product= product *(n % 10);
            sum = sum + (n % 10);
            n = n / 10;
        }
        System.out.println(product-sum);
    }
}
