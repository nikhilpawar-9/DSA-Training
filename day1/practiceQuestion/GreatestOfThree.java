package day1.practiceQuestion;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three number :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println("The greatest number is :" +n1);
        } else if(n2 > n1 && n2 > n3) {
            System.out.println("The greatest number is :" +n2);
        }
        else {
            System.out.println("The greatest number is :" +n3);
        }
    }
}
