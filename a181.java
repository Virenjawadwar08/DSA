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

    public static void main(String args[]) {
        // oddOrEven(3);
        // oddOrEven(12);

        System.out.println(getIthBit(10, 2));
    }
}
