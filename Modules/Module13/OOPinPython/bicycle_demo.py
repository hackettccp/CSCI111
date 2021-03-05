#Imports the Bicycle object
from bicycle import Bicycle

"""
Demonstrates the use of the Bicycle object
"""

#Creates an instance of a Bicycle Object with three arguments
test_bike = Bicycle(9, 12, "orange")

#ACCESSORS
#Prints test_bike's gear, speed, and color using accessor functions
print("test_bike's gear =", test_bike.getgear())
print("test_bike's speed =", test_bike.getspeed())
print("test_bike's color =", test_bike.getcolor())

#MUTATORS
"""
print()
#Sets test_bike's gear to 8 using a mutator
test_bike.setgear(8);

#Sets test_bike's speed to 11
test_bike.setspeed(11)

#Sets test_bike's color to "yellow"
test_bike.setcolor("yellow")

#Prints test_bike's gear, speed, and color again
print("test_bike's gear =", test_bike.getgear())
print("test_bike's speed =", test_bike.getspeed())
print("test_bike's color =", test_bike.getcolor())
"""

#DATA VALIDATION
"""
print()
#Attempts to assign a string using the setgear function
#test_bike.setgear("5") #Raises an exception

#Attempts to assign a number outside of the valid range
#test_bike.setgear(500) #Raises an exception
"""

#SHALLOW COPIES
"""
print()
#Creates a shallow copy of test_bike
test_bike2 = test_bike

#Sets test_bike2's gear to 3 using a mutator
test_bike2.setgear(3);

#Prints test_bike's gear
print("test_bike's gear =", test_bike.getgear())
"""


#DEEP COPIES
"""
print()
#Creates a deep copy of test_bike using its copy function
test_bike3 = test_bike.copy()

#Sets test_bike3's gear to 1 using a mutator
test_bike3.setgear(1);

#Prints test_bike's gear
print("test_bike's gear =", test_bike.getgear())
#Prints test_bike's gear
print("test_bike3's gear =", test_bike3.getgear())
"""

#STRING REPRESENTATION
"""
print()
#Prints the string represenation of test_bike
print(test_bike)
#Prints the string represenation of test_bike3
print(test_bike3)
"""
