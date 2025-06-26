package practice;

public class pattern {
    public static void main(String[] args){
        // pattern 1
//        int n=5;
//        int nst=n;
//        int row=0;
//        while(row<n){
//            int col=0;
//            while(col<nst){
//                System.out.print("* ");
//                col++;
//            }
//            System.out.println();
//            nst--;
//            row++;
//        }

        //pattern 2
//        int n=5;
//        int nst=n-4;
//        int row=0;
//        while(row<n){
//            int col=0;
//            while(col<nst){
//                System.out.print("* ");
//                col++;
//            }
//            System.out.println();
//            nst++;
//            row++;
//        }
        
        //pattern 3
        
//        int n=5;
//        int nst =1;
//        int nsp = n-1;
//        int row =0;
//        while(row<n){
//            int i =0;
//            while(i<nsp){
//                System.out.print("_ ");
//                i++;
//            }
//            int j =0;
//            while(j<nst){
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//            nsp--;
//            nst++;
//            row++;
//        }

        // pattern 4

//        int n=5;
//        int nsp = 0;
//        int nst = n;
//        int row = 0;
//        while(row<n){
//            int i=0;
//            while(i<nsp){
//                System.out.print("  ");
//                i++;
//            }
//            int j=0;
//            while(j<nst){
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//            nsp=nsp+2;
//            nst--;
//            row++;
//        }

        // pattern 5

//        int n =5;
//        int nsp = n-1;
//        int nst = 1;
//        int row =0;
//        while(row<n){
//            int i =0;
//            while(i<nsp){
//                System.out.print("  ");
//                i++;
//            }
//            int j =0;
//            while(j<nst){
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//            nsp--;
//            nst=nst+2;
//            row++;
//        }

        // pattern 6

//        i

        // pattern 7

//        int n=5;
//        int nsp=n-1;
//        int nst=1;
//        int row=0;
//        while(row<n){
//            int i=0;
//            while(i<nsp){
//                System.out.print("  ");
//                i++;
//            }
//            int j=1;
//            while(j<=nst){
//                if(j%2==0){
//                    System.out.print("! ");
//                }else {
//                    System.out.print("* ");
//                }
//
//                j++;
//            }
//            System.out.println();
//            nst=nst+2;
//            nsp--;
//            row++;
//        }


        // pattern 8

//        int n=5;
//        int nst=1;
//        int nsp=(n*2)-3;
//        int row=1;
//        while(row<=n){
//            int i=0;
//            while(i<nst){
//                System.out.print("* ");
//                i++;
//            }
//            int j=0;
//            while(j<nsp){
//                System.out.print("  ");
//                j++;
//            }
//            int k=1;
//            if(row==n){
//                k=2;
//            }
//            while(k<=nst){
//                System.out.print("* ");
//                k++;
//            }
//            System.out.println();
//            nsp=nsp-2;
//            nst++;
//            row++;
//        }

        // pattern 9

//        int n=5;
//        int nst=1;
//        int row=1;
//        while(row<=n*2-1){
//            int i=1;
//            while(i<=nst){
//                System.out.print("* ");
//                i++;
//            }
//            System.out.println();
//            if(row<n){
//                nst++;
//            }else {
//                nst--;
//            }
//            row++;
//        }

        // pattern 10

        int n=5;
        int nsp = n-1;
        int nst=1;
        int row=1;
        while(row<=n*2-1){
            int i =1;
            while(i<=nsp){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=nst){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            if(row<n){
                nst++;
                nsp--;
            }else{
                nst--;
                nsp++;
            }
            row++;
        }
    }
}
