package practice;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
//      int n =5;
//      int nsp = 0;
//      int nst = n;
//      int row =1;
//      while(row<=n*2-1){
//          int i =1;
//          while(i<=nsp){
//              System.out.print("  ");
//              i++;
//          }
//          int j=1;
//          while(j<=nst){
//              System.out.print("* ");
//              j++;
//          }
//          System.out.println();
//          if(row<n){
//              nsp=nsp+2;
//              nst--;
//          }else{
//              nsp=nsp-2;
//              nst++;
//          }
//          row++;
//      }

        // pattern 11
//        int n=5;
//        int nsp = n-1;
//        int nst =n;
//        int row=1;
//        while(row<=n*2-1){
//            int i=1;
//            while(i<=nsp){
//                System.out.print("  ");
//                i++;
//            }
//            int j=1;
//            while(j<=nst){
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//            if(row<n){
//                nsp--;
//                nst--;
//            }else{
//                nsp++;
//                nst++;
//            }
//            row++;
//        }

        // pattern 12

//        int n =7;
//        int nst = 3;
//        int nsp =1;
//        int row=1;
//        while(row<=n){
//            int i =1;
//            while(i<=nst){
//                System.out.print("* ");
//                i++;
//            }
//            int j =1;
//            while(j<=nsp){
//                System.out.print("  ");
//                j++;
//            }
//            int k=1;
//            while(k<=nst){
//                System.out.print("* ");
//                k++;
//            }
//            System.out.println();
//            if(row<4){
//                nst--;
//                nsp=nsp+2;
//            }else{
//                nst++;
//                nsp=nsp-2;
//            }
//            row++;
//        }

        // pattern 13

//        int n=7;
//        int nsp=-1;
//        int nst=(n+1)/2;
//        int row=1;
//        while(row<=n){
//            int i=1;
//            while(i<=nst){
//                System.out.print("* ");
//                i++;
//            }
//            int j=1;
//            while(j<=nsp){
//                System.out.print("  ");
//                j++;
//            }
//            int k=1;
//            if(row==1 || row==n){
//                k=2;
//            }
//            while(k<=nst){
//                System.out.print("* ");
//                k++;
//            }
//            System.out.println();
//            if(row<(n+1)/2){
//                nst--;
//                nsp=nsp+2;
//            }else{
//                nst++;
//                nsp=nsp-2;
//            }
//            row++;
//        }

        // pattern 14

//        int n=5;
//        int nsp =n-1;
//        int nst = 1;
//        int row=1;
//        while(row<=n){
//            int i=1;
//            while(i<=nsp){
//                System.out.print("  ");
//                i++;
//            }
//            int j =1;
//            while(j<=nst){
//                System.out.print("1 ");
//                j++;
//            }
//            System.out.println();
//            nsp--;
//            nst=nst+2;
//            row++;
//        }

        // pattern 15

//        int n=5;
//        int nsp =n-1;
//        int nst =1;
//        int row=1;
//        while(row<=n){
//            int i =1;
//            while(i<=nsp){
//                System.out.print("  ");
//                i++;
//            }
//            int j=1;
//            while(j<=nst){
//                System.out.print(j+" ");
//                j++;
//            }
//            System.out.println();
//            nsp--;
//            nst=nst+2;
//            row++;
//        }

        // patter 16

//        int n=5;
//        int nsp = n-1;
//        int nst = 1;
//        int row_val=1;
//        int row =1;
//        while(row<=n){
//            int i=1;
//            while(i<=nsp){
//                System.out.print("  ");
//                i++;
//            }
//            int j=1;
//            int col_val=row_val;
//            while(j<=nst){
//                System.out.print(col_val+" ");
//                if(j<(nst+1)/2){
//                    col_val++;
//                }else {
//                    col_val--;
//                }
//                j++;
//            }
//            System.out.println();
//            row_val++;
//            nsp--;
//            nst=nst+2;
//            row++;
//        }


//        Scanner s = new Scanner(System.in);
//        int n=s.nextInt();
//        int sum=1;
//        for(int i=1;i<=n;i++){
//            sum*=i;
//        }
//        System.out.println(sum);
//        if(n==1){
//            System.out.println("n is not prime number");
//        }else {
//            int count = 0;
//            for (int i = 2; i < n - 1; i++) {
//                if (n % i == 0) {
//                    count++;
//                    break;
//                }
//            }
//            if (count > 0) {
//                System.out.println("This is not prime number");
//            } else {
//                System.out.println("This is prime number");
//            }
//        }

        // pattern 17

//        int n =5;
//        int nst =1;
//        int nsp =3;
//        int row=1;
//        while(row<=n){
//            int i =1;
//                }else{
//                    System.out.print("  ");
//                }
//                j++;
//            }
//            int k=1;
//            while(k<=nst){
//                System.out.print("* ");
//                k++;
//            }
//            System.out.println();
//            row++;
//        }

        // pattern 18

//        int n=7;
//        int nst =1;
//        int nsp=(n+1)/2;
//        int row=1;
//        while(row<=n){
//            int i =1;
//            while(i<=nsp){
//                System.out.print("  ");
//                i++;
//            }
//            int j=1;
//            while(j<=nst){
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//            if(row<(n+1)/2){
//                nsp--;
//                nst=nst+2;
//            }else {
//                nsp++;
//                nst=nst-2;
//            }
//            row++;
//        }

        // pattern 19

