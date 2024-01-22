public class RevPyramid {

    public static void Revpyramid(int n) {

        // for outer loop
        for (int i = 0; i < n; i++) {        

            // for space
            for (int j =0; j<=i; j++)     // j<=i logic-- j row no.(i) ke sath increase hoga 
        {
            System.out.print(" ");
        }

            // for star
            for(int j=0;j< 2*n-(2*i+1);j++){       // 2*n-(2*i+1) logic bngea eg- 10-1=9
            
                System.out.print("*");
            }

            // for space
            for (int j =0; j<=i; j++)    // j<=i logic-- j row no.(i) ke sath increase hoga    
        {
            System.out.print(" ");
        }

            System.out.println();

        }
    }

    public static void main(String args[]) {
        int n = 5;
        Revpyramid(n);
    }

}