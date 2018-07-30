import java.util.ArrayList;
import java.text.DecimalFormat;

/** 

Some javadoc comment here

*/

public class DodecahedronList {

   private String listName;
   private ArrayList<Dodecahedron> array;
   
   /**

   Constructor

   @param args -- (not used).

   */
   private DodecahedronList(String listNameIn, ArrayList<Dodecahedron> arrayIn) {
      
      listName = listNameIn;
      array = arrayIn;
   }
   private String getName() {
      return listName;
   }
   private int numberOfDodecahedrons() {
      int num;
      if (array.size() != 0) {
         return array.size();
      } 
      else {
         return 0;
      }
   }
   private double totalSurfaceArea() {
      return 0;
   }
   private double totalVolume() {
      return 0;
   }
   private double avarageSurfaceArea() {
      return 0;
   }
   private double averageVolume() {
      return 0;
   }
   private double avarageSurfaceToVolumeRatio() {
      return 0;
   }
   private String summaryInfo() {
      return "";
   }
   public String toString() {
      return ""; 
   }
}