package day1.practiceQuestion;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        int last = n % 10;

        while (n > 10){
            n /= 10;
        }
        int first = n;
        System.out.println("The sum of First and Last Digits is : " +(first + last));
    }
}
