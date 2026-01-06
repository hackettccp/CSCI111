"""
Demonstrates basic utilization of a dictionary
"""

#Declares two dictionaries
ages = {"Adam":41, "Bill":38.5, "Carol":45}
employees = {1001:"Joe", 1005:"Kathy", 1003:"Lou"}

#Prints both dictionary objects
print("The ages dictionary:")
print(ages)
print()
print("The employees dictionary:")
print(employees)
print()

#Prints the length (total Key-Value Pairs) of the ages dictionary
ages_length = len(ages)
print("The number of KVPs in the ages dictionary is", ages_length)
print()


#Retrieves values from the dictionaries using a key
employee_value = employees[1005] #The key used is 1005
print("Employee #1005 is", employee_value)

print("Carol's age is", ages["Carol"]) #The key used is "Carol"





    

