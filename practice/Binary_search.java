package practice;

public class Binary_search {
    public static void main(String [] args){
        int[] arr = {2,3,4,5,6,7,8,11,12};
        int item = 11;
       int res =  Divided_conquer(arr,item);
        System.out.println(res);
    }
    public static int Divided_conquer(int[] arr,int val){
        int low = 0;
        int high_val=arr.length-1;
        while(low<=high_val){
            int mid = (low+high_val)/2;
            if(arr[mid]==val){
                return mid;
            }else if(arr[mid]>val){
                high_val=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
}
