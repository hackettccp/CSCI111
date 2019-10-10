"""
Demonstrates multidimensional lists
"""

"""
Declares a two dimensional list of ints named numbers.
Initializes it with the following values:
Row 1: 3, 6 and 8
Row 2: 5, 1 and 2
Row 3: 9, 7 and 4
"""
numbers = [[3, 6, 8],
           [5, 1, 2],
           [9, 7, 4]]
        
numbers[2][0] = 10                    #Changes the value at row 3 column 1 to 10
numbers[1][2] = 11                    #Changes the value at row 2 column 3 to 11
numbers[0][1] = 12                    #Changes the value at row 1 column 2 to 12
        
for row in numbers :                  #Prints the values of each row (on their own line) with one space between each number.
  line = ""
  for col in row :
    line += str(col) + " "
  print(line)


print()

"""
Prints the values of the numbers array specifying the row and column for each number.
For example:
Row 1 Column 1 = 3
Row 1 Column 2 = 6
Row 1 Column 3 = 8
Row 2 Column 1 = 5
and so on.
"""

for rowNum in range(3) :
  for colNum in range(3) :
    print("Row", (rowNum + 1), "Column", (colNum + 1), " = ", numbers[rowNum][colNum])


