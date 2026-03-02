package practice;

import java.util.Scanner;

public class sort_zeros_ones {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = s.nextInt();
        }
        seprate_zero_one(arr);
    }
    public static void seprate_zero_one(int[] arr){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int j=0;j<count;j++){
            System.out.print("0 ");
        }
        for(int k=count;k<arr.length;k++){
            System.out.print("1 ");
        }
    }
}
