import java.util.Scanner;

/** 

This program takes an int as input, and calculates the number of twenties,
tens, fives, and ones and displays the output. 

*/

public class ATM
{

   /** 

   Main method to calculate the user input, and then displays the number of 
   each denomitantion that is required. 
   
   @param args -- (not used).
   
   */
   public static void main(String[] args)
   {  
   
      Scanner userInput = new Scanner(System.in);
      int twenties = 0, 
          tens = 0, 
          fives = 0, 
          ones = 0,
          input = 0,
          original;
      
      // prompt user for dollar value
      System.out.print("Enter the amount: ");
      input = Integer.parseInt(userInput.nextLine());
      original = input;
      
      /* 
      
      Calculates total divided by a denomination, then uses the modulus to 
      determin the remianing value. 
      
      */ 
      
      if (input <= 500) {
         twenties = input / 20;
         input = input % 20;
      
         tens = input / 10;
         input = input % 10;
      
         fives = input / 5;
         input = input % 5;
      
         ones = input / 1;
         input = input % 1;
         
         System.out.println("Bills by denomination: ");
         System.out.println("\t$20: " + twenties);
         System.out.println("\t$10: " + tens); 
         System.out.println("\t$5: " + fives);
         System.out.println("\t$1: " + ones);
         System.out.println("$" + original + " = (" + twenties + " * $20) + (" 
            + tens + " * $10) + (" + fives + " * $5) + (" + ones + " * $1)");
           
      }
      
      else {
         System.out.print("Limit of $500 exceeded!"); 
      }
      
   
      
   
   } //end main
} //end ATM class