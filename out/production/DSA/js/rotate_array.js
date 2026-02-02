let arr = [1, 2, 3, 4, 5, 6, 7];
let k = 3;
// not optimize solution
// k = k % arr.length;
// for (let j = 0; j < k; j++) {
//     let last_val = arr[arr.length - 1];
//     for (let i = arr.length - 2; i >= 0; i--) {
//         arr[i + 1] = arr[i];
//     }
//     arr[0] = last_val;
// }

// optimize solution

function rotate_array(arr, k) {
    let n = arr.length;
    k = k % n;
    reverse_arrar(arr, 0, n - k - 1);
    reverse_arrar(arr, n - k, n - 1);
    reverse_arrar(arr, 0, n - 1);
    return arr;
}

function reverse_arrar(arr, start, end) {
    while (start < end) {
        let temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

console.log(rotate_array(arr, k));