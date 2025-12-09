package practice;

public class trapping_rain_water {
public static void main(String [] args){
    //    trapping rain water 42

    int[] arr={1,2,3,4};
    int[] res=product_of_arr(arr);
    for(int i=0;i<arr.length;i++) {
        System.out.print(res[i]+" ");
    }
//    int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
//    System.out.println(Rain_water(arr));

}

// rain water
// public static int Rain_water(int[] arr){
//    int n=arr.length;
//    int[] left = new int[n];
//    left[0]=arr[0];
//    for(int i=1;i<n;i++){
//        left[i]=Math.max(left[i-1],arr[i]);
//    }
//    int[] right = new int[n];
//    right[n-1]=arr[n-1];
//    for(int i=n-2;i>=0;i--){
//        right[i]=Math.max(right[i+1],arr[i]);
//    }
//    int sum=0;
//    for(int i=0;i<right.length;i++){
//        sum=sum+(Math.min(left[i],right[i])-arr[i]);
//    }
//    return sum;
//}

//    Product of Array Except Self 238

    public static int [] product_of_arr(int[] arr){
      int n=arr.length;
      int[] left =new int[n];
      left[0]=1;
      for(int i=1;i<n;i++){
         left[i]=left[i-1]*arr[i-1];
      }
      int[] right=new int[n];
      right[n-1]=1;
      for(int i=n-2;i>=0;i--){
          right[i]=right[i+1]*arr[i+1];
      }
      for(int i=0;i<n;i++){
          arr[i]=left[i]*right[i];
      }
      return arr;
    }
}
