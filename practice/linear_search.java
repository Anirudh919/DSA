package practice;

public class linear_search {
    public static void main(String [] args){
        int[] arr = {2,3,4,-1,6,4,9};
        int item =40;
        int  res = Searching_Array(arr,item);
        System.out.println(res);
    }
    public static int Searching_Array(int[] arr,int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                return i;
            }
        }
        return -1;
    }
}
