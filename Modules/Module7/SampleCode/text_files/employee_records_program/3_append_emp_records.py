"""
RUN THE write_emp_records.py PROGRAM FIRST!
That program will create the employees.txt file this program uses.

After running this program, check the employees.txt file in Notepad
(Or a similar text editor) to see that the values were appended to the file.
"""

emp_file = open("employees.txt", "a")                                                   #Open a file for appending.

choice = input("Do you want to add additional employees? (y for yes): "))               #Get the number of employee records to create.

while choice == "y":                                                                    #Get each employee's data and write/append it to the file.
    print("Enter data for new employee")                                                #Get the data for an employee.
    name = input("Name: ")
    id_num = input("ID number: ")
    dept = input("Department: ")

    emp_file.write(name + "\n")                                                         #Write/append the data as a record to the file.
    emp_file.write(id_num + "\n")
    emp_file.write(dept + "\n")

    print()                                                                             #Display a blank line.
    choice = input("Do you want to add additional employees? (y for yes): "))           #Ask if they want to enter another.
    
emp_file.close()                                                                        #Close the file.
print("Employee records appended to employees.txt.")






