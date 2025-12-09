package practice;

import java.util.Scanner;

public class inverse_number {
    public static void main(String[] args) {
//        System.out.println(boston_number(378));
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
//        System.out.println(ReplaceNumber(n));
//        System.out.println(Chewbacca(4545));
    }
//        System.out.println(inverse());


//    inverse number

//public static int inverse(){
//    int n=32145;
//    int sum =0;
//    int place = 1;
//    while (n!=0){
//        int rem = n%10;
//        sum=sum+(int)(place*Math.pow(10,rem-1));
//        n/=10;
//        place++;
//    }
//    return sum;
//}


//    boston number
//        public static int boston_number (int num){
//            int digit = sumofDigit(num);
//            int pf = 0;
//            int div = 2;
//            while (div <= num) {
//                int rem = num % div;
//                if(rem==0){
//                    pf= pf + sumofDigit(div);
//                    num = num / div;
//                }else {
//                    div++;
//                }
//            }
//            if(pf==digit){
//                return 1;
//            }else {
//                return 0;
//            }
//
//
//        }
//
//        public static int sumofDigit ( int num){
//            int sum = 0;
//            while (num != 0) {
//                int rem = num % 10;
//                sum = sum + rem;
//                num = num / 10;
//            }
//            return sum;
//        }


//     Chewbacca number
//public static long Chewbacca(long num){
//        long sum=0;
//        long mul=1;
//        while (num>9){
//            long rem = num%10;
//            if(rem >= 5){
//                sum= sum+(9-rem)*mul;
//            }else {
//                sum= sum +rem*mul;
//            }
//            num=num/10;
//            mul=mul*10;
//        }
//        if(num ==9 || num<5){
//            sum=sum+num*mul;
//        }else {
//            sum=sum+(9-num)*mul;
//        }
//        return sum;
//}

//     replace all 0 with 5

//    public static int ReplaceNumber(int num) {
//        int newNum = 0;
//        int mul=1;
//        boolean isNegative = num < 0;
//        num = Math.abs(num);
//        while (num > 0) {
//            int rem = num % 10;
//            if(rem == 0){
//                newNum = newNum+5*mul;
//            }else {
//                newNum = newNum + rem*mul;
//            }
//            num = num / 10;
//            mul*=10;
//        }
//        return isNegative ? -newNum : newNum;
//    }

    

}