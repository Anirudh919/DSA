package practice;

public class sub_02 {
    public static void main(String[] args){
        String str = "nitin";
        sub_sting(str);
    }
    public static void sub_sting(String str){
       String str2="";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
               str2= str.substring(i,j);
                boolean val=ispalindrom(str2);
                if(val==true){
                    System.out.println(str2);
                }
            }
        }

    }
    public static boolean ispalindrom(String str){
        int i =0;
        int j = str.length()-1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
