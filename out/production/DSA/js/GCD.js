//  Inverse number 

// var num = 32145;
// var inverse =0;
// var position =1;
// while(parseInt(num)!=0){
//     var rem = parseInt(num)%10 ;
//     inverse= inverse+(position*Math.pow(10,parseInt(rem-1)));
//     num=parseInt(num)/10;
//     position++;
// }
// document.write(inverse);


var sum=0;
var bosto=0;
var pf=2;
function BostoOfnnumber(num){
    var digit = sumofNumber(num);
    while(parseInt(num)!=0){
        console.log(num);
        var rem = num%pf;
        console.log(rem);
        if(rem==0){
            bosto=bosto+sumofNumber(parseInt(rem));
            console.log(bosto);
            num = num / pf;
        }else{
            pf++;
        }
    }
    if(bosto==digit){
        return 1;
    }else{
        return 0;
    }
}

function sumofNumber(num){
    while(parseInt(num)>0){
    var rem = num%10;
    sum += parseInt(rem);   
    num/=10;
    }
    return sum;
}

// let show = sumofNumber(378);
// console.log(show);
let bos = BostoOfnnumber(378);
console.log(bos);