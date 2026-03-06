package practice;

import java.util.Scanner;

public class Product_of_Array_Except_Self {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        product_arr(arr);
    }
    public static void product_arr(int[] arr){
        int[] arr2 = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int sum = 1;
            for(int j=i+1;j<arr.length;j++){
                 sum = sum*arr[j];
            }
            arr2[i] = sum;
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
