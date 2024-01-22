// i-outerloop-denoted by(n)
// j-innerloop-denoted by(m)
// Rules :-
// 1-- Outerloops specially for lines(-------)

// 2--specially for columns and connect them somehow to the rows  
//  -- Inner loops are used to print stars(*) in each line.

// 3--Print them inside the inner forloop

// 4-- Observe the symmetry

// loop o se start krni hai jb star pattern ho
// loop 1 se start krni hai jb number pattern ho


import java.util.*;

public class starsquare{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();

        System.out.println("Enter the number of columns:");
        int m = sc.nextInt();

        for(int i=1;i<n;i++){
            for (int j=1; j<m;j++){
                 
                System.out.print("* ");
            }
            System.out.println();
        }





    }

}
