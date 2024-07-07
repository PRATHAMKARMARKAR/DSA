public class Q9 {
    // Method to print an erect pyramid
    static void erect_pyramid(int N) {
        // Outer loop for rows
        for (int i = 0; i < N; i++) {
            // Loop to print spaces before stars in each row
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Loop to print stars in each row
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Loop to print spaces after stars in each row
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Move to the next line after printing stars for each row
            System.out.println();
        }
    }

    // Method to print an inverted pyramid
    static void inverted_pyramid(int N) {
        // Outer loop for rows
        for (int i = 0; i < N; i++) {
            // Loop to print spaces before stars in each row
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Loop to print stars in each row
            for (int j = 0; j < 2 * N - (2 * i + 1); j++) {
                System.out.print("*");
            }

            // Loop to print spaces after stars in each row
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Move to the next line after printing stars for each row
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        // Value of N
        int N = 5;
        
        // Print erect pyramid
        erect_pyramid(N);
        
        // Print inverted pyramid
        inverted_pyramid(N);
    }
}
