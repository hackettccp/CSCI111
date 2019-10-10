"""
Demonstrates nested loops.

This program displays a rectangular pattern of asterisks.
"""

rows = int(input("How many rows? "))                        #Prompt the user for the number of rows and columns
cols = int(input("How many columns? "))

line = ""                                                   #This variable will be used to build each row of asterisks

for r in range(rows):                                       #Loop for every row
    for c in range(cols):                                   #Loop for each column in the row 
        line += "*"                                         #Append one asterisk for the row
    print(line)                                             #Print the row of asterisks
    line = ""                                               #Reset for the next row

print("Program Complete")
