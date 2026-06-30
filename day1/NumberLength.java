package day1;

import java.util.Scanner;

public class NumberLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        long n = sc.nextLong();

        long count = 0;
        while (n > 0){
            n /= 10;
            count++;
        }
        System.out.println("The Number length is :" +count);
    }
}
