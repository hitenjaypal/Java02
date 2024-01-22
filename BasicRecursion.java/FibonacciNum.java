// Two number ko add krke ek Number Bna ho usse Fibonacci Number kehte hai 
// fn = fnm1 + fnm2

public class FibonacciNum {
    
    
    public static int fib(int n){

        //base 
        if(n==0 || n==1){
            return n;
        }

        // int fnm1 = fib (n-1);
        // int fnm2 = fib (n-2);
        // int fn = fnm1 + fnm2; 
        // return fn;
           //or
        return fib (n-1)+fib (n-2);

        }

    public static void main(String[] args) {
    int n =4;
   System.out.print(fib(n));
    }

}  