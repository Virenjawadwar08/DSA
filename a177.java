// import java.util.*;

// public class a177 {
//     //string compare functions
//     public static void main(String[] args) {
//         String s1="tony";
//         String s2="tony";
//         String s3=new String("tony");

//         // if(s1==s2) {
//         //     System.out.println("strings are equal");
//         // } else {
//         //     System.out.println("strings are not equal");
//         // }

//         // s1 and s2 would be shown as equal and s1 and s3 would show not equal if we use == but if we use .equal function then it will show correct 

//         if(s1.equals(s3)) {
//             System.out.println("strings are equal");
//         } else {
//            System.out.println("strings are equal");
//         }
        
//     }
// }

import java.util.*;

public class a177 {

    public static String substring(String str,int si, int ei) {
        String substr="";
        for(int i=si;i<ei;i++) {
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        //Substring
        String str="HelloWorld";

        System.out.println(str.substring(0,5)); //str.substring function is used
        
        // System.out.println(substring(str, 0, 5));
    }
}