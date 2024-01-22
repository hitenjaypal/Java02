public class SumNaturalNum {
    
    public static int sum(int n) {

        if(n==0)
        return 0;
//above base case return hojyga kyuki condition false hojygi so niche jakr return krdega n + sum(n-1)
// eg 6+5->(store)11+4->15+3->18+2->20+1->21+0(condition khtm)
        return n + sum(n-1);  // Recursion Function 
    }
   
    public static void main(String[] args) {
        int n = 6;
       System.err.println(sum(n)); 
    }
}
