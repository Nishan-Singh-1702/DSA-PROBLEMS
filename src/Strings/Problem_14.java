package Strings;
// Valid Anagram: Given two String s and t, return true if t is anagram of s, and false otherwise

// Example:1 Input s = "anagram", t = "nagaram"
// Output: true

//Example: 2 Input s = "rat", t = "car"
// output:false

public class Problem_14 {
    public static boolean isAnagram(String s, String t){
        int[] arr1 = new int[26];

        if(s.length()!=t.length()){
            return false;
        }

        for(int i = 0; i<s.length(); i++){
            arr1[s.charAt(i)-'a']++;
            arr1[t.charAt(i)-'a']--;
        }
        for(int count : arr1){
            if(count!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagrqm", "nagaram"));
    }
}
