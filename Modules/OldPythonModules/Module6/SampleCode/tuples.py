"""
Demonstrates tuples
"""

#Declares a tuple named numbers containing the values 6, 3 and 2
numbers = (6, 3, 2)

#Prints the numbers tuple
print(numbers)

#Prints the length of the numbers tuple
print(len(numbers))

#Prints the first element of the numbers tuple
print(numbers[0])

#********************************#
print()

#Declares a tuple named directions containing the
#values "Up", "Down", "Right" and "Left"
directions = ("Up", "Down", "Right", "Left")

#Prints the second element in the directions tuple
#using a relative (negative) index
print(directions[-3])

#********************************#
print()

#Combines the numbers and directions tuples into a single tuple.
combined = numbers + directions

#Prints the combined tuple
print(combined)

#********************************#
print()

#Declares a tuple named temperatures containing the values 
#47.62, 67.87 and 55.12
temperatures = (47.62, 67.87, 55.12)

#Prints each value in the temperatures tuple using a for loop
for t in temperatures :
  print(t)
        
#Prints each value in the temperatures tuple using the range function
#in a for loop
for i in range(len(temperatures)) :
  print(temperatures[i])

#********************************#
print()

#Declares a tuple named values containing the values 6, 4, 3, 1, 5 and 2
values = (6, 4, 3, 1, 5, 2)

#Declares a variable named biggest and assign it the largest value
#from the values tuple. (Use the max function.)
biggest = max(values)

#Prints the value of biggest
print(biggest)

#Declares a variable named smallest and assign it the smallest value
#from the values tuple. (Use the min function.)
smallest = min(values)

#Prints the value of smallest
print(smallest)

