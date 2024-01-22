public class NumTriangle2 {
    
    public static void TriCol (int n) {

        for(int i=1;i<=n;i++) {

            for(int j=1;j<=i;j++) {

                System.out.print(i +""); // Printing simply no.ofrows in every line
            }

            System.out.println();
        }
    
    }

    public static void main (String args[]){
        int num =5;
        TriCol(num);

    }
}
