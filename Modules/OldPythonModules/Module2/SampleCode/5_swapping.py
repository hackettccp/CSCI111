"""
Demonstrates swapping the values of two variables
"""

number1 = 65                        #Declares a variable named number1 and assigns it the value 65
number2 = 27                        #Declares a variable named number2 and assigns it the value 27

temp_number = number1               #Copies the reference of number1 to temp_number
number1 = number2                   #Copies the reference of number2 to number1
number2 = temp_number               #Copies the reference of temp_number to number2

print(number1)                      #Prints the value referenced by number1
print(number2)                      #Prints the value referenced by number2

