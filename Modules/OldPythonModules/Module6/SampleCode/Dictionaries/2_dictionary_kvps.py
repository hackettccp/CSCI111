"""
Demonstrates adding, changing, and deleting KVPs
"""

#Declares a dictionary
employees = {1001:"Joe", 1005:"Kathy", 1003:"Lou"}

#Adds a KVP to the dictionary
employees[1002] = "Mary" #(new)Key: 1002, Value:"Mary"
#Prints the entire dictionary to show the new KVP was added
print("Added Mary to the dictionary:")
print(employees)
print()

#Changes a value in the dictionary
employees[1001] = "Joseph" #(existing)Key: 1001, Value:"Joseph"
#Prints the entire dictionary to show the existing KVP was changed
print("Changed \"Joe\" to \"Joseph\" in the dictionary:")
print(employees)
print()

#Deletes a KVP from the dictionary
del employees[1003] #Removes the KVP 1003:"Lou"
#Prints the entire dictionary to show the KVP was removed
print("Removed KVP 1003:\"Lou\" from the dictionary:")
print(employees)
print()








    

