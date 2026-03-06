package practice;

import java.util.Scanner;

public class Max_val_arr {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = s.nextInt();
        }
        System.out.print(Max_val(arr));
    }
    public static int Max_val(int[] arr){
        int max_val = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max_val){
                max_val=arr[i];
            }
        }
        return max_val;
    }
}
