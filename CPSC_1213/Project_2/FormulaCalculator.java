import java.util.Scanner;

/** 

This program takes user input and uses it to fill in an equation. 

*/

public class FormulaCalculator
{

   /** 

   Main method accepts input for variables x, y, z, and inserts it into a 
   mathmatical function. 
   
   @param args -- (not used).

   */
   public static void main(String[] args)
   {
    
      Scanner userInput = new Scanner(System.in);
      double total, xVar, yVar, zVar;
    
      System.out.println("result = (2x - 7.4) (4y + 9.3) (6z - 11.2) / xyz");
      System.out.print("\tEnter x: ");
      xVar = userInput.nextDouble();
      System.out.print("\tEnter y: ");
      yVar = userInput.nextDouble();
      System.out.print("\tEnter z: ");
      zVar = userInput.nextDouble();
      total = ((2 * xVar) - 7.4) * ((4 * yVar) + 9.3) * ((6 * zVar) - 11.2) 
         / (xVar * yVar * zVar);
      //print 0 if the total is less than or equal to 0
      if (total == 0) {
         System.out.println("result = 0.0");
         if (xVar == 0 || yVar == 0 || zVar == 0) {
            total = 0;
         }
      } 
      //print total if it it greater than zero
      else {
         System.out.println("result = " + total);
      } 
   } //end main


} //end program