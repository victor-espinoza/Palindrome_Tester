# Palindrome_Tester  
Overview:  
This is a simple program that asks the user to input a phrase and tests to see if it is a palindrome or not. The user can either enter a phrase and see if it is a palindrome or not, or they can enter "exit" to exit the program.  
   
Verifying whether a phrase is a palindrome or not is achieved in this program using recursion to compare two characters at a time to make sure they are identical. The program begins at the starting and ending characters and then moves each of them one character closer to the middle of the phrase at a time. These two characters are compared to each other to make sure that they are identical each time the recursive isPalindrome(...) method is called. If the program reaches the middle of the phrase and all of the compared characters were the same, that meant that the phrase is in fact a palindrome. If the compared characters were not the same, then the phrase is not a palindrome. Once the program finishes traversing the characters within the entered phrase, the results of the palindrome test are then displayed on the console.  
  
  
Dependencies:  
This project was created using the NetBeans IDE Version: 8.0.2.  
    
    
Sample Output:  
Welcome to the Palindrome Tester Program. Note: To exit the program type in the phrase exit.  
Please enter a phrase:  
A Toyota's a Toyota  
"A Toyota's a Toyota" is a palindrome!  
  
Please enter a phrase:  
No "X" in "Nixon"  
"No "X" in "Nixon"" is a palindrome!  
  
Please enter a phrase:  
"O Geronimo, no minor ego  
""O Geronimo, no minor ego" is a palindrome!  
  
Please enter a phrase:  
Palindrome  
"Palindrome" is not a palindrome! :(  
  
Please enter a phrase:  
exit  
This program will now terminate. Enjoy the rest of your day!  
  
