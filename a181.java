public class a181 {
    //check if odd or even

    public static void oddOrEven(int n) {
        int bitmask=1;
        if((n&bitmask)==0) {
            //even number 
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static int getIthBit(int n,int i) {
        int bitmask=1<<i;
        if((n&bitmask)==0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n,int i) {
        int bitmask=1<<i;
        return n | bitmask;
    }


// concept a<<b=a*2^b
// a>>b=a/2^b


public static int clearIthBit(int n,int i) {
    int bitmask=~(1<<i);
    return n & bitmask;
}

public static int updateBit(int n,int i,int newBit) {
    n=clearIthBit(n,i);

    int bitmask=newBit<<i;
    return n | bitmask;
}

public static int clearIBits(int n,int i) {
    int bitmask=(~0)<<i;
    return n & bitmask;
}

public static int clearBitsinRange(int n,int i,int j) {
    int a=((~0)<<(j+1));
    int b=(1<<i)-1;
    int bitmask=a|b;
    return n & bitmask;
}

public static boolean isPowerOfTwo(int n) {
    return (n&(n-1))==0;
}

public static int countSetBits(int n) {
    int count=0;
    while(n>0) {
        if((n&1)!=0) {
            count++;
        }
        n=n>>1;
    }
    return count;
}

public static int fastExpo(int a ,int n) {
    int ans=1;

    while(n>0) {
        if((n & 1)!=0) {
            ans=ans*a;
        }
        a=a*a;
        n=n>>1;
    }
    return ans;
}

    public static void main(String args[]) {
        // oddOrEven(3);
        // oddOrEven(12);

        // System.out.println(getIthBit(10, 2));

        // System.out.println(setIthBit(10, 2));

        // System.out.println(clearIthBit(10, 1));

        // System.out.println(updateBit(10, 2,1));

        // System.out.println(clearIBits(15, 2));

        // System.out.println(clearBitsinRange(10, 2, 4));

        // System.out.println(isPowerOfTwo(15));

        // System.out.println(countSetBits(15));

        System.out.println(fastExpo(3, 5));
    }
}
