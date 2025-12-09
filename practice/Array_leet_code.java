package practice;

public class Array_leet_code {
//    problem 189 Rotated array
// every function stack memory mai load hota hai
//    And main se bhara function & variable always vo heap memory mai create ho hota usko hum sabhi jagh use kar sakte in the main 
    public static void main(String [] args){
        int[] arr={1,2,3,4,5,6,7};
        int k = 3;
        Rotate_array(arr,k);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

//    rotate array in k number
//    public static void Rotate_array(int[] arr,int k){
//        int n=arr.length;
//    k=k%n;
//        for (int j=1;j<=k;j++) {
//            int item = arr[n - 1];
//            for (int i = n - 2; i >= 0; i--) {
//                arr[i + 1] = arr[i];
//            }
//            arr[0] = item;
//        }
//    }

    public static void Rotate_array(int[] arr,int k){
    int n=arr.length;
     k=k%n;
     Reverse_array(arr,0,n-k-1);
     Reverse_array(arr,n-k,n-1);
     Reverse_array(arr,0,n-1);
    }
    public static void Reverse_array(int[] arr,int i,int j){
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }


}
