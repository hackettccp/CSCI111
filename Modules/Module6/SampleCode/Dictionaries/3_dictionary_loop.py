"""
Demonstrates looping through a dictionary
"""

#Declares a dictionary
employees = {1001:"Joe", 1005:"Kathy", 1003:"Lou"}

#Uses a loop to print a dictionary's keys
print("Keys:")
for key in employees:
  print(key)

print()

#Uses a loop to print a dictionary's values
print("Values:")
for key in employees:
  print(employees[key])
