"""
Demonstrates iterating/looping through a list
"""

temperatures = [34.56, 56.45, 45.98, 47.62, 67.87, 55.12]       #A list containing a series of temperatures


for t in temperatures :                                         #Prints every value in the temperatures list using a for loop
  print("Loop 1:", t)

print()


for i in range(len(temperatures)) :                             #Prints every value in the temperatures list using indexes
  print("Loop 2:", temperatures[i])

print()


for i in range(len(temperatures)//2) :                          #Prints the first half of the temperatures list
  print("Loop 3:", temperatures[i])

print()


for i in range(len(temperatures)//2, len(temperatures)) :       #Prints the second half of the temperatures list
  print("Loop 4:", temperatures[i])

print()


for i in range(len(temperatures)-1, -1, -1) :                   #Prints the temperatures list in reverse
  print("Loop 5:", temperatures[i])

