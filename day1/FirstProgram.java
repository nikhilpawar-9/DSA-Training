package day1;

import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello...!");
        System.out.println("Enter your name : ");
        String name = sc.next();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println(name + " " +"Your age is :" +age);

        char first = name.charAt(0);
        System.out.println("Your Name start with :" +first);
    }
}
