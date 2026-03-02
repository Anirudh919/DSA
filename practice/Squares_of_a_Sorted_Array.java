package practice;

import java.util.Scanner;

public class Squares_of_a_Sorted_Array {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        ascending_arr(arr);
    }

    public static void ascending_arr(int[] arr){
        int num = arr.length;
        int[] arr2 = new int[num];
        for(int i=0;i<num;i++){
            arr2[i]=Square(arr[i]);
        }
        for(int j=0;j<num;j++){
            for(int k=0;k<num;k++){
                if(arr2[j]<arr2[k]){
                    int temp = arr2[j];
                    arr2[j]=arr2[k];
                    arr2[k]=temp;
                }
            }
        }
        for(int i=0;i<num;i++){
            System.out.print(arr2[i]+" ");
        }
    }
    public static int Square(int num){
        return num*num;
    }
}
