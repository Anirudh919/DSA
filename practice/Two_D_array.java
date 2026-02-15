package practice;

import java.util.Scanner;

public class Two_D_array {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int[][] arr = new int[row][col];
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = s.nextInt();
            }
        }
        display(arr);
    }

    public static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
