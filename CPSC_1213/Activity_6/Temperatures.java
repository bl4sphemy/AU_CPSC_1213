import java.util.ArrayList;


/** 

Class to hold an array of integers that represent temperatures.

*/

public class Temperatures {
   
   
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
   
    /** 

    Constructor.
    @param temperaturesIn tempin

    */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
   
      temperatures = temperaturesIn;
   }
   
    /** 

    Displays the lowest value in the array.
    
    @return low

    */
   public int getLowTemp() {
   
      if (temperatures.isEmpty()) {
         return 0;
      }
      else {
         int low = temperatures.get(0);
         for (int i = 0; i < temperatures.size(); i++) {
            if (temperatures.get(i) < low) {
               low = temperatures.get(i);
            }
         }
         return low;
      }
   }
    /** 

    Displays the highest temp in the array.
    
    @return high

    */
   public int getHighTemp() {
      int high = 0;
      if (temperatures.isEmpty()) {
         return 0;
      }
      else {
         for (int temp : temperatures) {
            if (temp > high) {
               high = temp;
            }
         }
         return high;
      }
   }
    /** 

    compares a parameter against the array, and determins the lower value.
    
    @return lowIn
    @param lowIn low temp to compare
    
    */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
    /** 

    compares a parameter against the array, and determins the higher value.
    @return highIn
    @param highIn high temp to compare
    
    */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
    /** 

    Output the data from the tempeerature object.
    @return string containing the array, plus the high and low temp.

    */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }

}