package Strings;

import java.util.Arrays;

// Problem: Check if two Strings are Anagram or not
// Anagrams are the string having same characters with the same frequencies.
public class Problem_6 {
    static boolean anagramString(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        else {
            char[] charArray1 = s1.toCharArray();
            char[] charArray2 = s2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            if(Arrays.equals(charArray1,charArray2)){
                return true;
            }
            else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(anagramString("keep","peek"));
    }
}
