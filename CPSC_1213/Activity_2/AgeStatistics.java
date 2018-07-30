import java.util.Scanner; 

/** 

This program takes age as a user input and then calculates 
age in minutes, and tells you your maximum heart rate.

*/

public class AgeStatistics {

   /**
   
   Method to takes name, age, and gender and calculates max heartrate.

    @param args Command line arguments (not used).
   
    */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0, gender;
      double maxHeartRate = 0, convertAge;
      
      // prompt user for name
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
       
       // prompt user for age
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
       
       // prompt user for gender 
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
       
      // determine gender, and calculate maxHeartRate.
      if (gender == 1) {
         maxHeartRate = 209 - (0.7 * ageInYears); }
         
      else {
         maxHeartRate = 214 - (0.8 * ageInYears); }
   
      System.out.println("\tYour age in minutes is " 
         + (ageInYears * (60 * 24 * 365)) + " minutes.");
       
      convertAge = ageInYears; 
      System.out.println("\tYour age in centuries is " 
         + (convertAge / 100) + " centuries."); 
         
      System.out.print("Your max heart rate is " + maxHeartRate 
         + " beats per minute.");
       
   } //end main
} //end AgeStatistics class