package Lesson7;

import java.util.Locale;

public class TextFormater {

    public static boolean countWordInLine(String str) {
        int count = 0;
        String[] words = str.split(" ");
        for (String word : words) {
            word = word.replaceAll("[0-:]", "");
            if (word.equals("")) {

            } else {
                count++;
            }
        }
        return count >= 3 & count <= 5;
    }

    public static boolean palindrome(String str) {
        String[] words = str.split(" ");
        boolean isPalindrome = false;
        for (String word : words) {
            word = word.replaceAll("[!-:]", "");
            String reverseWords = new StringBuilder(word).reverse().toString();
            if ( word.equals("")||word.length()==1) {

            }else if(word.toLowerCase(Locale.ROOT).equals(reverseWords.toLowerCase(Locale.ROOT))){
                    isPalindrome = true;
                    break;
            }
        }
        return isPalindrome;
    }
}
