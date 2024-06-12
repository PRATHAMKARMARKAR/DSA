 
import java.util.Scanner;

public class countingnumber {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("ENTER THE NUMBER -->");   
      String n = s.next();
      System.out.println(n.length());
      Scanner k = new Scanner(System.in);
      System.out.println("ENTER THE NUMBER -->");   
      int num = k.nextInt();
      int c = 0;
      while (num>0) {
        c=c+1;
        num = num/10;
      }
      System.out.println(c);
    }
}