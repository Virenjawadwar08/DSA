import java.util.*;

public class a154 {
    //Selection sort

    public static void selectionSort(int arr[]) {
        for(int i=0;i<arr.length-1;i++) {
            int minPos=i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[minPos]>arr[j]) {
                    minPos=j;
                }
            }

            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
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
        
        selectionSort(arr);
        printArr(arr);
    }
}

// Let's dry run with input: {5, 4, 1, 3, 2}

// 🔁 Pass 1:
// i = 0 → look for min from index 0 to 4

// Found min = 1 at index 2

// Swap arr[0] and arr[2] → {1, 4, 5, 3, 2}

// 🔁 Pass 2:
// i = 1 → look for min from index 1 to 4

// Found min = 2 at index 4

// Swap arr[1] and arr[4] → {1, 2, 5, 3, 4}

// 🔁 Pass 3:
// i = 2 → min = 3 at index 3

// Swap arr[2] and arr[3] → {1, 2, 3, 5, 4}

// 🔁 Pass 4:
// i = 3 → min = 4 at index 4

// Swap arr[3] and arr[4] → {1, 2, 3, 4, 5}

// Now array is sorted!