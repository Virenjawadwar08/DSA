// import java.util.*;

// public class a179 {
//     //questions

//     public static void main(String[] args) {
//     //    Count how many times lowercase vowels occurred in a String entered by the user, write  java code and explain it properly

//     String str=new Scanner(System.in).next();

//     int count=0;

//     for(int i=0;i<str.length();i++) {
//         char ch=str.charAt(i);

//         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
//             count++;
//         }
//     }
//     System.out.println("count of vowels is:" + count);
//     }
// }

//check if the strings are anagrams

import java.util.*;

public class a179 {
    public static void main(String[] args) {
        String str1="earth";
        String str2="heart";

        //Convert Strings to lowercase. Why? so thatwe don't have to checkseparately for lower & uppercase.

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()==str2.length()) {
            //convert strings into char array

            char[] str1charArray=str1.toCharArray();

            char[] str2charArray=str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
// if the sorted char arrays are sameor identical then the strings are anagram
            boolean result=Arrays.equals(str1charArray,str2charArray);

            if(result) {
                System.out.println(str1+" and "+str2+"are anagrams of each other");
            } else {
                System.out.println(str1+" and "+str2+"are not anagrams of each other");
            }
        } else {
            //case when lengths are not equal
            System.out.println(str1+" and "+str2 +" are anagrams of each other");
        }
    }
}