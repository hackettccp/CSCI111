"""
This program gets three test scores and displays
their average. It congratulates the user if the
average is a high average.

The high_average variable holds the value that is
considered a high average.
"""

high_average = 90                                           #Minimum value for a high average
 
test1 = int(input("Enter the score for test 1: "))          #Gets the three test scores
test2 = int(input("Enter the score for test 2: "))
test3 = int(input("Enter the score for test 3: "))

average = (test1 + test2 + test3) / 3                       #Calculate the average test score

print("The average score is", average)                      #Print the average

if average >= high_average :                                #If the average is a high average, congratulate the user
    print("Congratulations!")
    print("That is a great average!")

print("Program Complete")                                   #Prints an exit message
