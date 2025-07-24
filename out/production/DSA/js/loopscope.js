// var a=5;
// while(a==5){
//     var value=34;
//     // a++;
// }
// console.log(value);

// var n=5;
// var i = 0;
// while(i<n){
//     var j=0;
//     while(j<n){
//         document.write("* ");
//         j++;
//     }
//     document.write("<br/>");
//     i++;
// }

//pattern 1
// var n=5;
// var nst=n;
// var row=0;
// while(row<n){
//     var col=0;
//     while(col<nst){
//         document.write("* ");
//         col++;
//     }
//     document.write("<br/>");
//     nst--;
//     row++;
// }

// pattern 2

// var n=5;
// var nst = n-4;
// var row =0;
// while(row<n){
//     var col=0;
//     while(col<nst){
//         document.write("* ");
//         col++;
//     }
//     document.write("<br/>");
//     nst++;
//     row++;
// }

//pattern 3

// var n =5;
// var nsp = n-1;
// var nst = 1;
// var row=0;
// while(row<n){
//     var i =0;
//     while(i<nsp){
//         document.write("_ ");
//         i++;
//     }
//     var j=0;
//     while(j<nst){
//         document.write("* ");
//         j++;
//     }
//     document.write("<br/>")
//     nsp--;
//     nst++;
//     row++;
// }

//patter 4

// var n =5;
// var nsp = 0;
// var nst =n;
// var row= 0;
// while(row<n){
//     var i =0;
//     while(i<nsp){
//         document.write("&nbsp");
//         i++;
//     }
//     var j=0;
//     while(j<nst){
//         document.write("*");
//         j++;
//     }
//     document.write("<br/>");
//     nsp=nsp+2;
//     nst--;
//     row++;
// }

//pattern 5

// var n=5;
// var nsp=n-1;
// var nst =1;
// var row =0;
// while(row<n){
//     var i =0;
//     while(i<nsp){
//         document.write("&nbsp&nbsp")
//         i++;
//     }
//     var j=0;
//     while(j<nst){
//         document.write("*");
//         j++;
//     }
//     document.write("<br/>");
//     nsp--;
//     nst=nst+2;
//     row++;
// }

// pattern 6

// var n=5;
// var nsp=0;
// var nst=n+4;
// var row=0;
// while(row<n){
//     var i =0;
//      while(i<nsp){
//         document.write("&nbsp ");
//         i++;
//      }
//      var j=0;
//      while(j<nst){
//         document.write("*")
//         j++;
//      }
//      document.write("<br/>")
//      nsp++;
//      nst=nst-2;
//     row++;
// }

//pattern 7
// var n =5;
// var nsp = n-1;
// var nst =1;
// var row=0;
// while(row<n){
//     var i=0;
//     while(i<nsp){
//         document.write("&nbsp")
//         i++;
//     }
//     var j=1;
//     while(j<=nst){
//         if(j%2==0){
//             document.write("!");
//         }else{
//             document.write("*")
//         }
//         j++;
//     }
//     document.write("<br/>");
//     nsp--;
//     nst=nst+2;
//     row++;
// }

// pattern 8

// var n=5;
// var nst=1;
// var nsp=n*2-3;
// var row=1;
// while(row<=n){
//     var i=1;
//     while(i<=nst){
//         document.write("*");
//         i++;
//     }
//     var j=1;
//     while(j<=nsp){
//         document.write("&nbsp ");
//         j++;
//     }
//     var k=1;
//     if(row==n){
//         k=2;
//     }
//     while(k<=nst){
//         document.write("*");
//         k++;
//     }
//     document.write("<br/>");
//     nsp=nsp-2;
//     nst++;
//     row++;
// }


//pattern 9

// var n=5;
// var nst=1;
// var row=1;
// while(row<=n*2-1){
//     var i=1;
//     while(i<=nst){
//         document.write("*");
//         i++;
//     }
//     document.write("<br/>");
//     if(row<n){
//         nst++;
//     }else{
//         nst--;
//     }
//     row++;
// }

// patter 10

