public class Panlindrone {
    public static void main (String args[]) {
        int n = 151;
        int duplicate = n; // or int temp here we are storing temporary value because we are perfom many tasks on original value so we cant want to lose it
       int rev = 0;  //when store the reverse value 

        while (n>0){
            int lastDigit = n % 10; // Module gives us last digit of number 
            rev = (rev*10) + lastDigit;
            System.out.print(lastDigit + " ");
            n = n/10; // It does the number small // if we dont apply this then the while loop will be infinite 

        }

        // if (n==rev){ // It will give wrong ans cuz of n will change at the last beacuse it divivde till end therefore we store n induplicate 

        if (duplicate==rev){ 

            System.out.print("True");
        } else{
        System.out.println("False");
        }
    }
}
