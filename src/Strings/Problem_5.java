package Strings;
// Problem: Count total number of characters in a String
// Example: "Hello Java" has 9 character, basically we have to count only the characters and ignore the spaces.


public class Problem_5 {
    static void countCharacter(String str){
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        countCharacter("Hello Java");
    }
}
