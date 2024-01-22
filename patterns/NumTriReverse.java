public class NumTriReverse {

    public static void RevTri(int n) {

        for(int i =1;i<=n;i++){

            // for (int j =n;j>i;j--){           //method1 to print  //logic j=n or j>i because weh have to print in reverse the triangle 

                // (n-row+1) logic

                 for (int j=1;j<=n-i+1;j++){      //method1 to print with self logic ese logic build krke bhi code run krskte hai 


                System.out.print(j+ "" );
            }

            System.out.println();
        }
    }

    public static void main (String args[]){
        int num=5;
        RevTri(num);
    }
    
}
