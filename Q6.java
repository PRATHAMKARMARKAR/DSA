import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        
        System.out.println("ENTER THE NUMBER OF LINES");
        int n = s.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for(int j=0;j< i*2-1;j++){
                System.out.print("*");
                
            }
            System.out.println();
        }
        
    }
}