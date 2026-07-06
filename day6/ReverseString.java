package day6;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = scanner.nextLine();
        String ans[] = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = ans.length - 1; i >= 0; i--) {
            sb.append(ans[i]+" ");
        }
        System.out.println(sb);
    }
}
