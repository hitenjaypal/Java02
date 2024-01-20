public class GCD {
    public static void main(String[] args) {
        
    int num1 = 3, num2 = 6;
    int ans = 1;

    for(int i=1;i <= Math.min(num1,num2); i++){  // also i<n 
        if(num1 % i ==0 && num2 % i ==0) {
            ans = i;  // because every number has gcd of 1 therefore we have done this if both gwt wrong then the ans will print as 1 
        }
    }
    System.out.println("The gcd of two number is " + ans);
}

}
