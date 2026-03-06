package practice;

import java.util.Scanner;

public class Arrays_Insertion_Sort {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        Insertion_sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
}

public static void Insertion_sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int picked = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>picked){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]=picked;
        }
}
}
