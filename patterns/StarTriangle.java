public class StarTriangle {
    
    public static void triangle(int n ){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){    // Jo bhi logic hai voh j mai hai i(outerloop) ko toh run krna hi pdega linebyeline Beacuse of lineformed krni hai
                System.out.print("*");
            }
            System.out.println();
        }
    
}
        public static void main(String[] args){
            int num = 5;
            triangle(num);
        }
    

}


