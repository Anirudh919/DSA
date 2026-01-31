package practice;

public class Max_value_aray {
    public static void main(String [] args){
        int[] arr = {1,3,4,56,8};
        System.out.println(Search_max_value(arr));
    }
    public static int Search_max_value(int[] arr){
        int max=arr[0];
//        int max = Integer.MIN_VALUE;   -2^31 this is value of the lower integer value
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) {
                max = arr[i];
//                predefine method max = Math.max(arr[i],max);
            }
        }
        return max;
    }
}
