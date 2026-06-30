package day1.practiceQuestion;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three number :");
        int n = sc.nextInt();
        int num = n;

        int reverse = 0;
        while (n > 0){
            int last = n % 10;
            reverse = reverse * 10 + last;
            n /= 10;
        }
        if(num == reverse){
            System.out.println(reverse + " " + "is a Palindrome Number");
        }
        else {

        }
    }
}
