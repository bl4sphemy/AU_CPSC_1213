import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
   dodecahedron list app class.
*/
public class DodecahedronListApp {
   /**
      dodecahedron list app main function.
      
      @param args -- no args
      @throws IOException 
    */
   public static void main(String[] args) throws IOException {
      ArrayList<Dodecahedron> list = new ArrayList<Dodecahedron>();
      String listName = "", label = "", color = "";
      double edge = 0;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = input.nextLine();
      System.out.println();
      Scanner file = new Scanner(new File(fileName));
      listName = file.nextLine();
      while (file.hasNext()) {
         label = file.nextLine();
         color = file.nextLine();
         edge = Double.parseDouble(file.nextLine());
         Dodecahedron ddh = new Dodecahedron(label, color, edge);
         list.add(ddh);
      }
      DodecahedronList dList = new
         DodecahedronList(listName, list);
      System.out.println(dList);
      System.out.println();
      System.out.println(dList.summaryInfo());
   }
}