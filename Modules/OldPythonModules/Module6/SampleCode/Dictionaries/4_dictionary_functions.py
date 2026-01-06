"""
Demonstrates various functions with a dictionary
"""

#Declares a dictionary
employees = {1001:"Joe", 1005:"Kathy", 1003:"Lou"}

#Tests if a key exists in the dictionary
if 1003 in employees :
  print("The key 1003 exists in the employees dictionary")
  print("The employee is", employees[1003])
else :
  print("The key 1003 does not exist in the employees dictionary")

if 1007 in employees :
  print("The key 1007 exists in the employees dictionary")
  print("The employee is", employees[1007])
else :
  print("The key 1007 does not exist in the employees dictionary")
print()

#Demonstrates the get function
#Safe from KeyError exceptions
temp_employee = employees.get(1009) #Safe from KeyError exception
#temp_employee = employees[1009] #Raises a KeyError exception
print("The employee with ID number 1009 is", temp_employee)
print()

#Demonstrates the pop function
temp_employee = employees.pop(1005) #Gets the value and then removes it
print("The employee removed was", temp_employee)
print("The employees dictionary:")
print(employees)
print()

#Demonstrates clearing a dictionary
employees.clear() #Removes ALL KVPs from the dictionary
print("The employees dictionary:")
print(employees)

