package day5;

public class Searching {
    public static void main(String[] args) {
        int arr[] = new int[]{-1,0,3,5,9,12};
        int target = 9;
        Search(arr, target);

    }
    static void Search(int arr[], int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                System.out.println("The Target is Present on Index :"+i);
            }
            if(arr[i] > target){
                System.out.println("The Upper Bound is :"+i);
            }
        }
    }
}
