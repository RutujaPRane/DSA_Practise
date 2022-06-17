package Arrays;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int[] arr = {3,5,77,876,777,98};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void change(int[] arr) {
        arr[1] = 67;
    }
}
