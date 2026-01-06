"""
Demonstrates reading a file sequentially
"""

file_to_read = open("testFolder//friends2.txt", "r")    #Opens the friends2.txt file (in the testFolder directory) in read-only mode

for line in file_to_read :                              #Uses a loop to iterate over the lines of text of the file and print each line. 
  print(line.rstrip("\n"))                              #Strips away any linefeed escape sequences before printing

file_to_read.close()                                    #Closes the file

