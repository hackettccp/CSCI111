"""
Demonstrates adding/appending elements to lists.
"""

numbers = [10, 20, 30]                  #A list named numbers containing the values 10, 20 and 30

print("numbers:", numbers)              #Prints the numbers list (in list form)

numbers.append(40)                      #Appends the value 40 to the numbers list using its append function
numbers.append(70)                      #Appends the value 70 to the numbers list using its append function

print("numbers:", numbers)              #Prints the numbers list again (in list form)


print()


numbers2 = [100, 200, 300]              #A list named numbers2 containing the values 50, 60 and 70

numbers2 += [400, 500]                  #Appends the values 400 and 500 to the numbers2 list using the addition combined assignment operator.

print("numbers2:", numbers2)            #Prints the numbers2 list (in list form)


print()


numbers += numbers2                     #Appends the numbers2 list to the numbers list using the addition combined assignment operator.

print("numbers:", numbers)              #Prints the numbers list (in list form)
print("numbers2:", numbers2)            #Prints the numbers2 list (in list form)

