//approach 1
// Created A int Function 

import java.util.*;
public class CountDigit {

  public static int count_digits(int n) {

    String n2 = Integer.toString(n);  //The toString() method of Java Integer class returns a string equivalent of this Integer's value. This method gives the same result as Integer.toString(int i). It overrides the toString() method of class Object.
    return n2.length();    //Basic Approach to count tha digit  // To count the digit 


  }


  public static void main(String args[]) {

    int n = 12345;
    System.out.println("Number of digits in " + n + " is " + count_digits(n));


  }
}