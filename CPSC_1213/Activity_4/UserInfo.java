/** 

UserInfo is a class used to store a users name, location, 
age, and login status. 

*/

public class UserInfo {
   
   //instance variables
   private String firstName, lastName, location;
   private int age, status;

   private static final int OFFLINE = 0, ONLINE = 1;

   
   /** 
   
   This is the constuctor or the UserInfo Class. It takes a users first 
   and last name as parameters.  
   
   @param firstNameIn first name of user.
   @param lastNameIn last name of user.
   
   */

   public UserInfo(String firstNameIn, String lastNameIn) {
   
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not Specified";
      age = 0;
      status = OFFLINE;
   
   }

     
   /** 
   
   toString method is used to output the user data of the object.
   
   @return output 
   
   */
   
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
   
  /** 
   
   setLocation method set's the location attribute.
   
   @param locationIn location to be updated.
    
   */
   
   public void setLocation(String locationIn) {
   
      location = locationIn;
   
   }
   
   /** 
   
   setAge method set's a new age value, and returns a boolean result.
   
   @return isSet 
   @param ageIn age value to update. 
   
   */
   
   public boolean setAge(int ageIn) {
   
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   
   }
   
  /** 
   
   getAge method returns the age attribute for the object. 
   @return age  
   
   */
   
   public int getAge() {
      return age;
   
   } 
   
   /** 
   
   getLocation method returns the location attribute.
   
   @return location  
   
   */  
   
   public String getLocation() {
      return location;
   
   }
   
   /** 
   
   logOff method set's status to false.
   
   */
   
   public void logOff() {
      status = OFFLINE;
   }
   
   /** 
   
   logOn method set's status to true.
   
   */
   
   public void logOn() {
      status = ONLINE;
   }

}