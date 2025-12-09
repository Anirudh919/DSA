package practice;

import java.util.Scanner;

public class loop {
    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
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
//        System.out.print("Enter the number of do u want to print :");
//        int n=s.nextInt();
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
//        int i=0;
//        while(i<n){
//            int j =0;
//            while(j<n){
//                System.out.print(".*\t");
//                j++;
//            }
//            System.out.println();
//         i++;
//        }

//        for(int i=1;i<=1000;i++){
//            if(i%3==0){
//
//            }else {
//                System.out.println(i);
//            }
//        }
//
//        int n = s.nextInt();
//        int count=0;
//        for(int i=2;i<n;i++){
//            if(n%i==0){
//                count++;
//                break;
//            }
//        }
//        if(count>=1){
//            System.out.print("Not prime number");
//        }else {
//            System.out.print("Prime number");
//        }

//        int n=s.nextInt();
//        int a=0,b=1;
//        for(int i=1;i<=n;i++){
//            System.out.print(a+" ");
//            int c=a+b;
//            a=b;
//            b=c;
//        }
//        System.out.print(a+" ");
        int n=3846,sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}
