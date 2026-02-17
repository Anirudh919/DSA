package practice;

public class Book_allocation {
    public static void main(String[] args){
        int[] page = {10,20,30,40};
        int nos=2;
        System.out.println(MinPage(page,nos));
    }
    public static int MinPage(int[] page,int nos){
        int lo=0;
        int hi=0;
        for (int i=0;i<page.length-1;i++){
            hi+=page[i];
        }
        int ans=0;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if(isPossible(page,nos,mid)==true){
                ans = mid;
                hi = mid-1;
            }else {
                lo=mid+1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] page,int nos,int mid){
        int student =1;
        int read_s = 0;
        for(int i=0;i<page.length;i++){
            if(read_s+page[i]<=mid){
                read_s+=page[i];
            }else {
                student++;
                read_s = page[i];
            }
            if(student>nos){
                return false;
            }
        }
        return true;
    }
}
