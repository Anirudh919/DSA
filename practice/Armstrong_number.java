package practice;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(Armstrong(a));
    }
    public  static boolean Armstrong(int x){
        int count = Count_of_digit(x);
        int sum =0;
        int val=x;
        while(x>0){
            int rem = x%10;
            sum=(int)(sum+Math.pow(rem,count));
            x=x/10;
        }
        System.out.println(sum +"\t"+x);
        if(sum==val){
            return true;
        }else {
            return false;
        }
    }

    public static int Count_of_digit(int x){
        int count =0;
       while(x>0){
           count++;
           x=x/10;
       }
       return count;
    }


}
