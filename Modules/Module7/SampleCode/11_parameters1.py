"""
Demonstrates parameters and arguments
"""

"""
A procedure called print_sum that accepts two arguments.
The procedure sums the arguments and prints the result.
"""
def print_sum(x, y) :
  print("The sum of the numbers is", x + y)       #Prints the sum of x and y


num1 = int(input("Enter a number: "))             #Prompt the user to enter a number.
num2 = int(input("Enter another number: "))       #Prompt the user to enter another number.
print_sum(num1, num2)                             #Pass the num1 and num2 variables as arguments to the print_sum procedure

