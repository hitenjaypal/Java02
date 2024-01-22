public class halfbothsidepyramid {
    
    public static void halfboth(int n){

    for (int i=1;i<=2*n-1;i++){  // i<=2*n-1 kyuki 9 line/rows print krni hai

        int stars = i;             // kyuki rows jyda hai toh if statement mai break krenege asper symmetry required 

        if(i>n) stars =2*n-i;         // agr 5th pr pohch jygi then waha se break hojygi then star wala logic apply hoga as per symmetry required 

         for (int j=1;j<=stars;j++){
 

            System.out.print("* ");   // * is the symbol of star
         }
         System.out.println();       // nextline ki shuru ho skte ha
    }
}
public static void main (String args[]){
int n=5;
    halfboth(n);

}
}
