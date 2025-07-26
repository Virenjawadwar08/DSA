import java.util.*;

public class main1219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int Ins=0;
        for(int i=0;i<n;i++) {
            //stars
            for(int j=1;j<=n-i;j++) {
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<Ins;j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n-i;j++) {
                System.out.print("*");
            }
            Ins+=2;
            System.out.println();
        }
        Ins=8;
        for(int i=1;i<=n;i++) {
            //stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<Ins;j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            Ins-=2;
            System.out.println();
        }
        sc.close();
    }
}