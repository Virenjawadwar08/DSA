import java.util.*;
//diagonal sum

//In even matrix we can add the diagonal elements eg. 4x4 whereas in odd matrix eg. 3x3 there happens to be an overlapping element so will count that element in sum only once

public class a167 {

    public static int diagonalSum(int matrix[][]) {
        int sum=0;
        // we are doing the below procedure for to find the sum of primary diagonal that is from left top to right bottom

    //     for(int i=0;i<matrix.length;i++) {
    //         for(int j=0;j<matrix[0].length;j++) {
    //             if(i==j) {
    //                 sum+=matrix[i][j];
    //             }
    //             //from right top to left bottom diagonal
    //             else if(i+j==matrix.length-1) {
    //                 sum+=matrix[i][j];
    //             }
    //         }
    //     }
    //     return sum;
    // }


    //the commented part is brute force method 

    //optimised solution is given below

    for(int i=0;i<matrix.length;i++) {
        //primary diag

        sum+=matrix[i][i];

        //secondary diag

        if(i!=matrix.length-1-i) {
            //this is when i is not equal to j
            sum+=matrix[i][matrix.length-i-1];
        }}
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
    {5,6,7,8},
{9,10,11,12},
{13,14,15,16}};

System.out.println(diagonalSum(matrix));
    }
}