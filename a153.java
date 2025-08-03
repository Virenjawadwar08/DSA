import java.util.*;
//bubble sort
public class a153 {

    public static void bubbleSort(int arr[]) {
        for(int turn=0;turn<arr.length-1;turn++) {
            for(int j=0;j<arr.length-1-turn;j++) {
                if(arr[j]>arr[j+1]) {
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       int arr[]={5,4,1,3,2};
       bubbleSort(arr);
       printArr(arr);
    }
}

// Initial array: {5, 4, 1, 3, 2}

// Pass 1 (turn = 0)
// Compare 5 and 4 → swap → {4, 5, 1, 3, 2}

// Compare 5 and 1 → swap → {4, 1, 5, 3, 2}

// Compare 5 and 3 → swap → {4, 1, 3, 5, 2}

// Compare 5 and 2 → swap → {4, 1, 3, 2, 5}

// Biggest number 5 is at the end now.

// Pass 2 (turn = 1)
// Compare 4 and 1 → swap → {1, 4, 3, 2, 5}

// Compare 4 and 3 → swap → {1, 3, 4, 2, 5}

// Compare 4 and 2 → swap → {1, 3, 2, 4, 5}

// Now 4 is in place, and so on…