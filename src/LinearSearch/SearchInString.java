package LinearSearch;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Rutuja";
        char target = 'u';
//        System.out.println(search(name , target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static Boolean search2(String str, char target){

        if (str.length() == 0){
            return false;
        }
        for (char ch :str.toCharArray()) {
            if (ch == target){
                return true;

        }
        }return false;
    }
    static Boolean search(String str, char target){

            if (str.length() == 0){
                return false;
            }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }return false;
    }
}
