package day1;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int number = n;

        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        if (sum == number) {
            System.out.println("The " + number + " "+ "is Armstrong Number:");
        } else {
            System.out.println("The " + number + " "+ "is NOT Armstrong Number:");
        }
    }
}
