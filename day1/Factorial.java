package day1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int num = n;
        int fact = 1;
        while(n > 0){
            fact *= n;
            n--;
        }
        System.out.println("The factorial of " +num +" "+ "is :" +fact);
    }
}
