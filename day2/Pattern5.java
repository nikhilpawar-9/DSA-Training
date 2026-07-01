package day2;

public class Pattern5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
//            Left stars
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
//            Middle -
            for (int k = 1; k <= 2 * (5 - i); k++) {
                System.out.print("-");
            }
//            Right star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
