package PracticePrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n,count = 0;
        System.out.println("Enter the num");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }

            }if(count==2){
            System.out.println("It's Prime");

        }else {
            System.out.println("Not Prime");
        }
    }
}
