package Strings;
// Valid Palindrome: A phrase is a palindrome, if after converting all the uppercase letter into lowercase letters and removing all non-alphanumeric
// characters, it read the same forward and backward. Alphanumeric character include letters and numbers.

// Example 1 Input S: "A man, a plan, a canal: Panama"
// Output: true
//Explanation: amanaplanacanallpanama

public class Problem_11 {
    public static boolean isPalindrome(String s){
        String str = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a Plan, a canal: Panama"));
    }
}
