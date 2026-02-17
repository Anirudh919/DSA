package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Aggrcows {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int nos = s.nextInt();
        int noc = s.nextInt();
        int[] arr = new int[nos];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(MinDistance(arr,noc));
    }
    public static int MinDistance(int[] stall,int noc){
        int lo = stall[0];
        int hi = stall[stall.length-1];
        int ans=0;
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if(isPossible(stall,noc,mid)==true){
                ans=mid;
                lo = mid+1;
            }else {
                hi=mid-1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] stall,int noc,int mid){
        int pos = stall[0];
        int cowcount=1;
        for(int i=1;i< stall.length;i++){
            if(stall[i]-pos>=mid){
                cowcount++;
                pos=stall[i];
            }
            if(cowcount==noc){
                return true;
            }
        }
        return false;
    }
}
