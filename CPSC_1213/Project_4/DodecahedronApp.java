import java.util.Scanner;


/** 

Simple app that takes userinfo related to a dodecahedron object, and 
performs calculation on the attributtes. 

*/

public class DodecahedronApp {
   
   /**

   main function. 

   @param args -- (not used).

   */

   public static void main(String[] args) {
      
      /**
      Prompt user for specs, calculate volume, area, and ratio, 
      return formatted output.
      */
      
      System.out.print("Enter label, color, and edge length "
         + "for a dodecahedron.");
      System.out.print("\n\tlabel: ");
      Scanner dd = new Scanner(System.in);
      String label = dd.nextLine();
      System.out.print("\tcolor: ");
      String color = dd.nextLine();
      System.out.print("\tedge: ");
      String edge = dd.nextLine();
      double length = Double.parseDouble(edge);
      if (length > 0) {
         Dodecahedron object1 = new Dodecahedron(label, color, length);
         String output = object1.toString();
         System.out.print("\n");
         System.out.print(output);
      }
      else {
         System.out.print("Error: edge must be greater than 0.");
         return;
      }
   }
}