package Strings;
// Problem: Reverse Vowels of a String
// the vowels are 'a','e','i','o','u' and they can appear in both lower and upper cases and more than once.

// Example 1:- "hello"
// output:- "holle"

// Example 2:- "leetcode"
// output:- "leotcede"

public class Problem_9 {
    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }


    public static String reverseString(String str){
        char[] ch = str.toCharArray();
        int start = 0;
        int end = str.length()-1;

        while(start<end){
            if(!isVowel(ch[start])){
                start++;
            }
            else if(!isVowel(ch[end])){
                end--;
            }
            else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end]=temp;
                start++;
                end--;

            }
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
}
