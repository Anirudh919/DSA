package practice;

import java.util.Scanner;

public class inverse_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = s.nextInt();
        }
        Inverse_of_an_array(arr);
    }

    public static void Inverse_of_an_array(int[] arr) {
        int[] arr2 = new int[arr.length];
        int place = 1;
        for (int i = arr.length - 1; i > 0; i--) {
            arr2[place] = arr[i];
            place++;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