// var n=5;
// var nsp = n-1;
// var nst =1;
// var row=1;
// while(row<=n*2-1){
//     var i=1;
//     while(i<=nsp){
//         document.write("&nbsp ");
//         i++;
//     }
//     var j=1;
//     while(j<=nst){
//         document.write("*");
//         j++;
//     }
//     document.write("<br/>");
//     if(row<n){
//         nst++;
//         nsp--;
//     }else{
//         nst--;
//         nsp++;
//     }
//     row++;
// }


// pattern 11
// var n=5;
// var nsp =0;
// var nst =n;
// var row = 1;
// while(row<=n*2-1){
//     var i=1;
//     while(i<=nsp){
//         document.write("&nbsp ")
//         i++;
//     }
//     var j=1;
//     while(j<=nst){
//         document.write("*");
//         j++;
//     }
//     document.write("<br/>");
//     if(row<n){
//         nsp=nsp+2;
//         nst--;
//     }else{
//         nsp=nsp-2;
//         nst++;
//     }
//     row++;
// }

//  pattern 12

// var n =5;
// var nsp =n-1;
// var nst =n;
// var row=1;
// while(row<=n*2-1){
//     var i =1;
//     while(i<=nsp){
//         document.write("&nbsp ");
//         i++;
//     }
//     var j=1;
//     while(j<=nst){
//         document.write("*");
//         j++;
//     }
//     document.write("<br/>")
//     if(row<n){
//         nsp--;
//         nst--;
//     }else{
//         nsp++;
//         nst++;
//     }
//     row++;
// }

// pattern 13

// var n=7;
// var nst = (n-1)/2;
// var nsp =1;
// var row=1;
// while(row<=n){
//     var i =1;
//     while(i<=nst){
//         document.write("*");
//         i++;
//     }
//     var j=1;
//     while(j<=nsp){  
//         document.write("&nbsp ");
//         j++;
//     }
//     var k=1;
//     while(k<=nst){
//         document.write("*");
//         k++;
//     }
//     document.write("<br/>");
//     if(row<(n+1)/2){
//         nst--;
//         nsp=nsp+2;
//     }else{
//         nst++;
//         nsp=nsp-2;
//     }

//     row++;
// }

//pattern 14

// var n =7;
// var nsp=-1;
// var nst=(n+1)/2;
// var row=1;
// while(row<=n){
//     var i =1;
//     while(i<=nst){
//         document.write("*");
//         i++;
//     }
//     var j=1;
//     while(j<=nsp){
//         document.write("&nbsp ");
//         j++;
//     }
//     var k=1;
//     if(row==1 || row==n){
//         k=2;
//     }
//     while(k<=nst){
//         document.write("*");
//         k++;
//     }
//     document.write("<br/>");
//     if(row<(n+1)/2){
//         nst--;
//         nsp=nsp+2;
//     }else{
//         nst++;
//         nsp=nsp-2;
//     }
//     row++;
// }

// patter 15

// var n=5;
// var nsp=n-1;
// var nst=1;
// var row=1;
// while(row<=n){
//     var i=1;
//   while(i<=nsp){
//     document.write("&nbsp ");
//     i++;
//   }
//   var j=1;
//   while(j<=nst){
//     document.write("1")
//     j++;
//   }
//   document.write("<br/>")
//   nsp--;
//   nst=nst+2;
//     row++;
// }

// pattern 16

// var n=5;
// var nsp=n-1;
// var nst=1;
// var row_val=1;
// var row=1;
// while(row<=n){
//     var i =1;
//     while(i<=nsp){
//         document.write(" &nbsp  ");
//         i++;
//     }
//     var j=1;
//     var col_val=row_val;
//     while(j<=nst){
// document.write(col_val+" ");
// if(j<(nst+1)/2){
//     col_val++;
// }else{
//     col_val--;
// }
// j++;
//     }
//     document.write("<br/>");
//     row_val++;
//     nsp--;
//     nst=nst+2;
//     row++;
// }

// pattern 17

