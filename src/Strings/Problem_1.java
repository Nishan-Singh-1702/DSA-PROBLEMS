package Strings;
// Problem - Length of the last word

// Example - 1: "Hello World"
// Answer - 5 (World has 55 characters).

//Example - 2:  "   fly me   to  the moon   "
//Answer - 4 (moon has 4 charters)


public class Problem_1 {
    static int lengthOfLastWord(String s){
        String str = s.trim();
        int count = 0;
        for(int i = str.length()-1; i>=0; i--){
            if(str.charAt(i)!=' '){
               count++;
            }
            else break;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("  fly   to the  moon   "));
    }
}
