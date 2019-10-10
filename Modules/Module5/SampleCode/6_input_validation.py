"""
Demonstrates a while loop for vaildating input
"""

user_number = int(input("Enter a number between 1 and 10: "))           #Prompts the user to enter a number between 1 and 10.

while user_number < 1 or user_number > 10 :                             #Iterates as long as the user enters a number outside of the 1-10 range.
  print("Invalid entry. Try again.")                                    #Prints an error message
  user_number = int(input("Enter a number between 1 and 10: "))         #Prompts the user to try entering a number again.

print("Thank you!")

