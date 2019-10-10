"""
Demonstrates procedures
"""

"""
A procedure named hello that prints a line of output when called
"""
def hello() :
  print("Hello World!")                           #Print the text "Hello World!"

"""
A procedure called print_sum that prompts the user to enter two numbers and prints the sum of the two numbers.
"""
def print_sum() : 
  num1 = int(input("Enter a number: "))           #Prompts the user to enter a number. Assigns the user's input (as an int) to a variable named num1
  num2 = int(input("Enter another number: "))     #Prompts the user to enter another number. Assigns the user's input (as an int) to a variable named num2
  print(num1 + num2)                              #Prints the sum of num1 and num2


hello()                                           #Calls the hello procedure
print_sum()                                       #Calls the print_sum procedure
