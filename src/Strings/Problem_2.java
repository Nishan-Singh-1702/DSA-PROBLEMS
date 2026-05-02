package Strings;
// Problem:- Find the Index of the first Occurrence in a String, Given two String haystack and needle
// return the index of first occurrence of needle in haystack, or -1 if needle is not the part of haystack;

// Example:- haystack = "sadbutsad"    needle = "sad"
// Output = 0
// Explanation - "sad" occur at index 0 and 6 in haystack that's why we return 0;
public class Problem_2 {
    static int indexOfFirstOccurrence(String haystack, String needle){
        for(int i = 0; i<haystack.length()-needle.length()+1; i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(indexOfFirstOccurrence("sadbutsad","sad"));
    }
}
