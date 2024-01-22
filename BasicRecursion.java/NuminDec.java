
public class NuminDec {

    public static void printDec(int n){
    
    if(n==1){     // Recursion mai Base Case daalna pfta hai kyuki logic mai n + (n-1) hota hau so fn khud ko hi call krta hia bar bar to easy the process Eg n +(n-1)
       
        //But, when there is no base condition given for a particular recursive function, it gets called indefinitely which results in a Stack Overflow i.e, exceeding the memory limit of the recursion stack and hence the program terminates giving a Segmentation Fault error. 
        System.out.print(1);
        return;  //niche return hone ke liye 
    }


    System.out.print(n+" ");  // (n + n-1)
    printDec(n-1);     // this will run the logic 
}

    public static void main(String[] args) {
        int n = 10;
       printDec(n);
    }
}
