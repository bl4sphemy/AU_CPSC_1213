import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

/** 

Program to takes a string from the user, 
and parses it to extrapolate data about a ticket.  

*/

public class SpaceTicket {

   static final double STUDENT_DISCOUNT = .25;
   static final double CHILD_DISCOUNT = .35;
   
   /**

   main function takes a string, and formats the output.

   @param args -- (not used).

   */

   public static void main(String[] args) {
   
      Scanner ticket = new Scanner(System.in);
      System.out.println("Enter ticket code: ");
      String spaceTicket = ticket.nextLine();
   
      // print "Invalid ticket code" if the sting is less than 25 char
      if (spaceTicket.length() < 25) {
         System.out.println("*** Invalid ticket code ***");
         System.out.println("Ticket code must have at least 25 characters");
         return;
      }
      
      // find the position of the '.'
      int point = 0;
      for (int i = 0; i < spaceTicket.length(); i++) {
         if (spaceTicket.charAt(i) >= 'a' && spaceTicket.charAt(i) <= 'z') {
            point = i;
            break;
         }
      }
       
      String price = spaceTicket.substring(0, point);
      String category = spaceTicket.charAt(point) + ""; 
      String cost = price;
      // adjusting the decimal point.
      cost = Double.toString(Double.parseDouble(cost) / 100);
      // discount.
      if (category.equals("s")) {
         cost = Double.toString(Double.parseDouble(price) 
            / 100 * (1 - STUDENT_DISCOUNT));
      } 
      else if (category.equals("c")) {
         cost = Double.toString(Double.parseDouble(price) 
            / 100 * (1 - CHILD_DISCOUNT));
      }
      // parse description, time, date, seat 
      String time = spaceTicket.substring(point + 1, point + 5);
      String date = spaceTicket.substring(point + 5, point + 13);
      String seat = spaceTicket.substring(point + 13, point + 16);
      String description = spaceTicket.substring(point + 16);
      System.out.println("Space Ticket: " + description);
      System.out.println("Date: " + date.substring(0, 2) + "/" 
         + date.substring(2, 4) + "/" + date.substring(4) + "   Time: " 
         + time.substring(0, 2) + ":" + time.substring(2) 
         + "   Seat: " + seat);
      // format decimal output
      DecimalFormat formatPrice = new DecimalFormat("###,###.00##");
      System.out.println("Price: $" 
         + formatPrice.format(Double.parseDouble(price) / 100) 
         + "   Category: " + category + "   Cost: $" 
         + formatPrice.format(Double.parseDouble(cost)));
      // generate the random number
      int random = new Random().nextInt(999999) + 1;
      String rand = random + "";
      // appending zeros 
      while (rand.length() < 6) {
         rand = "0" + rand;
      }
      System.out.println("Prize Number: " + rand);
   }
}