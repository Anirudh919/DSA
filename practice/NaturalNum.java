package practice;

import java.util.Scanner;

public class NaturalNum {
    public static void main(String[] args) {
//        int n = 10, sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum = sum + i; // add i instead of 1
//        }
//        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        Scanner s = new Scanner(System.in);
        int p= s.nextInt();
        int r=s.nextInt();
        int t=s.nextInt();
        int result = (p*r*t)/100;
        System.out.print("Rate of interest :"+result);
    }
}
