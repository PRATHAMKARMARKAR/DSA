
public class GCD {
    public static int findGcd(int n1, int n2) {
        // Initialize gcd to 1
        int gcd = 1;

        for (int i = 1; i <= Math.min(n1, n2); i++) {
            // Check if i is a common
            // factor of both n1 and n2
            if (n1 % i == 0 && n2 % i == 0) {
                
                gcd = i;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {
        int n1 = 20, n2 = 15;

    
        int gcd = findGcd(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}