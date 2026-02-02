let arr = [4, 3, 6, 8, -2];
function insertion_sort(arr) {
    for (let i = 1; i < arr.length; i++) {
        let picked = arr[i];
        let j = i - 1;
        while (arr[j] > picked) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = picked;
    }
    return arr;
}

let res = insertion_sort(arr);
console.log(res);