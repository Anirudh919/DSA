package practice;

public class product_of_array_myself {
public static void main(String [] args){
    int[] arr ={1,2,3,4};
    int[] res=product_array(arr);
    for (int i=0;i<res.length;i++){
        System.out.print(res[i]+" ");
    }
}

    public static int[] product_array(int[] arr){
    int n=arr.length;
    int[] left = new int[n];
    left[0]=1;
    for(int i=1;i<n;i++){
        left[i]=left[i-1]*arr[i-1];
    }
    int[] right = new int[n];
    right[n-1]=1;
    for(int j=n-2;j>=0;j--){
        right[j]=right[j+1]*arr[j+1];
    }
    for(int k=0;k<n;k++){
        arr[k]=left[k]*right[k];
    }
    return arr;
    }
}

