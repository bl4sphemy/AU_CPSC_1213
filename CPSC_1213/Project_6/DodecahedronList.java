import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.Iterator;
   
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
  @return average ratio.
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
   @return the array of dodecahedrons. 
   */
   public ArrayList<Dodecahedron> getList() {
      return array;
   }
   
   /**
   This method reads in a file from the system.
   @return the list of dedecahedrons.
   @param fileIn file to read 
   @throws IOException error
   */
   public DodecahedronList readFile(String fileIn) throws IOException {
      Scanner input = new Scanner(new File(fileIn));
      String label = "", color = "";
      double edge = 0;
      listName = input.nextLine();
      ArrayList<Dodecahedron> list = new ArrayList<Dodecahedron>();
      while (input.hasNextLine()) {
         label = input.nextLine();
         color = input.nextLine();
         edge = Double.parseDouble(input.nextLine());
         Dodecahedron ddh = new Dodecahedron(label, color, edge);
         list.add(ddh);   
      }  
      DodecahedronList dList = new DodecahedronList(listName, list);
      System.out.println("\tFile read in and Dodecahedron List created\n");
      return dList;
   }
   /**
   adds a new dodecahedron object to the array. 
   @param labelIn dodecahedron label
   @param colorIn dodecahedron color
   @param edgeIn dodecahedron edge length
   */
   public void addDodecahedron(String labelIn, String colorIn, double edgeIn) {
      Dodecahedron d = new Dodecahedron(labelIn, colorIn, edgeIn);
      if (array.add(d)) {
         System.out.println("\t*** Dodecahedron added ***\n");
      }
   }
   
   /**
   finds a dodecahedron object in the array.
   @return temporary dodecahedron object.
   @param  labelIn label for dodecahedron.
   */
   public Dodecahedron findDodecahedron(String labelIn) {
      String label = "", color = "";
      double edge = 0.0;
      Dodecahedron tempD = new Dodecahedron(label, color, edge);
      for (Dodecahedron d: array) { 
         if (d.getLabel().toUpperCase().equals(labelIn.toUpperCase())) {
            tempD = d;
         }
      }
      if (tempD.getLabel().toUpperCase().equals(labelIn.toUpperCase())) {
         return tempD;
      }
      else {
         return null;
      }
   }
   
   /**
   takes label as a parameter, and deletes a matching object from the array. 
   @param labelIn label for dodecahedron 
   @return dodecahedron object
    */
   public Dodecahedron deleteDodecahedron(String labelIn) {
      Dodecahedron temp = findDodecahedron(labelIn);
      boolean found = false;
      if (labelIn != "") {
         for (Iterator<Dodecahedron> list = array.iterator(); list.hasNext();) {
            Dodecahedron d = list.next();
            if (d.getLabel().toUpperCase().equals(labelIn.toUpperCase())) {
               list.remove();
               found = true;
            }
         }
         if (found) {
            System.out.println("\t\"" + labelIn + "\" deleted\n");   
         }
         else {
            System.out.println("\t\"" + labelIn + "\" not found\n");  
         }
      }
      return temp;
   }
    /**
    edit dodecahedron object in the array.
    @param labelIn dodecahedron label
    @param colorIn dodecahedron color
    @param edgeIn dodecahedron edge length
    @return boolean
    */
   public boolean editDodecahedron(String labelIn, String colorIn,
      double edgeIn) {
      boolean found = false;
      for (Dodecahedron d: array) { 
         if (d.getLabel().toUpperCase().equals(labelIn.toUpperCase())) {
            int index = array.indexOf(d);
            array.get(index).setColor(colorIn);
            array.get(index).setEdge(edgeIn); 
            found = true;  
         }
      }
      return found; 
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