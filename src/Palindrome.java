/*Victor Espinoza
 * CECS 274
 * Fall 2013
 * Due Date: 11/25/13
 * Lab #8 - Go Hang a Salami, I'm a Lasagna Hog
 */

public class Palindrome {

   public boolean isPalindrome(String phrase) {
       // TO DO: call the overloaded isPalindrome method 
      return isPalindrome(phrase.toLowerCase(), 0, phrase.length() - 1);
   }//close isPalindrome(...)

   
   private static boolean isPalindrome(String phrase, int startNdx, 
    int endNdx) {

      //1. set up a base case.
      if (startNdx >= endNdx)
         return true;

      //2. pull out the characters at the startNdx and endNdx.
      char first = Character.toLowerCase(phrase.charAt(startNdx));
      char last = Character.toLowerCase(phrase.charAt(endNdx));

      /*3. if both characters are LETTERS (see: Character.isLetter method),
       *then compare them. if they are different, return false. if they are
       *the same, recursively call isPalindrome and move start/end up/down
       *by one.
       */
      if (Character.isLetter(first) && Character.isLetter(last)){
         if (first == last)
            return isPalindrome(phrase, startNdx + 1, endNdx - 1);
         else
            return false;
      }//end if

      /*4. if either one (or both) is not a letter, recursively call
       *isPalindrome and move whichever ndx is not a letter up/down by
       *one.
       */
      else if (!Character.isLetter(last))
         return isPalindrome(phrase, startNdx, endNdx - 1);
      else
         return isPalindrome(phrase, startNdx + 1, endNdx);
   }//close isPalindrome(...)

}//close class Palindrome
