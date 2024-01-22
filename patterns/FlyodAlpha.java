public class FlyodAlpha {
    public static void Alpha(int n) {

        for(int i =1;i<=n;i++){
            int a=1;
//1st approach
            // for(int j=1;j<=i;j++){ 
            //     int d =a+64;
            //     char ch = (char)d;  // yaha pr type casting hoga kyuki int ko char mai convert krna hai or // 65 A ka ascii value hai so yahs se print hoga baki 

            //     System.out.print(ch + "");
            // }
    
// 2nd Approach
for(char ch = 'A'; ch<='A'+i;ch++){  //int ke loop ke jagah char ki loop ki chalado 
    System.out.print(ch + " ");
    
}

        System.out.println();
} 
   
   }    
    public static void main(String args[]) {

            int num = 5;
            Alpha(num);
        }
    }
