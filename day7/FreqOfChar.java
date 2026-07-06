package day7;

import java.util.HashMap;

public class FreqOfChar {
    public static void main(String[] args) {
        String s = "abcaabbaabbccddeeffa";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch , 0) + 1);
        }

        for(char ch : map.keySet()){
            System.out.println(ch +":" + map.get(ch));
        }
    }
}
