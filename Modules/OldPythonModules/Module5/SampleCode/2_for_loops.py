"""
This program calculates the sum of a series
of numbers entered by the user.
"""

limit = 5                                                   #The maximum number
total = 0.0                                                 #Initializes an accumulator variable.
   
print("This program calculates the sum of")                 #Explains what the program does.
print(str(limit) + " numbers you will enter.")

for counter in range(limit):                                #Repeats 5 times (based on the value of the limit variable)
    number = int(input("Enter a number: "))                 #Asks the user to enter a number to be added to the total
    total = total + number                                  #Adds the number entered to a running total/accumulator

print("The total is " + str(total))                         #Display the total of the numbers.