// var n =5;
// var nst =1;
// var nsp =3;
// var row=1;
// while(row<=n){
//     var i = 1;
//     while(i<=nst){
//         document.write("*");
//         i++;
//     }; 
//     var j=1;
//     while(j<=nsp){
//         if(row==1 || row==n){
//             document.write("*");
//         }else{
//             document.write("&nbsp ");
//         }
//         j++;
//     }
//     var k=1;
//     while(k<=nst){
//         document.write("*");
//         k++;
//     }
//     document.write("<br/>");
//     row++;
// }

// pattern 18

// var n=7;
// var nst=1;
// var nsp=(n+1)/2;
// var row=1;
// while(row<=n){
//     var i=1;
//     while(i<=nsp){
//         document.write("&nbsp ");
//         i++;
//     }
//     var j=1;
//     while(j<=nst){
//         document.write("*");
//         j++;
//     }
//     document.write("<br/>");
//     if(row<(n+1)/2){
//         nsp--;
//         nst=nst+2;
//     }else{
//         nsp++;
//         nst=nst-2;
//     }
//     row++;
// }

// pattern 19

// var n=7;
// var nst =(n+1)/2;
// var nsp =-1;
// var row=1;
// while(row<=n){
//     var i =1;
//     while(i<=nst){
//         document.write("*");
//         i++;
//     }
//     var j=1;
//     while(j<=nsp){
//         document.write("&nbsp ");
//         j++;
//     }
//     var k=1;
//     if(row==1 || row==n){
//         k=2;
//     }
//     while(k<=nst){
//         document.write("*");
//         k++;
//     }
//     document.write("<br/>");    
//     if(row<(n+1)/2){
//         nsp=nsp+2;
//         nst--;
//     }else{
//         nsp=nsp-2;
//         nst++;
//     }
//     row++;
// }

//pattern 20

// var n=7;
// var nsp =(n+1)/2;
// var nst =1;
// var row=1;
// while(row<=n){
//     var i=1;
//     while(i<=nsp){
//         document.write("&nbsp ");
//         i++;
//     }
//     var j=1;
//     while(j<=nst){
//         if(j==1 || j==nst){
//             document.write("*");
//         }else{
//             document.write("&nbsp ")
//         }
//         j++;
//     }
//     document.write("<br/>");
//     if(row<(n+1)/2){
//         nsp--;
//         nst=nst+2;
//     }else{
//         nsp++;
//         nst=nst-2;
//     }
//     row++;
// }

// pattern 21

// var n=5;
// var nsp=0;
// var nst=n;
// var row=1;
// while(row<=n){
//     var i=1;
//     while(i<=nsp){
//         document.write("&nbsp ");
//         i++;
//     }
//     var j=1;
//     while(j<=nst){
//         if(j==1 || j==nst){
//             document.write("*");
//         }else{
//             document.write("&nbsp ");
//         }
//         j++;
//     }
//     document.write("<br/>");
//     if(row<(n+1)/2){
//         nsp++;
//         nst=nst-2;
//     }else{
//         nsp--;
//         nst=nst+2;
//     }
//     row++;
// }

//pattern 22 

// var n=5;
// var nsp=n-1;
// var nst=1;
// var row_val=1;
// var row=1;
// while(row<=n){
//     var i=1;
//     while(i<=nsp){
//         document.write("&nbsp ");
//         i++;
//     }
//     var j=1;
//     while(j<=nst){
//         document.write(row_val);
//         j++;
//     }
//     document.write("<br/>");
//     nsp--;
//     nst+=2;
//     row_val++;
//     row++;
// }


// parcal pattern

// var n=6;
// var nst =1;
// var row=0;
// while(row<n){
// var i=0;
// var ncr=1;
// while(i<nst){
//     document.write(ncr+"&nbsp");
//     ncr=((row-i)*ncr)/(i+1);
//     i++;
// }
// document.write("<br/>");
// nst++;
// row++;
// }

// number reverse

// var num= 123456789;
// var reverse=0;
// while(num!=0){
//     var res= num%10;
//     reverse = reverse*10+res;
//     num = num/10;
// }
// document.write(reverse);