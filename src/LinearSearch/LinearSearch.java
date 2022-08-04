package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] num = {1,12,13,19,3,45,55};
        int target = 1;
        int ans = LinearSearch(num,target);
        System.out.println(ans);


    }

    static int LinearSearch (int[] arr , int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }return -1;
    }
}
