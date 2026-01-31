let arr = [12, 45, 2, 34, 56, 78, 23];
let temp = Number.MIN_SAFE_INTEGER;
function Max_Val(arr) {
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] > temp) {
            temp = arr[i];
        }
    }
    return temp;
}

console.log(Max_Val(arr));