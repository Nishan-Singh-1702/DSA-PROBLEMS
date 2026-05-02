package Strings;
// Problem:- First Unique character in a String.
// Given String s, find the first non-repeating character in it and return its index, if it does not exist return -1
// Example-1: "loveleetcode"
// output: 2

public class Problem_8 {
    static int firstUniqueCharacter(String s) {
        String str = s.toLowerCase();
        int[] freq = new int[26];
        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq[c - 'a']++;
        }

        // To print the frequency of each character.
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char ch = (char) (i + 'a');
                System.out.println(ch + " -> " + freq[i]);
            }
        }
        // Find first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (freq[c - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(firstUniqueCharacter("loveleetcode"));
    }
}
