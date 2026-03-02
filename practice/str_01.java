package practice;

public class str_01 {
    public static void main(String[] args){
//      + & concat method create the always the new memory allocation in the heap memory
        String str = "hello"; // this is always create in the poll memory
        String str2 = "bye";
        str = str+str2; // this is crate new context memory allocation in the heap
        String Str3 = new String("hii"); // it always create in the heap memory
        String str4 =new String("lo");
        Str3 = Str3+str4;
        String str5 = "hello" + "bye"; /// it always create in the poll memory

//   string immutal is not update same location it's create copy new location i will this is update it okay

//        == this is compare the address it's not compare the content
//        equals method is always compare the content
    }
}
