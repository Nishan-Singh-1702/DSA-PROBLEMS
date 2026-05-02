package Strings;
// Problem: Reverse a String.
public class Problem_7 {
    static void reverseString1(String str){
        for(int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }

    static void reverseString2(String str2){
        StringBuilder sb = new StringBuilder();
        for(int i = str2.length()-1; i>=0; i--){
            sb.append(str2.charAt(i));
        }
        System.out.println(sb);
    }

    static void reverseString3(String str3){
        char[] ch = str3.toCharArray();
        for(int i = ch.length-1; i>=0; i--){
            System.out.print(ch[i]);
        }
    }

    public static void main(String[] args) {
        reverseString1("NISHAN");
        System.out.println();
        reverseString2("SINGH");
        reverseString3("TEJU");
    }
}
