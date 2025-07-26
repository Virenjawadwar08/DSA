//armstrong number
// import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         for(int i=100;i<1000;i++) {
//             if(isArm(i)) {
//                 System.out.println(i+" ");
//             }
//         }

//     }
//         static boolean isArm(int n) {
//             int org=n;
//             int sum=0;
//             while(n>0) {
//                 int rem=n%10;
//                 n=n/10;
//                 sum=sum+rem*rem*rem;
//             }
//             return sum==org;
//         }
//     }


// import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double a=sc.nextDouble();
//         double b=sc.nextDouble();
//         double c=sc.nextDouble();
        
//         System.out.println("average is"+average(a,b,c));
        
//     }
//     public static double average(double x,double y,double z) {
//         return (x+y+z)/3;
//     }

// }

//isEven

// import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int n=sc.nextInt();

//         if(isEven(n)) {
//             System.out.println("number is even");
//         } else {
//             System.out.println("number is odd");
//         }
//     }

//     public static boolean isEven(int a) {
//         if(a%2==0) {
//             return true;
//         } else {
//         return false;
//         }
        
//     }
// }

//palindrome

// import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int pal=sc.nextInt();
//         if(isPlaindrome(pal)) {
//             System.out.println("it is palindrome");
//         } else {
//             System.out.println("it is not a palindrome");
//         }


    // }

//     public static boolean isPlaindrome(int n) {
//         int pal=n;
//         int reverse=0;

//         while(pal!=0) {
//             int rem=pal%10;
//             reverse=reverse*10+rem;
//             pal=pal/10;
//         }

//         if(n==reverse) {
//             return true;
//         } else {
//             return false;
//         }
//     }
// }

// import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         ArrayList<Integer> list=new ArrayList<>();

//         for(int i=0;i<5;i++) {
//             list.add(sc.nextInt());
//         }

//         for(int i=0;i<5;i++) {
//             System.out.println(list.get(i));
//         }
//     }
// }

//swapping in array

// import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//        int[] arr={1,23,4,5,56};
//        swap(arr,1,3);
//        System.out.println(Arrays.toString(arr));
//     }

//     static void swap(int[] arr,int index1,int index2) {
//         int temp=arr[index1];
//         arr[index1]=arr[index2];
//         arr[index2]=temp;
//     }
// }

import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,23,4,5,56};
        System.out.println(max(arr));
       
    }
     static int max(int[] arr) {
            int maxVal=arr[0];
            for(int i=0;i<arr.length;i++) {
                if(arr[i]>maxVal) {
                    maxVal=arr[i];
                }
            }
            return maxVal;
        }
}