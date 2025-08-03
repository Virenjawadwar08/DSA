import java.util.*;

public class a175 {
// string charAt method

    public static void printLetters(String str) {
        for(int i=0;i<str.length();i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstname="Viren";
        String lastname="Jawadwar";
        String fullName=firstname+" "+lastname;

        printLetters(fullName);
        
    }
}