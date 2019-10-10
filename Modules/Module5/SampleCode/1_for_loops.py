"""
Demonstrates For Loops
"""


for i in range(11) :                                    #A for loop that prints the values 0 through 10.
  print("Loop 1: Count = " + str(i))
print("Loop 1 Complete")

print()


for i in range(1, 16) :                                 #A for loop that prints the values 1 through 15.
  print("Loop 2: Count = " + str(i))
print("Loop 2 Complete")

print()


for i in range(2, 21, 2) :                              #A for loop that prints the values 2 through 20. (Counts by twos)
  print("Loop 3: Count = " + str(i))
print("Loop 3 Complete")

print()


for i in range(10, 101, 10) :                           #A for loop that prints the values 10 through 100. (Counts by tens)
  print("Loop 4: Count = " + str(i))
print("Loop 4 Complete")

print()


for i in range(10, 0, -1) :                             #A for loop that prints the values 10 through 1.
  print("Loop 5: Count = " + str(i))
print("Loop 5 Complete")

print()


for i in range(100, -1, -10) :                          #A for loop that prints the values 100 through 0. (Counts by tens)
  print("Loop 6: Count = " + str(i))
print("Loop 6 Complete")

print()


for i in range(-1, -11, -1) :                           #A for loop that prints the values -1 through -10.
  print("Loop 7: Count = " + str(i))
print("Loop 7 Complete")

print()


for i in range(-10, 0, 1) :                             #A for loop that prints the values -10 through -1.
  print("Loop 8: Count = " + str(i))
print("Loop 8 Complete")

print()


start = int(input("Enter a number to start counting from: "))       #Prompts the user to enter a number to start counting from.
limit = int(input("Enter a number to count to: "))                  #Prompts the user to enter a number to count up to.
step = int(input("Enter step count: "))                             #Prompts the user to enter the step count.

for i in range(start, limit, step) :                                #A for loop that prints the range of values specified by the user.
  print("Loop 9: Count = " + str(i))
print("Loop 9 Complete")

