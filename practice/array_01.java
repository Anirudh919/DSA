package practice;

public class array_01 {
//    trapping rain water
    public static void main(String [] args){
       int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
       int res = Trapping_rain_water(arr);
        System.out.print(res);
    }
    public static int Trapping_rain_water(int[] arr){
        int n = arr.length;
        int[] left = new int[n];
        left[0] = arr[0];
//        prefix
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        int[] right = new int[n];
        right[n-1] = arr[n-1];
//        suffix
        for(int j=n-2;j>0;j--){
            right[j]=Math.max(right[j+1],arr[j]);
        }
        int sum=0;
        for(int k=0;k<n;k++){
            sum+=(Math.min(left[k],right[k])-arr[k]);
        }
        return sum;
    }

}
