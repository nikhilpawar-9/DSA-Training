package day1.practiceQuestion;

import java.util.Scanner;

public class MultiOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three number :");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x" +" "+i + " " + "=" +  n * i);
        }
    }
}
