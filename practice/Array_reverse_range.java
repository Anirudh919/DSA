package practice;

public class Array_reverse_range {
    public static void main(String [] args){
        int[] arr = {3,6,3,6,6,7,9,78,0};
        Reverse_array(arr,2,6);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Reverse_array(int[] arr,int i,int j){
        while (i<j){
            int temp = arr[i];
            arr[i]  = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
