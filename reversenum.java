import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER -->");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int reversen=0;
        while (n>0) {
           int ld=n%10;
           reversen  = (reversen*10)+ld;
           n=n/10;
        }
        System.out.println(reversen);
    }
}
