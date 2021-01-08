"""
Demonstrates reading a csv file.

!!! Run csv_writing.py to create the example.csv file first !!!
"""

#Opens the existing file
csv_file = open("example.csv", "r")

#Reads/discards the first line (containing the headers)
#The line must be read, but since we aren't using the headers in
#this program, the line of text returned does not need to be
#stored to a variable.
csv_file.readline()

#Reads the rest of the file
for line in csv_file :
  #Strips away the line feed at the end and tokenizes the line
  tokens = line.rstrip("\n").split(",")

  #Retrieves value from each token
  courseNumber = tokens[0]
  days = tokens[1]
  time = tokens[2]
  prof = tokens[3]

  #Prints the information
  print("Course Number:", courseNumber)
  print("Days:", days)
  print("Time:", time)
  print("Teacher:", prof)
  print()


#Closes the file/Saves any changes
csv_file.close()
