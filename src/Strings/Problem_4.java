package Strings;
// Problem : Check whether a String is Palindrome String or not
// A String is called Palindrome string if the reverse of tha the string is same as the original string.
// example:- level, radar, rotor.


public class Problem_4 {
    static String palindromeString(String s){
        String str = s.toLowerCase();
        boolean isPalindrome = true;
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            return s+" is a palindrome String";
        }
        else {
            return s+" is not a palindrome String";
        }
    }

    public static void main(String[] args) {
        System.out.println(palindromeString("Radar"));
    }
}
