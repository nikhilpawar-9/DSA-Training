package day3;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to search from Array :");
        int num = sc.nextInt();
        System.out.println("The element is present at index :"+Search(num,arr));

    }
    static int Search(int num, int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
