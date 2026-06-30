package day1.practiceQuestion;

import java.util.Scanner;

public class LastDigitOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        int last = n % 10;
        System.out.println("The Last number is "+last);
    }
}
