"""
Demonstrates the math module
"""

import math                                 #Imports the math module.

value1 = 16                                 #Declares a variable named value1 and initializes it with 16
value2 = 33                                 #Declares a variable named value2 and initializes it with 33

result1 = math.sqrt(value1)                 #Declares a variable named result1 and assigns to result1 the square root of value1

print("Result 1:", result1)                 #Prints the value of result1

result2 = math.sqrt(value2)                 #Declares a variable named result2 and assigns to result2 the square root of value2

print("Result 2:", result2)                 #Prints the value of result2


print()


value3 = 26.6                               #Declares a variable named value3 and assigns it the value 26.6

rounded = round(value3)                     #Declares a variable named rounded and assigns to it value3 rounded to the nearest whole number. (Does not require importing the math module.)

print("Rounded:", rounded)                  #Prints the value of rounded

rounded_down = math.floor(value3)           #Declares a variable named rounded_down and assigns to it value3 rounded down to the nearest whole number using the math module's floor function.

print("Rounded down:", rounded_down)        #Prints the value of rounded_down

rounded_up = math.ceil(value3)              #Declares a variable named rounded_up and assigns to it value3 rounded up to the nearest whole number using the math module's ceil (ceiling) function

print("Rounded up:", rounded_up)            #Prints the value of rounded_up

