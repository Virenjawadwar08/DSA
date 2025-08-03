import java.util.Arrays; 
//inbuilt sort
public class a156 {
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        
        Arrays.sort(arr);
        printArr(arr);
    }
}

// to reverse order

// Arrays.sort(arr,Collections.reverseOrder())

// par iske use krne ke liye int ko Integer likhna padega
// to compare two numbers this collections are used 
// also aise bhi likh sakte hai // Arrays.sort(arr,si,ei,Collections.reverseOrder())
//si=starting index, ei= ending index
