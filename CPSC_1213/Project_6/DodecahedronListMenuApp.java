import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;


/**
   dodecahedron list menu app class.
*/
public class DodecahedronListMenuApp {
   /**
      dodecahedron list menue app main function.
      
      @param args -- no args
      @throws IOException 
    */
   public static void main(String[] args) throws IOException {
      
      Scanner userInput = new Scanner(System.in);
      String fileName = "*** no list name assigned ***"; 
      String label = "", color = "";
      double edge = 0.0;
      
      ArrayList<Dodecahedron> ddhArray = new ArrayList<Dodecahedron>();
      DodecahedronList dList = new DodecahedronList(fileName, ddhArray);
      Dodecahedron tempD = new Dodecahedron(label, color, edge);
      
      //print a menu, and prompt user for a choice. diplay output
      //based on selection.
      System.out.println("Dodecahedron List System Menu");
      System.out.println("R - Read File and Create Dodecahedron List");
      System.out.println("P - Print Dodecahedron List");
      System.out.println("S - Print Summary");
      System.out.println("A - Add Dodecahedron");
      System.out.println("D - Delete Dodecahedron");
      System.out.println("F - Find Dodecahedron");
      System.out.println("E - Edit Dodecahedron");
      System.out.println("Q - Quit");
      
      char choice = 'Q';
      do {
      
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'R':
               System.out.print("\tFile Name:  ");
               fileName = userInput.nextLine();
               DodecahedronList ddhList = new DodecahedronList(fileName,
                  ddhArray);
               dList = ddhList.readFile(fileName);
               break;
               
            case 'P':
               System.out.println(dList);
               break;
               
            case 'S':
               System.out.println("\n" + dList.summaryInfo()  + "\n");
               break;
               
            case 'A':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               System.out.print("\tColor: ");
               color = userInput.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(userInput.nextLine()); 
               dList.addDodecahedron(label, color, edge);            
               break;
            
            case 'D':
               String delLabel;
               System.out.print("\tLabel: ");
               delLabel = userInput.nextLine();
               tempD = dList.deleteDodecahedron(delLabel);
               break;
               
            case 'F':
               System.out.print("\tLabel: ");
               String findLabel = userInput.nextLine();
               tempD = dList.findDodecahedron(findLabel);
               if (tempD != null) {
                  System.out.print(tempD + "\n");
                  System.out.print("\n");
               }
               else {
                  System.out.print("\t\"" + findLabel + "\" not found\n\n");
               }
               
               break;
               
            case 'E':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               System.out.print("\tColor: ");
               color = userInput.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(userInput.nextLine()); 
               if (dList.editDodecahedron(label, color, edge)) {
                  System.out.println("\t\"" + label + "\" successfully edited");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found");
               }
               System.out.print("\n");
               break;
               
            case 'Q':
               break;  
            
            default:
               System.out.println("\t*** invalid code ***");     
         }
      
      } while (choice != 'Q');
   }  
}