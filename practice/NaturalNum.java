package practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NaturalNum {
    public static void main(String[] args) {
//        int n = 10, sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum = sum + i; // add i instead of 1
//        }
//        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        Scanner s = new Scanner(System.in);
//        int p= s.nextInt();
//        int r=s.nextInt();
//        int t=s.nextInt();
//        int result = (p*r*t)/100;
//        System.out.print("Rate of interest :"+result);
//        System.out.print("Enter the value :");
//        int val = s.nextInt();
//        if(val%2 == 0){
//            System.out.println("Even");
//        }else {
//            System.out.println("Odd");
//        }
        System.out.println("Enter the a,b & c value :");
        int a=s.nextInt();
        int b = s.nextInt();
        int c= s.nextInt();
        if(a>b && a>c){
            System.out.println("A is greater than B & C");
        }else if(b>a && b>c){
            System.out.println("B Is greater than A & C");
        }else{
            System.out.println("C is greater than A & B");
        }

    }
}
