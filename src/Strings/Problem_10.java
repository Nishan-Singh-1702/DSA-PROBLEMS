package Strings;
// Given a pattern and String s,
// find is s follows the same pattern

// Example 1: pattern = "abba", s = "dog cat cat dog"
// Output : true

// Example 2: pattern = "abba", s = "dog cat cat fish"
// Output: false

import java.util.HashMap;

public class Problem_10 {
    public static boolean samePattern(String pattern, String s){
        String[] arr = s.split(" ");

        if(arr.length != pattern.length()){
            return false;
        }

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = arr[i];

            if(map1.containsKey(ch) && !map1.get(ch).equals(word)){
                return false;
            }

            if(map2.containsKey(word) && map2.get(word) != ch){
                return false;
            }

            map1.put(ch, word);
            map2.put(word, ch);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(samePattern("abba","cat boy boy apple"));
    }
}