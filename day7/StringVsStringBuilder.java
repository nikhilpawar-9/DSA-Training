package day7;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        String s = "";
        System.out.println("String Concate Started :");
        for (int i = 0; i < 500000; i++) {
            s = s + 'a';
        }
        System.out.println("String Concate Ended :");
        System.out.println();

        StringBuilder sb = new StringBuilder();
        System.out.println("StringBuilder Is Started");
        for (int i = 0; i < 500000; i++) {
            sb.append('a');
        }
        System.out.println("StringBuilder is Ended");
    }
}
