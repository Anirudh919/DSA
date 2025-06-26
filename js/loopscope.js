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

var n=5;
var nsp = n-1;
var nst =1;
var row=1;
while(row<=n*2-1){
    var i=1;
    while(i<=nsp){
        document.write("&nbsp ");
        i++;
    }
    var j=1;
    while(j<=nst){
        document.write("*");
        j++;
    }
    document.write("<br/>");
    if(row<n){
        nst++;
        nsp--;
    }else{
        nst--;
        nsp++;
    }
    row++;
}
