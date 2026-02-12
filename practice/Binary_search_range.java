package practice;

public class Binary_search_range {
    public static void main(String [] args){
        int n = 87;
        int k = 3;
        int res =Search_possible_factors(n,k);
        System.out.println(res);
    }
    public static int Search_possible_factors(int n,int k){
        int low =1;
        int high = n;
        int ans=0;
        while(low<=high){
            int mid = (low+high)/2;
            if(Math.pow(mid,k)<=n){
                ans = mid;
                low=mid+1;
            }else {
                high = mid-1;
            }
        }
        return ans;
    }
}
