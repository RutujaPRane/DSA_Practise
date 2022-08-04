package LinearSearch;

public class MinNum {
    public static void main(String[] args) {
        int[] arr = {18,16,7,33,67,53};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
