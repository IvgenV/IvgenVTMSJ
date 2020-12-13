package Lesson5;

import java.util.Locale;

public class Lesson5 {

    public static void main(String[] args){

        String string = "Ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab " +
                "illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam " +
                "voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui" +
                " ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, " +
                "consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam " +
                "aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum " +
                "iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum " +
                "fugiat quo voluptas nulla pariatur?";

        Count count = new Count();
        count.count(string,'v');
        System.out.println(count.count(string,'v'));
        System.out.println(count.countChar(string,'v'));
        System.out.println(count.countStartEnd(string,'s'));
        System.out.println(count.countPalindrome(string));
        System.out.println(count.firstPalindrome(string));

    }

    }

    class Count implements CountAble{

        @Override
        public int count(String string, char ch) {
            int count = 0;
            for (int i=0;i<string.length();i++){
                if(ch==string.charAt(i)){
                    count++;
                }
            }
            return count;
        }

        @Override
        public int countChar(String string,char ch){
            int count = 0;
            String [] words = string.split(" ");

            for (String str: words) {
                if(str.charAt(0)==' '){
                    break;
                }
                if(str.charAt(0)==ch){
                    count++;
                }
            }
            return count;
        }

        @Override
        public int countStartEnd(String string, char ch){
            int count = 0;
            String[] words = string.split(" ");
            for(String str:words){
                if(str.charAt(0)==ch&str.charAt(str.length()-1)==ch){
                    count++;
                }
            }
            return count;
        }

        @Override
        public int countPalindrome(String string) {

            int count=0;
            String[] words = string.split(" ");
            for (String word : words) {
                word =  word.replaceAll("[!-?]","");
                String reverseWord = new StringBuilder(word).reverse().toString();
                if (word.toLowerCase(Locale.ROOT).equals(reverseWord.toLowerCase(Locale.ROOT))) {
                    count++;
                }

            }
            return count;
        }

        @Override
        public String firstPalindrome(String string) {

            int firstPalindrome = 0;

            String[] words = string.split(" ");
            for(String word:words){
                word =  word.replaceAll("[!-?]","");
                String reverseWord = new StringBuilder(word).reverse().toString();
                if(word.toLowerCase(Locale.ROOT).equals(reverseWord.toLowerCase(Locale.ROOT))){
                    firstPalindrome++;
                    return word;
                }
                if(firstPalindrome==1){
                    break;
                }
            }

            return "Palindrome not found";
        }
}