"""
Demonstrates basic utilization of a set
"""

#Declares two sets
numbers = {4, 8, 8, 15, 16, 23, 42}
pets = {"dog", "cat", "bird", "fish"}

#Prints both sets
print("The numbers set:")
print(numbers) #Notice the number 8 only appears once
print()
print("The pets set:")
print(pets)
print()

#Prints the length of the numbers dictionary
pets_length = len(pets)
print("The number of elements in the pets set is", pets_length)
print()

#Converts a set to a list
numbers_list = list(numbers)
print("Contents of numbers (a set):")
print(numbers)
print("Contents of numbers_list (a list):")
print(numbers_list)
print()

#Converts a list to set
values = ["value_1", 2.5, 3]
values_set = set(values)
print("Contents of values (a list):")
print(values)
print("Contents of values_set (a set):")
print(values_set)
print()


#Prints each element from a set using a loop
for element in pets:
  print(element)

