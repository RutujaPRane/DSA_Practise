package PracticePrograms;

import java.util.Scanner;

public class DiscountOfProducts {
    public static void main(String[] args) {
       float p,dr,d;
        float a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Price ");
        p = sc.nextInt();
        System.out.println("Enter Discount Rate ");
        dr = sc.nextInt();
        a = 100-dr;

        d = (a*p)/100;

        System.out.println(d);
    }
}
