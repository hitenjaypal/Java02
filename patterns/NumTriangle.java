public class NumTriangle {
    public static void Num(int n) {

        // loop o se start krni hai jb star pattern ho
        // loop 1 se start krni hai jb number pattern ho

        for(int i =1;i<=n;i++){

            for(int j=1;j<=i;j++){  //here j<=i because of inner loop increment for connection to outerloop. we are printing Columns to connect Rows
 
                System.out.print(j+ "");
            }
        
        System.out.println();
} 
   
   }    
    public static void main(String args[]) {

            int num = 5;
            Num(num);
        }
    }

