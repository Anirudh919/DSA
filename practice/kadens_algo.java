package practice;

public class kadens_algo {
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int res=sub_array(arr);
        System.out.println(res);
    }
    public static int sub_array(int[] arr){
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            ans = Math.max(sum,ans);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }

}
