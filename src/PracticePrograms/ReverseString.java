package PracticePrograms;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Rutuja",p="";
        char ch;
        System.out.println("Original string "+str);
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            p = ch + p;
        }
        System.out.println("Reversed string "+p);
    }
}
