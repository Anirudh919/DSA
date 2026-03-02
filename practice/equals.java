package practice;

public class equals {
    public static void main(String[] args){
        String str = "hello";
        String str2 = "helol";
        System.out.println(Isequal(str,str2));
    }
    public static boolean Isequal(String str1,String str2){
        if(str1==str2){
            return true;
        }
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
