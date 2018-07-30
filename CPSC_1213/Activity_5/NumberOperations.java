/** 

This class creates a NumberOperations object, that stores a number.
It can also calculate the number of odds and powers below the number. 

*/

public class NumberOperations {


   private int number; 
   
   /**
   * Constructor, sets a numberIn parameter to the number attribute.
   * @param numberIn 
   */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
    /**
    * gets the value of number.
    * @return number 
    */ 
   public int getValue() {
      return number; 
   }
   /**
   * Counts the odd numbers smaller than the user supplied number.
   * @return output
   */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
    /**
    * Calculates all of the squared values smaller than number.
    * @return output
    */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
    /**
    * Compares two intergers, and determins which is larger. returns 1 if
      number is larger larger, -1 if it is less than.
      @return int
      @param compareNumber This is the value being compared to number.
    */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
         
   }
    /**
    * Returns number as a String.
    * @return String
    */
   public String toString() {
      return number + "";
   }

}