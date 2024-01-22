public class StarTriReverse {

    public static void RevTri(int n) {

        for(int i =0;i<=n;i++){

            // for (int j =n;j>i;j--){           //method1 to print  //logic j=n or j>i because weh have to print in reverse the triangle 


                 for (int j=0;j<=n-i+1;j++){      //method2 to print with self logic ese logic build krke bhi code run krskte hai (n-row+1)


                System.out.print("*" );
            }

            System.out.println();
        }
    }

    public static void main (String args[]){
        int num=5;
        RevTri(num);
    }
    
}
