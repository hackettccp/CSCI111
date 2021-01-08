"""
Demonstrates copying and merging dictionaries
"""

#Declares a dictionary
employees = {1001:"Joe", 1005:"Kathy", 1003:"Lou"}

#Creates a shallow copy of the employees dictionary
employees_copy = employees #Both variables point to same dictionary
employees_copy[1009] = "Bill" #Adds a value to the "copy"
print("employees dictionary:")
print(employees) #Prints the "original". Notice it includes "Bill"
print("employees_copy dictionary:")
print(employees_copy) #Prints the "copy".
print()

#Creates a deep copy of the employees dictionary
employees_copy2 = employees.copy() #Variables point to different dictionaries
employees_copy2[1011] = "Alice" #Adds a value to the copy
print("employees dictionary:")
print(employees) #Prints the original. Notice it does not include "Alice"
print("employees_copy2 dictionary:")
print(employees_copy2) #Prints the copy. Notice it includes "Alice"
print()

#Declares another dictionary
new_employees = {1006:"Mary", 1008:"Nick"}
employees.update(new_employees) #Adds new_employee dictionaries KVP to the employees dictionary
print("employees dictionary:")
print(employees) #Prints the employees dictionary; Now contains the KVPs from new_employees dictionary
print("new_employees dictionary:")
print(new_employees) #Prints the new_employees dictionary; It is unaltered.








    

