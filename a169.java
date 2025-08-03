// import java.util.*;

// public class a169 {

    // Question 1 :Print the number of 7’s that are inthe 2d array.Example :Input - int[][] array = { {4,7,8},{8,8,7} };Output - 2


//     public static void main(String[] args) {
//         int nums[][]={{4,7,8},{8,8,7}};
//         int count=0;
        
//         for(int i=0;i<nums.length;i++) {
//             for(int j=0;j<nums[i].length;j++) {
//                 if(nums[i][j]==7) {
//                     count++;
//                 }
//             }
//         }
//         System.out.println("number of 7's is :"+count);
//     }
// }



// Question 2 :Print out the sum of the numbers inthe second row of the “nums” array.Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };Output - 18

// import java.util.*;

// public class a169 {
//     public static void main(String[] args) {
//         int nums[][]={{1,4,9},
//                      {11,4,3},
//                       {2,2,3}};
//                       int sum=0;
        // We want to sum the second row, which is at index 1
//        for(int j=0;j<nums[1].length;j++) {
//         sum+=nums[1][j];
//        }
//        System.out.println("Sum of second row: " + sum);
//     }
// }

// 3.Write a program to FindTransposeofa Matrix.What is Transpose?

import java.util.*;

public class a169 {

    public static void printMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int [][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        int[][] transpose=new int[cols][rows];

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
    }
     public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int[][] transposedMatrix = transpose(matrix);

        System.out.println("\nTransposed Matrix:");
        printMatrix(transposedMatrix);
    }
}