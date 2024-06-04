import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        
        System.out.println("ENTER THE NUMBER OF LINES");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(n-i)-1; j++) {
                System.out.print("*");
                if (j < (2 * (n - i) - 2)) { 
                    System.out.print(" ");
                }
            }
           
            System.out.println();
        }
    }
}
