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

    public static void main(String args[]) {
        oddOrEven(3);
        oddOrEven(12);
    }
}
