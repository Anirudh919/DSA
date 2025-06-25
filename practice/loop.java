package practice;

import java.util.Scanner;

public class loop {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
//        int sum=0;
//
//        int n=s.nextInt();
//        int i=1;
//        while(i<=n){
//            sum+=i;
////            System.out.println(i);
//            i++;
//        }
//        System.out.println(sum);
        System.out.print("Enter the number of do u want to print :");
        int n=s.nextInt();
//        int i=0;
//        while(i<n){
//            System.out.print("*\t");
//            i++;
//        }
//        int i=0;
//        while(i<2){
//            int j=0;
//            while(j<n){
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
        int i=0;
        while(i<n){
            int j =0;
            while(j<n){
                System.out.print("*\t");
                j++;
            }
            System.out.println();
         i++;
        }
    }
}
