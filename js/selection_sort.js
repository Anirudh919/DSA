let arr = [4, 5, 3, 6, 9, -6];

function selection_sort(arr) {
    for (let i = 0; i < arr.length; i++) {
        let min_index = i;
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[min_index]) {
                min_index = j;
            }
        }
        let temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;
    }
    return arr;
}

let sorted_arr = selection_sort(arr);
console.log(sorted_arr);