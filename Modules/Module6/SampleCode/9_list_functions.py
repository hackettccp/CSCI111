"""
Demonstrates list functions.
"""

values = [6, 3, 1, 2]               #A list named values containing 6, 4, 3, 1, 5 and 2

values.insert(1, 4)                 #Inserts 4 at index 1
print("values:", values)            #Prints the values list (in list form)

values.insert(4, 5)                 #Inserts 5 at index 4
print("values:", values)            #Prints the values list (in list form)


print()


values.reverse()                    #Reverses the values list
print("values (reversed):", values) #Prints the values list (in list form)


print()


values.sort()                       #Sorts the values list
print("values (sorted):", values)   #Prints the values list (in list form)


print()


values.reverse()                    #Reverses the values list again
print("values (reversed):", values) #Prints the values list (in list form)

