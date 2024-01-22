public class NuminInc {
    
    public static void PrintInc(int n){

    if(n==1){
        System.out.print(1);
        return;
    }
    
    PrintInc(n-1);
    System.out.print(n + "");
}


public static void main(String[] args) {
    int n=10;
    PrintInc(n);
}
}
 

//APPROACH 2

// class NuminInc {
    
    
//     static void func(int i, int n){
        
//         // Base Condition.
//         if(i>n) return;
//         System.out.print(i);

//         // Function call to print i till i increments to n.
//         func(i+1,n);

// }
// public static void main(String[] args) {

//    // Here, let’s take the value of n to be 4.
//    int n = 4;
//    func(1,n);
// }
// }