"""
Demonstrates writing a csv file.
"""

#Creates a new file
csv_file = open("example.csv", "w")

#Adds headers to the csv file
csv_file.write("Course Name, Days, Time, Teacher")

while True:

  #Gets required information
  courseNumber = input("Enter your course number: ")
  days = input("Enter the days this course meets: ")
  time = input("Enter the time this course meets: ")
  prof = input("Enter your teacher's name: ")

  #Writes the information as a CSV entry to the file
  csv_file.write(courseNumber + ",")
  csv_file.write(days + ",")
  csv_file.write(time + ",")
  csv_file.write(prof + "\n")
  
  #Ask to enter another course
  choice = input("Do you want to enter another course? (Y for yes): ")
  if choice.lower() != "y" :
    break;

#Closes the file/Saves any changes
csv_file.close()