//        int n=7;
//        int nsp=-1;
//        int nst = (n+1)/2;
//        int row=1;
//        while(row<=n){
//            int i =1;
//            while(i<=nst){
//                System.out.print("* ");
//                i++;
//            }
//            int j=1;
//            while(j<=nsp){
//                System.out.print("  ");
//                j++;
//            }
//            int k=1;
//            if(row==1 || row==n){
//                k=2;
//            }
//            while(k<=nst){
//                System.out.print("* ");
//                k++;
//            }
//            System.out.println();
//            if(row<(n+1)/2){
//                nsp=nsp+2;
//                nst--;
//            }else {
//                nsp=nsp-2;
//                nst++;
//            }
//            row++;
//        }

        // pattern 20

//        int n=7;
//        int nsp =(n+1)/2;
//        int nst=1;
//        int row=1;
//        while(row<=n){
//            int i=1;
//            while(i<nsp){
//                System.out.print("  ");
//                i++;
//            }
//            int j=1;
//            while(j<=nst){
//                if(j==1 || j==nst){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//                j++;
//            }
//            System.out.println();
//            if(row<(n+1)/2){
//                nsp--;
//                nst=nst+2;
//            }else {
//                nsp++;
//                nst=nst-2;
//            }
//            row++;
//        }

        // pattern 21

//        int n=5;
//        int nst=n;
//        int nsp=0;
//        int row=1;
//        while(row<=n){
//            int i =1;
//            while (i<=nsp){
//                System.out.print("  ");
//                i++;
//            }
//            int j=1;
//            while (j<=nst){
//                if(j==1 || j==nst){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//                j++;
//            }
//            System.out.println();
//            if(row<(n+1)/2){
//                nsp++;
//                nst=nst-2;
//            }else {
//                nsp--;
//                nst=nst+2;
//            }
//            row++;

        // pattern 22

//        int n=5;
//        int nsp=n-1;
//        int nst=1;
//        int row_val=1;
//        int row=1;
//        while(row<=n){
//            int i=1;
//            while(i<=nsp){
//                System.out.print("  ");
//                i++;
//            }
//            int j=1;
//            while(j<=nst){
//                System.out.print(row_val+" ");
//                j++;
//            }
//            System.out.println();
//            nsp--;
//            row_val++;
//            nst=nst+2;
//            row++;
//        }

        // pattern 23

//        int n=5;
//        int nsp=n-1;
//        int nst=1;
//        int row_val=1;
//        int row=1;
//        while (row<=n){
//            int i=1;
//            while(i<=nsp){
//                System.out.print("  ");
//                i++;
//            }
//            int j=1;
//            int col_val=row_val;
//            while(j<=nst){
//                System.out.print(col_val+" ");
//                j++;
//                col_val++;
//            }
//            System.out.println();
//            nsp--;
//            nst=nst+2;
//            row++;
//        }

        //pattern 24

//        int n=5;
//        int nsp=n-1;
//        int nst=1;
//        int row_val=1;
//        int row=1;
//        while(row<=n){
//            int i =1;
//            while (i<=nsp){
//                System.out.print("  ");
//                i++;
//            }
//            int j=1;
//            int col_val=row_val;
//            while (j<=nst){
//                System.out.print(col_val+" ");
//                if(j<=nst/2){
//                    col_val++;
//                }else {
//                    col_val--;
//                }
//                j++;
//            }
//            System.out.println();
//            nsp--;
//            nst=nst+2;
//            row++;
//        }

        //pattern 25

//        int n=5;
//        int nsp=n-1;
//        int nst=1;
//        int row_val=1;
//        int row=1;
//        while (row<=n){
//            int i=1;
//            while (i<=nsp){
//                System.out.print("  ");
//                i++;
//            }
//            int j=1;
//            while (j<=nst){
//                if(j==1 || j==nst){
//                    System.out.print(row_val+" ");
//                }else {
//                    System.out.print(0+" ");
//                }
//                j++;
//            }
//            System.out.println();
//            nsp--;
//            nst=nst+2;
//            row_val++;
//            row++;
//        }

// pattern 30

//        int n=5;
//        int val=5;
//        int row=1;
//        while(row<=n){
//            int i=1;
//            int col_val=val;
//            while (i<=n){
//                System.out.print(col_val+" ");
//                col_val--;
//                i++;
//            }
//            System.out.println();
//            row++;
//        }

        //pattern 31

//        int n=5;
//        int nsp=n;
//        int nst=n;
//        int row_val=5;
//        int row=1;
//        while(row<=n){
//            int i =1;
//            int col_val=row_val;
//            while(i<=nsp){
//                if(i==nst){
//                    System.out.print("* ");
//                }else {
//                    System.out.print(col_val+" ");
//                }
//                col_val--;
//               i++;
//            }
//            System.out.println();
//            nst--;
//            row++;
//        }

        // pattern 32

//        int n=5;
//        int nst=1;
//        int row_val=1;
//        int row=1;
//        while (row<=(n*2)-1){
//            int i=1;
//            int col_val=row_val;
//            while (i<= nst){
//                if(i%2==0){
//                    System.out.print("* ");
//                }else {
//                    System.out.print(col_val+" ");
//                }
//                i++;
//            }
//            System.out.println();
//            if(row<(n*2)/2){
//                nst=nst+2;
//                row_val++;
//            }else {
//                nst=nst-2;
//                row_val--;
//            }
//
//            row++;
//        }

        // pattern 33

//        int n =10;
//        int nsp=n-1;
//        int row_val=10;
//        int nst=1;
//        int row=1;
//        while(row<=n){
//            int i=1;
//            while (i<=nsp){
//                System.out.print("  ");
//                i++;
//            }
//            int j=1;
//            int col_val=row_val;
//            while(j<=nst){
//                System.out.print(col_val%10+" ");
//                if(j<(nst+1)/2) {
//                    col_val++;
//                }else{
//                    col_val--;
//                }
//                j++;
//            }
//            System.out.println();
//            row_val--;
//            nsp--;
//            nst=nst+2;
//            row++;
//        }

    }
}