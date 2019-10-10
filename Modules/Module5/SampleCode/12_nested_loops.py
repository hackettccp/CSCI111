"""
This program averages test scores. It asks the user for the
number of students and the number of test scores per student.
"""

num_students = int(input("How many students do you have? "))                                    #Get the number of students.
num_test_scores = int(input("How many test scores per student? "))                              #Get the number of test scores per student.


for student in range(1, num_students + 1):                                                      #This loop repeats for every student
    total = 0.0                                                                                 #Initialize an accumulator variable for the student's test scores.    
    print("Student number", student)
    print("-----------------")
    
    for test_num in range(num_test_scores):                                                     #This loop repeats for every test score
        score = float(input("Test number" + str(test_num + 1) + ": "))                          #Prompts the user to enter the test score
        total += score                                                                          #Add the score to the accumulator.

    average = total / num_test_scores                                                           #Calculate the average test score for this student.

    print("The average for student number", student, "is:", format(average, ".1f"))             #Display the average.
    print()

print("Program Complete")

        
