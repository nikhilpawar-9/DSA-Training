package day1.practiceQuestion;

import java.util.Scanner;

public class DigitPresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int number = num;
        System.out.println("Enter the digit to check present or not :");
        int n = sc.nextInt();

        while (num > 0){
            int digit = num % 10;
            if(digit == n) System.out.println(n + " " +"Is present in the Number :" +number);
            num /= 10;
        }

    }
}
