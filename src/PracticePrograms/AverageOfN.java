package PracticePrograms;

import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        int  n,count = 1;
        float sum = 0,c,average;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth number");
        n = sc.nextInt();
        while (n>=count){
            System.out.println("Enter " +count+" number");
            c = sc.nextInt();
            sum = sum + c;
            count++;
        }
        average = sum/n;
        System.out.println("Average is "+average);
    }
}
