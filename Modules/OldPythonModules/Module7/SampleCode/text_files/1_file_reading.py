"""
Demonstrates reading a file sequentially
"""

file_to_read = open("friends.txt", "r")                 #Opens the readfile.txt file in read-only mode

line = file_to_read.readline()                          #Uses the stream's readline function to retrieve the first line of the file to a variable named line
print(line)                                             #Prints the value of the line variable

line = file_to_read.readline()                          #Uses the stream's readline function again to retrieve the next line of the file to the line variable
print(line)                                             #Prints the value of the line variable

file_to_read.close()                                    #Closes the file
