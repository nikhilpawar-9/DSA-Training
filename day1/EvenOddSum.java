package day1;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                evenSum += i;
            }
            else {
                oddSum += i;
            }
        }
        System.out.println("The Even Number Sum is :" +evenSum);
        System.out.println("The Odd Number Sum is :" +oddSum);

    }
}
