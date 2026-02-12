package practice;

public class max_subarray {
    public static void main(String [] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = Sub_Array(arr);
        System.out.println(ans);
    }
    public static int Sub_Array(int[] arr){
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                ans = Math.max(sum,ans);
            }
        }
        return ans;
    }
}
