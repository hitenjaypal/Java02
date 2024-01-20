public class armstrong {
    public static void main(String[] args) {
        
    
    
    int n = 153;
    int temp = n;

    int sum = 0;
  


    while (n>0){
        int r = n % 10;
        sum = sum + r*r*r;
        n = n/10;
        

    }

    if(temp==sum){
        System.out.println("The number is an Armstrong number");
     }else{
        System.out.println("The number is not an Armstrong number");

        }
    }
}
    

