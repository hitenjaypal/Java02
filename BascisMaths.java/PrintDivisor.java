public class PrintDivisor {
    
    public static void PrintDivisor (int n) {

        System.out.print("The divisors of are: ");

        for(int i = 1; i<= (int)Math.sqrt(n);i++) {  // or for(int i = 1; i <= n; i++)
            if(n % i == 0){
                System.out.print(i + " ");

        }
    }
    }

    public static void main(String[] args){
		int n = 36;
		PrintDivisor(n);
		
	}

}
