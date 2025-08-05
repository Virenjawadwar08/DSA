// import java.util.*;

// public class a178 {
//     public static void main(String[] args) {
//         String fruits[]={"apple","mango","banana"};

//         String largest=fruits[0];
//         for(int i=1;i<fruits.length;i++) {


// // if (largest.compareTo(fruits[i]) < 0) {
// // This compares the current largest with the fruit at index i.

// // compareTo() compares two strings lexicographically:

// // Returns < 0 if largest comes before fruits[i] in dictionary order.

// // Returns > 0 if largest comes after fruits[i].

// // Returns 0 if both are equal.

// // So, if fruits[i] is lexicographically larger, we update largest.


//             if(largest.compareTo(fruits[i])<0) {
//                 largest=fruits[i];
//             }
//         }
//         System.out.println(largest);
//     }
// } // time complexity=O(x*n)

// string builder function
import java.util.*;

public class a178 {

    public static String toUpperCase(String str) {
        StringBuilder sb=new StringBuilder("");

        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++) {
           if(str.charAt(i)==' ' && i<str.length()-1) {
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
           } else {
            sb.append(str.charAt(i));
           }
        }
        return sb.toString();

    }

    public static String compress(String str) {
        String newStr="";
        for(int i=0;i<str.length();i++) {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;

            }
            newStr+=str.charAt(i);
            if(count>1) {
                newStr+=count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {

        String str="aaabbcccdd";
        System.out.println(compress(str));

        // String str="hi , i am viren";
        // System.out.println(toUpperCase(str));

    //    StringBuilder sb=new StringBuilder("");
    //    for(char ch='a';ch<='z';ch++) {
    //     sb.append(ch);
    //    }
    //    System.out.println(sb);
       
    }
}