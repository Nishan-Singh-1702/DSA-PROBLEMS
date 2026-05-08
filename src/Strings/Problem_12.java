package Strings;
// Longest Common Prefix: Write a  function to find the longest common prefix string among an array of the Strings.
// If there is no common prefix return an empty String "".

// Example: Input str: ["flower", "flow", "flight"]
// Output: "fl"

import java.util.Arrays;

public class Problem_12 {
    public static String longestPrefix(String[] str){
        Arrays.sort(str);
        String str1 = str[0];
        String str2 = str[str.length-1];
        int index = 0;
        while(index<str1.length() && index<str2.length()){
            if(str1.charAt(index)==str2.charAt(index)){
                index++;
            }
            else {
                break;
            }
        }
        return index == 0?"" :str1.substring(0,index);

    }

    public static void main(String[] args) {
        String [] str = {"flower","flow","flight"};
        System.out.println(longestPrefix(str));
    }
}
