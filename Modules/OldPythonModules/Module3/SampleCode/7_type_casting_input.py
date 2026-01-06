"""
Demonstrates prompting a user to enter input using the keyboard.

This demonstrates two different ways to get the user's input
as a string and converts the input to an int-type.
The same thing can be done for floats by using the float function
instead of the int function.
"""

number1 = input("Enter the first number: ")                         #Gets the user's first number as a string.
number1 = int(number1)                                              #The number1 variable is typecast from a string to an int, and is assigned back to itself.
                                                                    #This replaces the string-type value of the number1 variable with the int-type value.

number2 = int(input("Enter the second number: "))                   #Gets the user's second number and the value they typed will be returned (as a string-type)
                                                                    #and immediately typecast as an int.

print("The sum of the two numbers is", number1 + number2)           #Prints the sum of the two numbers.
