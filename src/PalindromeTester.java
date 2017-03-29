/*Victor Espinoza
 * CECS 274
 * Fall 2013
 * Due Date: 11/25/13
 * Lab #8 - Go Hang a Salami, I'm a Lasagna Hog
 */
import java.util.*;

public class PalindromeTester {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TO DO: set up a NEW FILE WITH A MAIN METHOD to prompt the user to 
      // enter a phrase, then tell them if that phrase is a palindrome. 
      // repeat this process until they enter "exit" to quit.

      Scanner in = new Scanner(System.in);
      Palindrome p = new Palindrome();
      System.out.println("Welcome to the Palindrome Tester Program. " +
       "Note: To exit the program type in the phrase exit.");
      System.out.println("Please enter a phrase:");
      String phrase = in.nextLine();
      while (!phrase.toLowerCase().equals("exit")){
         boolean conclusion = p.isPalindrome(phrase);
         if (conclusion == true)
            System.out.println("\"" + phrase + "\"" + " is a palindrome!");
         else
            System.out.println("\"" + phrase + "\"" + " is not a palindrome! "
             + ":(");

         System.out.println("\n" + "Please enter a phrase:");
         phrase = in.nextLine();
      }//end while
      System.out.println("This program will now terminate. Enjoy the " + 
       "rest of your day!");

   }//close main 
   
}//close class PalindromeTester

/*Output:
 *Please enter a phrase:
 *A Toyota's a Toyota
 *"A Toyota's a Toyota" is a palindrome!
 *
 *Please enter a phrase:
 *No "X" in "Nixon"
 *"No "X" in "Nixon"" is a palindrome!
 *
 *Please enter a phrase:
 *O Geronimo, no minor ego
 *"O Geronimo, no minor ego" is a palindrome!
 *
 *Please enter a phrase:
 *Palindrome
 *"Palindrome" is not a palindrome! :(
 *
 *Please enter a phrase:
 *exit
 *BUILD SUCCESSFUL (total time: 1 minute 9 seconds)
 */