package day6;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "racecar";
        int l = 0;
        int r = s.length() - 1;

        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                System.out.println("False");
            }
            l++;
            r--;
        }
        System.out.println("True");
    }
}
