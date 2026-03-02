package practice;

public class Compare_to {
    public static void main(String[] args){
        String str = "hello";
        String str2 = "helly";
        System.out.println(Compare(str,str2));
    }
    public static int Compare(String str,String str1){
        if(str==str1){
            return 0;
        }
        for(int i=0;i<Math.min(str.length(),str1.length());i++){
            if(str.charAt(i)!=str1.charAt(i)){
                return str.charAt(i)-str1.charAt(i);
            }
        }
        return str.length()-str1.length();
    }

}

