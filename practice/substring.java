package practice;

public class substring {
    public static void main(String[] args){
        String str = "83415";
        Sub_String(str);
    }
    public static void Sub_String(String str){
        for(int len=1;len<=str.length();len++){
            for(int j=len;j<=str.length();j++){
                int i = j-len;
                System.out.println(str.substring(i,j));
            }
        }
    }
}
