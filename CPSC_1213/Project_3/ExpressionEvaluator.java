import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/** 

Program to take a value and solves a given expression. 

*/

public class ExpressionEvaluator {
   
   /**
   
   Main function in ExpressionEvaluator program. 
   Takes user input, solves an expression, and formats the results.
   
   @param args -- (not used). 
   
   */
   
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      String stringResult, fResult;
      double x = 0.0, result = 0.0, numerator, denominator;
      int left, right, length, decimal;
   
      /**   
      Math code to solve the expression. 
      */
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      numerator = Math.pow((3 * Math.pow(x, 5)) - (2 * Math.pow(x, 3)), 2); 
      denominator = Math.sqrt(Math.abs(16 * Math.pow(x, 7))) + 1;
      result = numerator / denominator;
      System.out.print("\nResult: " + result);
     
      /* 
      Code to convert user input to string, then find the length
      and decimal 
       */
      stringResult = Double.toString(result);
      decimal = stringResult.indexOf(".");
      length = stringResult.length();
      System.out.print("\n# digits to left of decimal point: " + (decimal));
      System.out.print("\n# digits to right of decimal point: " 
         + ((length - decimal) - 1));
      
      DecimalFormat decFormat = new DecimalFormat("###,##0.0####");
      fResult = decFormat.format(result);
      //fResult = decFormat.format(Double.parseDouble(result));
      System.out.print("\nFormatted Result: " + fResult);
   
   }

}