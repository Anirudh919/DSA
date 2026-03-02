package practice;

public class check_cb_number {
    public static void main(String[] args){
        String str = "81615";
        System.out.println(Cb_number(str));
    }
    public static int Cb_number(String str){
        int count =0;
        boolean[] visited = new boolean[str.length()];
        for(int len=1;len<=str.length();len++){
            for(int j=len;j<str.length();j++){
                int i = j-len;
                String str2=str.substring(i,j);
                if(is_cb_no(Long.parseLong(str2))==true && isvalid(visited,i,j)==true){
                    count++;
                    for(int k=i;k<j;k++){
                        visited[k]=true;
                    }
                }
            }
        }
        return count;
    }

    public static boolean isvalid(boolean[] visited,int i ,int j){
        for(;i<j;i++){
            if(visited[i]==true){
                return false;
            }
        }
        return true;
    }

    public static boolean is_cb_no(long num){
        int[] arr = {2,3,5,7,11,13,17,19,23,29};
        if(num == 0 && num ==1){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                return true;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(num%arr[i]==0){
                return false;
            }
        }
        return true;
    }
}
