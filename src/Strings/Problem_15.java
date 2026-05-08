package Strings;
// Isomorphic String: Given Two String s and t and determine whether they are Isomorphic
// Note: Two String s and t are Isomorphic if the character in s can be replaced to get t

// Example 1 Input : s= "egg", t= "add"
// Output: true

// Example 2 Input: s="foo", t="bar"
// Output: false
import java.util.HashMap;

public class Problem_15 {
    public static boolean isIsomorphic(String s, String t){
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i= 0; i<s.length(); i++){
            char key = s.charAt(i);
            char word = t.charAt(i);
            if(map1.containsKey(key) && !map1.get(key).equals(word)){
                return false;
            }
            if(map2.containsKey(word) && !map2.get(word).equals(key)){
                return false;
            }
            map1.put(key,word);
            map2.put(word,key);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo","bar"));
    }
}
