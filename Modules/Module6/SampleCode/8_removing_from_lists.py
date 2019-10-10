"""
Demonstrates deleting elements from lists.
"""

numbers = [8, 10, 5, 7, 3, 1, 10]           #A list named numbers containing the values 8, 5, 7, 3 and 1
print("numbers:", numbers)                  #Prints the numbers list (in list form)

del numbers[2]                              #Deletes the third element from the numbers list
print("numbers:", numbers)                  #Prints the numbers list (in list form)

del numbers[2]                              #Deletes the third element from the numbers list again
print("numbers:", numbers)                  #Prints the numbers list (in list form)


print()


numbers.remove(10)                          #Deletes the value 10 from the numbers list using the remove function
print("numbers:", numbers)                  #Prints the numbers list (in list form)

