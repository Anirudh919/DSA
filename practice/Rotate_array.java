package practice;

public class Rotate_array {
    public static  void main(String [] args){
        int[] arr = {1,2,3,4,5,6,7};
     Reverse_rotate_array(arr,3);
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
     }
        }
        public static void Reverse_rotate_array(int[] arr,int round){
        round=round%arr.length;
        for(int j=0;j<round;j++) {
            int last_val=arr[arr.length-1];
            for (int i = arr.length - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = last_val;
        }

        }
    }
