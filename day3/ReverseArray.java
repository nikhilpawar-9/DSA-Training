package day3;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l = 0;
        int r = arr.length - 1;
        while (l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        System.out.println("The reverse array is : ");
        for (int num : arr){
            System.out.print(num+" ");
        }
    }
}
