//approach 1
// Created A int Function 

// import java.util.*;
// public class CountDigit {

//   public static int count_digits(int n) {

//     String n2 = Integer.toString(n); //built in fn  //The toString() method of Java Integer class returns a string equivalent of this Integer's value. This method gives the same result as Integer.toString(int i). It overrides the toString() method of class Object.
//     return n2.length();    //Basic Approach to count tha digit  // To count the digit 


//   }


//   public static void main(String args[]) {

//     int n = 12345;
//     System.out.println("Number of digits in " + n + " is " + count_digits(n));


//   }
// }


public class CountDigit { 
  public static int count_digits(int n)
  {
     int x = n;   // no ko variable x mai store krdia 
     int count =0;

     while( x!=0 )    // if voh zero nai hai 
    {
        x = x / 10;  // last digit hatadega 
        count++;     // count aage bdhega 
    }
     return count;   // no.of counts dedega 
  } 
  public static void main(String args[]) 
  { 
       int n = 12345;
      System.out.println("Number of digits in "+n+" is "+count_digits(n));
  } 
}