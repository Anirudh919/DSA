package practice;

import java.util.Scanner;

public class Arrays_Bubble_Sort {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = s.nextInt();
        }
        Bubble_sort(arr);
    }
        public static void Bubble_sort(int[] arr){
            for(int i=0;i<arr.length;i++){
                for(int j=i;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
}
