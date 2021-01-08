"""
Demonstrates adding and deleting elements from a set
"""

#Declares a set
pets = {"dog", "cat", "bird", "fish"}

#Adds an element to the set
pets.add("mouse")
#Prints the set
print("Contents of the pets set:")
print(pets)
print()

#Adds/merges two sets together
new_pets = {"snake", "hamster"}
pets.update(new_pets)
print("Contents of the pets set:")
print(pets) #Now contains the elements from the new_pets set
print("Contents of the new_pets set:")
print(new_pets) #Unaltered
print()

#Deletes an element from the set
pets.discard("hamster")
print("Contents of the pets set:")
print(pets)
print()

