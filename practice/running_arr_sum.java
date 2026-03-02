package practice;

import java.util.Scanner;

public class running_arr_sum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        running_sum(arr);
    }

    public static void running_sum(int[] arr){
        int num = arr.length;
        int[] arr2 =new int[num];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum +=arr[j];
                arr2[i] = sum;
            }
        }
        for(int j=0;j<arr2.length;j++){
            System.out.print(arr2[j]+" ");
        }
    }

}
