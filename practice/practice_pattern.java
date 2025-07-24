package practice;

import java.util.Scanner;

public class practice_pattern {
    public  static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
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
//            }else {
//                nst++;
//                nsp=nsp-2;
//            }
//            row++;
//        }

        // triangle number pattern

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
//            row_val++;
//            row++;
//        }

        // star in rhombus
//        int nsp=n/2;
//        int nst=1;
//        int row=1;
//        while (row<=n){
//            int i=1;
//            while (i<=nsp){
//                System.out.print("  ");
//                i++;
//            }
//            int j=1;
//            while (j<=nst){
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

        // number left hand triangle
//        int nst=1;
//        int row_val=1;
//        int row=1;
//        while (row<=n){
//            int i=1;
//            while (i<=nst){
//                System.out.print(row_val+" ");
//                if(i<nst){
//                    row_val++;
//                }
//                i++;
//            }
//            System.out.println();
//            row_val++;
//            nst++;
//            row++;
//        }

        // create rhombus shape with star
//        int nsp=n-1;
//        int nst=n;
//        int row=1;
//        while (row<=n){
//            int i=1;
//            while (i<=nsp){
//                System.out.print("  ");
//                i++;
//            }
//            int j=1;
//            while (j<=nst){
//                if(row==1 || row==n){
//                        System.out.print("*");
//                }else if(j==1 || j==nst) {
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//                j++;
//            }
//            System.out.println();
//            nsp--;
//            row++;
//        }

        // diamond number print

//        int nsp=(n+1)/2;
//        int nst=1;
//        int row_val=1;
//        int row=1;
//        while(row<=(n*2)-1){
//            int i=1;
//            while (i<=nsp){
//                System.out.print(" \t");
//                i++;
//            }
//            int j=1;
//            int col_val=row_val;
//            while (j<=nst){
//                System.out.print(col_val+"\t");
//                if(j<(nst+1)/2){
//                    col_val++;
//                }else {
//                    col_val--;
//                }
//                j++;
//            }
//            System.out.println();
//            if(row<(n*2)/2){
//                nsp--;
//                nst=nst+2;
//                row_val++;
//            }else {
//                nsp++;
//                nst=nst-2;
//                row_val--;
//            }
//            row++;
//        }

        // left hand triangle number print
//        int nst =1;
//        int row_val=1;
//        int row=1;
//        while(row<=n){
//            int i=1;
//            int col_val=row_val;
//            while (i<=nst){
//                if(row>=(n+1)/2){
//                    if(i==1 || i==nst){
//                        System.out.print(col_val+"\t");
//                    }else {
//                        System.out.print(col_val%col_val+"\t");
//                    }
//                }else {
//                    System.out.print(col_val+"\t");
//                }
//            i++;
//            }
//            System.out.println();
//            nst++;
//            row_val++;
//            row++;
//        }

        // magic pattern

//        int nst = n;
//        int nsp =-1;
//        int row =1;
//        while (row<=(n*2)-1){
//            int i=1;
//            while (i<=nst){
//                System.out.print("* ");
//                i++;
//            }
//            int j=1;
//            while (j<=nsp){
//                System.out.print("  ");
//                j++;
//            }
//            int k=1;
//            if(row==1 || row==(n*2)-1){
//                k=2;
//            }
//            while (k<=nst){
//                System.out.print("* ");
//                k++;
//            }
//            System.out.println();
//            if(row<(n*2)/2){
//                nst--;
//                nsp=nsp+2;
//            }else {
//                nst++;
//                nsp=nsp-2;
//            }
//            row++;
//        }


