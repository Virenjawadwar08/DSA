import java.util.*;

public class main1218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++) {
            //space
            for(char ch=(char)('E'-i);ch<='E';ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
}