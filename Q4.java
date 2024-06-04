import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF LINES -->");
        int n = s.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }System.out.println();
    }
}
}