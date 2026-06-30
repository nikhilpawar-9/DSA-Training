package day1.practiceQuestion;

import java.util.Scanner;

public class AvgOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers will you insert to calculate avg");
        int n = sc.nextInt();
        System.out.println("Enter the numbers to find average :");

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Average of numbers is :" +average(arr) );
    }
    static int average(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
