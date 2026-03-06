package practice;

import java.util.Scanner;

public class Arrays_Selection_Sort {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        Selecttion_sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void Selecttion_sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min_index =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
}
