public class ReverseNumber {

    public static void main (String args[]) {
        int n = 1008;
    //    int rev = 0;  //when store the reverse value 

        while (n>0){
            int lastDigit = n % 10; // Module gives us last digit of number 
            // rev = (rev*10) + lastDigit;
            System.out.print(lastDigit + " ");
            n = n/10; // It does the number small // if we dont apply this then the while loop will be infinite 

        }
    }
}