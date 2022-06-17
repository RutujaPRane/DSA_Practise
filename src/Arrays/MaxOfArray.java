package Arrays;

import static jdk.nashorn.internal.objects.NativeMath.max;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = {3,34,344,456,65,500};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,5));
    }

    static int maxRange(int[] arr,int start,int end) {
        if(start > end){
            return -1;
        }
        if (arr == null){
            return -1;
        }
        int maxval = start;
        for (int i = start; i < end; i++) {
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }

    static int max(int[] arr){
        if (arr.length == 0){
            return -1;
        }
       int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

}