        // pattern mountain
//        int nst = 1;
//        int nsp = (n*2)-1;
//        int row=1;
//        int row_val=n;
//        int row_val2=n;
//        while(row<=(n*2)+1){
//            int i =1;
//            int col_val=row_val;
//            while(i<=nst){
//                System.out.print(col_val+" ");
//                col_val--;
//                i++;
//            }
//            int j=1;
//            while (j<=nsp){
//                System.out.print("  ");
//                j++;
//            }
//            int k=1;
//
//            if(row == n+1){
//                row_val2 =1;
//                k=2;
//            }else {
//                row_val2=n-nst+1;
//            }
//            int col_val2=row_val2;
//            while (k<=nst){
//                System.out.print(col_val2+" ");
//                col_val2++;
//                k++;
//            }
//            System.out.println();
//            if(row<((n*2)+2)/2){
//                nsp-=2;
//                nst++;
//            }else {
//                nsp+=2;
//                nst--;
//            }
//            row++;
//        }

// pattern hourglass
//        int nst = (n*2)+1;
//        int nsp =0;
//        int row=1;
//        int row_val=n;
//        while (row<=(n*2)+1){
//            int j=1;
//            while (j<=nsp){
//                System.out.print("  ");
//                j++;
//            }
//            int i=1;
//            int col_val=row_val;
//            while (i<=nst){
//                System.out.print(col_val+" ");
//                if(i<(nst+1)/2){
//                    col_val--;
//                }else {
//                    col_val++;
//                }
//                i++;
//            }
//
//            System.out.println();
//            if(row<((n*2)+2)/2){
//                nsp++;
//                nst-=2;
//                row_val--;
//            }else {
//                nsp--;
//                nst+=2;
//                row_val++;
//            }
//            row++;
//        }

        // fabonacci series right hand triangle

//        int nst =1;
//        int row_val=0;
//        int new_row_val =1;
//        int row=1;
//        while (row<=n){
//            int i=1;
//            while (i<=nst){
//                System.out.print(row_val+" ");
//                int result = row_val+new_row_val;
//                row_val=new_row_val;
//                new_row_val=result;
//                i++;
//            }
//            System.out.println();
//            nst++;
//            row++;
//        }

        // pattern double sided arrow

//        int nsp=n-1;
//        int nsm=-1;
//        int nst=1;
//        int row=1;
//        int row_val=1;
//        int row_val2=1;
//        while (row<=n){
//            int i=1;
//            while (i<=nsp){
//                System.out.print("  ");
//                i++;
//            }
//            int j=1;
//            int col_val=row_val;
//            while (j<=nst){
//                System.out.print(col_val+" ");
//                col_val--;
//                j++;
//            }
//            int k=1;
//            while (k<=nsm){
//                System.out.print("  ");
//                k++;
//            }
//            if(row==1 || row==n){
//                System.out.print(" ");
//                } else {
//                int l = 1;
//                int col_val2 = row_val2;
//                while (l <= nst) {
//                    System.out.print(col_val2 + " ");
//                    col_val2++;
//                    l++;
//                }
//            }
//            System.out.println();
//            if(row<(n+1)/2){
//                nst++;
//                nsp-=2;
//                nsm+=2;
//                row_val++;
//            }else {
//                nst--;
//                nsp+=2;
//                nsm-=2;
//                row_val--;
//            }
//            row++;
//        }

//        Pattern Mountain

//        int nst =1;
//        int nsp = n+1;
//        int row_val=1;
//        int row=1;
//        while(row<=n){
//            int i=1;
//            int col_val = row_val;
//            while (i<=nst){
//                System.out.print(col_val+" ");
//                col_val++;
//                i++;
//            }
//            int j=1;
//            while (j<=nsp){
//                System.out.print("  ");
//                j++;
//            }
//            int k=1;
//            int col_val2=nst;
//            if(row==n){
//                k=2;
//                col_val2=3;
//            }
//            while (k<=nst){
//                System.out.print(col_val2+" ");
//                col_val2--;
//                k++;
//            }
//            System.out.println();
//            nst++;
//            nsp-=2;
//
//            row++;
//        }

        // pascal pattern

//        int nst = 1;
//        int row=0;
//        while (row<n){
//            int i=0;
//            int ncr=1;
//            while (i<nst){
//                System.out.print(ncr+"\t");
//                ncr=((row-i)*ncr)/(i+1);
//                i++;
//            }
//            System.out.println();
//            nst++;
//            row++;
//        }


        // number reverse

//        int num = 123456789;
//        int reverse=0;
//        while (num!=0){
//            int res = num%10;
//            reverse = reverse*10+res;
//            num=num/10;
//        }
//        System.out.print(reverse);




    }
}
