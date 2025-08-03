import java.util.*;
//insertion sort 

public class a155 {

    public static void insertionSort(int arr[]) {
        for(int i=1;i<arr.length;i++) {
            int curr=arr[i];
            int prev=i-1;

            //finding out correct pos to insert
            while(prev>=0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
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
        
        insertionSort(arr);
        printArr(arr);
    }
}


//      Dry Run with Example {5, 4, 1, 3, 2}
// Pass 1 (i = 1): curr = 4
// Compare with 5 → 5 > 4 → shift

// Insert 4 at index 0 → {4, 5, 1, 3, 2}

// Pass 2 (i = 2): curr = 1
// Compare with 5 → shift

// Compare with 4 → shift

// Insert 1 at index 0 → {1, 4, 5, 3, 2}

// Pass 3 (i = 3): curr = 3
// Compare with 5 → shift

// Compare with 4 → shift

// Insert 3 at index 1 → {1, 3, 4, 5, 2}

// Pass 4 (i = 4): curr = 2
// Compare with 5 → shift

// Compare with 4 → shift

// Compare with 3 → shift

// Insert 2 at index 1 → {1, 2, 3, 4, 5}

