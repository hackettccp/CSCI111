"""
Demonstrates appending to a file
"""

file_to_append = open("outputfile.txt", "a")                      #Opens the existing file (in append mode) named outputfile.txt.

while True:                                                       #Uses a loop that prompts the user to enter input. Existing data in the file will not be deleted.
  line = input("Enter some text: ")
  
  if line.lower() == "exit" :                                     #If the user enters the word "exit", the loop stops
    break
  else :
    file_to_append.write(line + "\n")                             #Write sthe user's input to the file. Adds a linefeed when writing each line of input to the file

file_to_append.close()                                            #Close/save the file
