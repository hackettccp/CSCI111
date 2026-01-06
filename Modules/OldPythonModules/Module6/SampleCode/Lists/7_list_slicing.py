"""
Demonstrates list slicing.
"""

numbers = [50, 40, 20, 30, 70, 10, 60]      #A list named numbers containing 50, 40, 20, 30, 70, 10 and 60

slice1 = numbers[:4]                        #Uses list slicing to get the values from indexes 0-3 of the numbers list and assigns the slice to a variable named slice1
print("slice1:", slice1)                    #Prints the value of slice1 (in list form)


print()


slice2 = numbers[4:]                        #Uses list slicing to get the values starting from index 4 of the numbers list and assigns the slice to a variable named slice2
print("slice2:", slice2)                    #Prints the value of slice2 (in list form)


print()


slice3 = numbers[2:6]                       #Uses list slicing to get the values from indexes 2-5 of the numbers list and assigns the slice to a variable named slice3
print("slice3:", slice3)                    #Prints the value of slice3 (in list form)


print()


slice4 = numbers[-6:]                       #Uses list slicing to get the values starting from index 1 of the numbers list (using relative (negative) indexes)
print("slice4:", slice4)                    #Prints the value of slice4 (in list form)


print()


slice5= numbers[:-3]                        #Uses list slicing to get the values up through index 3 of the numbers list (using relative (negative) indexes)
print("slice5:", slice5)                    #Prints the value of slice5 (in list form)


print()


slice6 = numbers[-5:-1]                     #Uses list slicing to get the values from indexes 2-5 of the numbers list (using relative (negative) indexes)
print("slice6:", slice6)                    #Prints the value of slice6 (in list form)

