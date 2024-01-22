public class NameNtimes {
    
    public static void NameRepeat(int i , int n){

        //Base Case 

    if(i>n)    //here i stands for iteration toh jb i>n hojyga toh usse return krdenge 
    return;

    System.out.println("Hiten");
//logic
    NameRepeat(i+1,n);  // so base case mai return hojyga so apne next itration (i+1) se print krwyenge 


    }

    public static void main(String[] args) {
        int n =5;
        NameRepeat(1,n);
    }

    }
    
