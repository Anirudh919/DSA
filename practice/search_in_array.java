package practice;

public class search_in_array {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,30,4,56,7,3,6,78,4,6};
//        Reverse(arr);
        Reverse_arr_range(arr,2,6);
        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
//        System.out.println(Max(arr));
//        int item=7;
//        System.out.println(Search(arr,item));
    }

//    linear search
//    public static int Search(int[] arr,int item){
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==item){
//                return i;
//            }
//        }
//        return -1;
//    }

//    find max value in array
//    public static int Max(int[] arr){
//        int m=arr[0];
//        for (int i=1;i<arr.length;i++){
//            if(arr[i]>m){
//                m=arr[i];
//            }
//        }
//        return m;
//    }

//    reverse array

//    public static void Reverse(int[] arr){
//        int i=0;
//        int j=arr.length-1;
//       while(i<j){
//           int temp=arr[i];
//           arr[i]=arr[j];
//           arr[j]=temp;
//           i++;
//           j--;
//       }
//    }

//     reverse array in range
    public static void Reverse_arr_range(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
