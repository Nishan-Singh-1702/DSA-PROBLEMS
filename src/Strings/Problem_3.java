package Strings;
// Reverse Words in a String, (Given an input String S,  reverse the order of the words).
// Input S = "the sky is blue"
// Output = "blue is sky the"

// Input S = "   a good    example    "
// Output = "example good a"

// Note: S may contain the leading and tailing spaces or more spaces in between the words,
// but we have to return the words with single space

public class Problem_3 {
    static String reverseWordsInString(String s){
        String [] words = s.split(" +"); // it could be any number of spaces
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1; i>=0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWordsInString("  the sky   is blue"));
    }
}
