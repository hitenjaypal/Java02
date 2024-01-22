public class PyramidPattern {

    public static void pyramid(int n) {

        // for outer loop
        for (int i = 0; i < n; i++) {

            // for space
            for (int j =0; j<n-i-1; j++)     // n-i-1 logic behind space empty
        {
            System.out.print(" ");
        }

            // for star
            for(int j=0;j< 2*i+1;j++){       // 2*i+1
            
                System.out.print("*");
            }

            // for space
            for (int j =0; j<n-i-1; j++)    // n-i-1 logic behind space empty
        {
            System.out.print(" ");
        }

            System.out.println();

        }
    }

    public static void main(String args[]) {
        int n = 5;
        pyramid(n);
    }

}