package practice;

import java.util.Scanner;

public class data_type {
    public static void main(String [] args){
//        byte a= (byte) (300);
//        System.out.println(a);
//        int a=43;
//        int mul=1;
//        int ans=0;
//        while(a>0){
//            int rem = a%2;
//            ans = ans+mul*rem;
//            a=a/2;
//            mul=mul*10;
//        }
//        System.out.println(ans);
//        int n=10111;
//        int mul=1;
//        int ans=0;
//        while(n>0){
//            int rem = n%10;
//            ans=ans+rem*mul;
//            mul=mul*2;
//            n=n/10;
//        }
//        System.out.println(ans);

//         two number sum with 5 base not complete
//        int num1= 2134,num2=3304;
//        int mul =1;
//        int ans=0;
//        while(num1!=0){
//            int rem1 = num1%10;
//            while(num2!=0){
//                int rem2=num2%10;
//                int i=1;
//                while(i<1) {
//                    int rem3 = rem1 + rem2[i] % 5;
//                    ans = ans + rem3 * mul;
//                    i++;
//                }
//                num2
//            }
//        }

//        byte n =(byte) 428;
//        int i=  n;
//        n= (byte) i;
//        System.out.println(n);

//        int num = 32145;
//        int s=1;
//        int val=0;
//        while(num!=0){
//            int rem=num%10;
//            val =(int) (val + s*Math.pow(10,rem-1));
//            s++;
//            num/=10;
//        }
//        System.out.println(val);

        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        System.out.println(boston_number(n));
        long n = s.nextLong();
        System.out.println(Chewbacca(n));

    }
//   public static int boston_number(int n){
//        int digit = sum_of_digit(n);
//        int div=2;
//        int pf=0;
//        while(div<=n){
//         int rem = n%div;
//         if(rem==0){
//             pf=pf+sum_of_digit(div);
//             n=n/div;
//         }else {
//             div++;
//         }
//        }
//        if(pf==digit){
//            return 1;
//        }else {
//            return 0;
//        }
//    }
//   public static int sum_of_digit(int num){
//        int sum=0;
//        while (num != 0) {
//            int rem=num%10;
//            sum = sum +rem;
//            num/=10;
//        }
//        return sum;
//
//    }

    public static long Chewbacca(long n){
        long sum=0;
        long mul=1;
        while(n>9){
            long  rem = n%10;
            if(rem>=5){
                sum=sum+(9-rem)*mul;
            }else {
                sum=sum+rem*mul;
            }
            n=n/10;
            mul*=10;
        }
        if(n==9 || n<5){
            sum =sum+n*mul;
        }else {
            sum=sum+(9-n)*mul;
        }
        return sum;
    }
}
