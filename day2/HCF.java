package day2;

import java.util.ArrayList;

public class HCF {
    public static void main(String[] args) {
        int n1 = 16;
        int n2 = 24;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i <= n1; i++) {
            if(n1 % i == 0){
                list1.add(i);
            }
        }

        for (int i = 1; i < n2; i++) {
            if(n2 % i == 0){
                list2.add(i);
            }
        }
        System.out.println("The HCF of "+n1+" "+ "and"+" "+n2);
        int hcf = 1;
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
               if (list1.get(i) == list2.get(j)){
                   hcf = Math.max(hcf, list1.get(i));
               }
            }
        }
        System.out.println(hcf);
        System.out.println(list1);
        System.out.println(list2);
    }
}
