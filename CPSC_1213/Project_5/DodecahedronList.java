import java.util.ArrayList;
import java.text.DecimalFormat;

 


/** 

Class to create an ArrayList of Dodecahedron objects. 

*/

public class DodecahedronList {

   private String listName;
   private ArrayList<Dodecahedron> array;
   
  /**

  Constructor.

  @param listNameIn listname
  @param arrayIn array

  */
   public DodecahedronList(String listNameIn,
       ArrayList<Dodecahedron> arrayIn) {
      
      listName = listNameIn;
      array = arrayIn;
   }
   
  /** 

  @return list name

  */
   public String getName() {
      return listName;
   }
   
  /** 
  
  @return number of dodecahedrons.

  */
   public int numberOfDodecahedrons() {
      int num;
      if (array.size() != 0) {
         return array.size();
      } 
      else {
         return 0;
      }
   }
   
  /** 

  @return surface area.

  */
   public double totalSurfaceArea() {
      double surfaceArea = 0;
      int index = 0;
      while (index < array.size()) {
         surfaceArea += array.get(index).surfaceArea();
         index++;
      }
      return surfaceArea;
   }
   
  /** 

  @return total volume.

  */
   public double totalVolume() {
      double totalVol = 0;
      int index = 0;
      while (index < array.size()) {
         totalVol += array.get(index).volume();
         index++;
      }
      return totalVol;
   }
   
  /** 

  @return average area.

  */
   public double averageSurfaceArea() {
      double avgArea = 0;
      if (array.size() > 0) {
         avgArea = totalSurfaceArea() / array.size();
      }
      return avgArea;
   }
  
  /** 

  @return average volume.

  */ 
   public double averageVolume() {
      double avgVol = 0;
      if (array.size() > 0) {
         avgVol = totalVolume() / array.size();
      }
      return avgVol;
   }
   
  /** 

  @return average ratio

  */
   public double averageSurfaceToVolumeRatio() {
      double avgRatio = 0, totalRatio = 0;
      int index = 0;
      while (index < array.size()) {
         totalRatio += array.get(index).surfaceToVolumeRatio();
         index++;
      }
      if (array.size() > 0) {
         avgRatio = totalRatio / array.size();
      }
      return avgRatio;
   }
   
   /** 

   @return average surface to volume ratio.

   */ 
   public double avarageSurfaceToVolumeRatio() {
      double ratio = 0;
      int index = 0;
      while (index < array.size()) {
         ratio += array.get(index).surfaceToVolumeRatio();
         index++;
      }
      return ratio;
   }
  /** 

  @return summary info

  */ 
   public String summaryInfo() {
      DecimalFormat f = new DecimalFormat("#,##0.0##");
      String output = "";
      output += "----- Summary for " + getName() + " -----";
      output += "\nNumber of Dodecahedrons: " + numberOfDodecahedrons();
      output += "\nTotal Surface Area: " + f.format(totalSurfaceArea());
      output += "\nTotal Volume: " + f.format(totalVolume());
      output += "\nAverage Surface Area: " + f.format(averageSurfaceArea());
      output += "\nAverage Volume: " + f.format(averageVolume());
      output += "\nAverage Suface/Volume Ratio: "
         + f.format(averageSurfaceToVolumeRatio());
      return output;
   }
   
  /** 

  @return output

  */ 
   public String toString() {
      String output = listName + "\n";
      int index = 0;
      while (index < array.size()) {
         output += "\n" + array.get(index) + "\n";
         index++;
      }
      return output; 
   }
}