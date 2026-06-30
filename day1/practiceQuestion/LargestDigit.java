package day1.practiceQuestion;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int number = n;

        int max = 0;
        while (n > 0){
            int num = n % 10;
            if(num > max) max = num;
            n /= 10;
        }
        System.out.println("The maximum Digit from"+" " +number+ " " + "is :"+max);
    }
}
