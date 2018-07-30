import java.text.DecimalFormat; 

/** 

Class to gather information about a dodecahedron instance, and perform 
calculations based on the size of the edges.

*/

public class Dodecahedron {
   

   private String label = "", color = ""; 
   private double edge = 0.0;
   
   /** 

   Constructor.

   @param labelIn label to be stored
   @param colorIn color to be stored
   @param edgeIn edge to be stored

   */
   
   public Dodecahedron(String labelIn, String colorIn, Double edgeIn) {
      label = labelIn;
      color = colorIn;
      edge = edgeIn;
   
   }
   
   /** 

   Mutator method to set the label string, and return a boolean value.
   @param labelIn is the label to be set. 
   @return boolean

   */
   
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
   
   /** 

   Mutator method sets the color instance variable.
   @param colorIn the color to be set in the instance variable.
   @return boolean

   */

   public boolean setColor(String colorIn) {
      if (colorIn != null) {
         color = colorIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
   
   /** 

   Mutator method sets the edge instance variable.
   @param edgeIn the edge length to be tored in an instance variable.
   @return boolean 

   */
   
   public boolean setEdge(double edgeIn) {
      if (edgeIn > 0) {
         edge = edgeIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /** 

   Accessor method to get label.
   @return label

   */
   
   public String getLabel() {
      return label; 
   }
   
   /** 

   Accessor method to get color.
   @return color

   */

   public String getColor() {
      return color;
   }
   
   /** 

   Accessor method to get edge length.  
   @return edge

   */

   public double getEdge() {
      return edge;
   }
   
   /** 

   Calculates the surface area of the object.
   @return area

   */

   public double surfaceArea() {
      double area = (3 * Math.sqrt(25 
         + (10 * Math.sqrt(5)))) * Math.pow(edge, 2);
      return area;   
   }
   
   
   /**
   
   Method to calculate the volume.
   @return vol
   
   */
   public double volume() {
      double vol = 0.0;
      double num = (15 + (7 * Math.sqrt(5)));
      vol = ((num / 4) * Math.pow(edge, 3));
      return vol; 
   }
   
   /** 

   Simple method to calculate the surface to volume ratio.
   @return ratio 

   */
   
   public double surfaceToVolumeRatio() {
      double area = surfaceArea();
      double vol = volume();
      double ratio = (area / vol);
      return ratio;
   }
   
   /** 

   Method to preform calculations, and dispaly output. 
   @return String

   */
   public String toString() {
      double area = surfaceArea();
      double vol = volume();
      double ratio = surfaceToVolumeRatio();
      DecimalFormat decFormat = new DecimalFormat("#,##0.0##");
      String output = "Dodecahedron \"" + label + "\" is \"" + color 
         + "\" with 30 edges of length " + decFormat.format(edge) + " units.";
      output += "\n\tsurface area = " + decFormat.format(area) 
         + " square units";
      output += "\n\tvolume = " + decFormat.format(vol) + " cubic units";
      output += "\n\tsurface/volume ratio = " 
          + decFormat.format(ratio);
      return output;
   }
}