"""
Demonstrates a function
"""

"""
A function called return_sum that prompts the user to enter two numbers and returns the sum of the two numbers.
"""
def return_sum() : 
  num1 = int(input("Enter a number: "))           #Prompts the user to enter a number. Assigns the user's input (as an int) to a variable named num1
  num2 = int(input("Enter another number: "))     #Prompts the user to enter another number. Assigns the user's input (as an int) to a variable named num2
  total = num1 + num2                             #Calculates the sum of num1 and num2
  return total                                    #Returns the calculated sum


result = return_sum()                             #Calls the return_sum function and assigns the value returned to a variable
print("The total is", result)                     #Prints the value that was returned                                       
