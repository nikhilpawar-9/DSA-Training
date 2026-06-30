package day1;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num;
            num--;
        }
        System.out.println(sum);
    }
}
