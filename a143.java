import java.util.*;
// max sum subarray kadane's algo
public class a143 {
    public static void subSum(int numbers[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];

        //calculate prefi<numbersay
        for(int i=1;i<prefix.length;i++) {
            prefix[i]=prefix[i-1]+numbers[i];
        }

        for(int i=0;i<numbers.length;i++) {
            int start=i;
            for(int j=i;j<numbers.length;j++) {
                int end=j;

                currSum=start==0?prefix[end]: prefix[end]-prefix[start-1];
               
                if(maxSum<currSum) {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum:"+maxSum);
    }
      public static void kadane(int numbers[]) {
    int ms = Integer.MIN_VALUE;
    int cs = 0;
    boolean allNegative = true;
    int maxElement = numbers[0];

    for (int i = 0; i < numbers.length; i++) {
        cs = cs + numbers[i];

        if (numbers[i] >= 0) {
            allNegative = false;
        }

        maxElement = Math.max(maxElement, numbers[i]);

        if (cs < 0) {
            cs = 0;
        }

        ms = Math.max(cs, ms);
    }

    if (allNegative) {
        System.out.println("All elements are negative. Max subarray sum is: " + maxElement);
    } else {
        System.out.println("Max subarray sum is = " + ms);
    }
}
}