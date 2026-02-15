package practice;

import java.util.Scanner;

public class Two_D_array_01 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = s.nextInt();
            }
        }
        display(arr);
    }
    public static void display(int[][] arr){
        for(int col=0;col<arr[0].length;col++){
            if(col%2==0){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][col]+" ");
                }
            }else {
                for(int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i][col]+" ");
                }
            }

        }
    }
}
