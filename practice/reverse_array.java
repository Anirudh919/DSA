package practice;

import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
        arr[i] = s.nextInt();
        }

        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
