//use a premade program called Scanner

import java.util.Scanner; //always need to import to use

public class Calc 
{
  public static void main(final String[] args)
  {
   //declare the Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.println("Pick a number: ");
    
     double num1 = input.nextInt();
   
    System.out.println("pick another number: ");
   
     double num2 = input.nextInt();
                       
    //fix division
       
     double div1 = num1;
     double div2 = num2;
                       
                       
    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); //addition
    
    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); //subtraction
    
    System.out.println(num1 + " x " + num2 + " = " + (num1 * num2)); //multiplication
    
    System.out.println(num1 + " / " + num2 + " = " + (div1 / div2)); //division
    
    System.out.println(num1 + " to the power of " + num2 + " = " + Math.pow(div1, div2)); //exponent
    
    System.out.println("The square root of " + num1 + " , your first number, = " + Math.sqrt(div1)); //square root of the first number
   
    System.out.println("The square root of " + num2 + " , your second number, = " + Math.sqrt(div2)); //square root of the second number
    
    System.out.println(num1 + " percent of " + num2 + " is equal to: " + (div1 / 100) * div2); //percent
  
  }//end main
}//end class

 
