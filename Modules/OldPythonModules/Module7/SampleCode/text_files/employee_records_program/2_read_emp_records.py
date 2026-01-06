"""
RUN THE write_emp_records.py PROGRAM FIRST
That program will create the employees.txt file this program uses.

This program displays the records that are in the employees.txt file.
"""

emp_file = open("employees.txt", "r")           #Open the employees.txt file.

name = emp_file.readline()                      #Read the first line from the file, which is the name field of the first record.

while name != "":                               #If a line was read, continue processing.
    id_num = emp_file.readline()                #Read the ID number field.
    dept = emp_file.readline()                  #Read the department field.

    name = name.rstrip("\n")                    #Strip the newlines from the fields.
    id_num = id_num.rstrip("\n")
    dept = dept.rstrip("\n")

    print("Name:", name)                        #Display the record.
    print("ID:", id_num)
    print("Dept:", dept)
    print()

    name = emp_file.readline()                  #Read the name of the next record (It will be "" if we reached the end of the file.)

emp_file.close()                                #Close the file.


