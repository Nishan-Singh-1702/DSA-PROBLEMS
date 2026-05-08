package Strings;

import java.util.HashMap;

public class practise {
    public static void main(String[] args) {
        HashMap<Character, Character> map = new HashMap<>();

        map.put('a', 'b');
        map.put('b','c');
        map.put('c','d');

        System.out.println(map.equals('a'));
    }
}
