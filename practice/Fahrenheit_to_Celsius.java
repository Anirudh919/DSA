package practice;

import java.util.Scanner;

public class Fahrenheit_to_Celsius {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int min=s.nextInt();
        int max=s.nextInt();
        int step=s.nextInt();
        for(int i=min;i<=max;i=i+step){
            System.out.println(i+" "+(int)f_to_c(i));
        }

    }

    public static double f_to_c(int f){
      return (5.0/9.0)*(f-32);
    }
}
