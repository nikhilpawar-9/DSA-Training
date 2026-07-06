package day7;

public class FreqOfChar2 {
    public static void main(String[] args) {
        String s = "aaabbccddffggyzxxggtyyzz";
        int freq[] = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            System.out.println((char) (i + 'a') +"=>" +freq[i]);
        }
    }
}
