import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("ENTER THE NUMBER OF LINES");
        int n = s.nextInt();
       for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("* ");
        }System.out.println();
       }
    }
}
