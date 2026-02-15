package practice;

public class Spiral {
    public static void main(String[] args){
        int[][] arr = {{1, 2,3,4}, {5, 6, 7, 8}, {9, 10, 11,12}};
        Spiral_bind(arr);
    }
    public static void Spiral_bind(int[][] arr){
        int minr=0;
        int maxr=arr.length-1;
        int minc=0;
        int maxc=arr[0].length-1;
        int count =0;
        int Total_element = arr.length*arr[0].length;
        while (count<Total_element) {
            for (int i = minc; i <= maxc && count<Total_element; i++) {
                System.out.print(arr[minr][i] + " ");
                count++;
            }
            minr++;
            for (int i = minr; i <= maxr && count<Total_element; i++) {
                System.out.print(arr[i][maxc] + " ");
                count++;
            }
            maxc--;
            for (int i = maxc; i >= minc && count<Total_element; i--) {
                System.out.print(arr[maxr][i] + " ");
                count++;
            }
            maxr--;
            for (int i = maxr; i >= minr && count<Total_element; i--) {
                System.out.print(arr[i][minc] + " ");
                count++;
            }
            minc++;
        }
    }
}
