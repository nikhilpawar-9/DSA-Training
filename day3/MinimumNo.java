package day3;

import java.util.Scanner;

public class MinimumNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int num : arr){
            if(num < min){
                min = num;
            }
        }
        System.out.println("The Minimum number is :"+" " +min);
    }

}
