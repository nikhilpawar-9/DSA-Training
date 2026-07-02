package day4;

public class FreqCount {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,2,2,4,1};
//        int freq[] = new int[arr.length];

        int maxFreq = 0;
        int element = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > maxFreq){
                element = arr[i];
                maxFreq = count;
            }
        }
        System.out.println("The Frequent Number is"+" " +element+" " +"With The Count"+" " +maxFreq);

    }
}
