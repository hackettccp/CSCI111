"""
Demonstrates inline if statements
"""

firstNumber = 10
secondNumber = 15

biggerNumber = firstNumber if firstNumber > secondNumber else secondNumber          #Uses an inline if to assign the larger of the two variables to biggerNumber
print(biggerNumber)                                                                 #Prints the value of biggerNumber


print()


numApples = int(input("Enter the starting number of apples: "))                     #Prompts the user to enter a number of apples
soldApples = int(input("Enter the number of apples sold: "))                        #Prompt the user to enter the number of apples that sold

applesLeft = numApples - soldApples                                                 #Calculates the difference of numApples and soldApples

output = "There "                                                                   #Begins the message to print
output += "is " if applesLeft == 1 else "are "                                      #Appends either "is" or "are"
output += str(applesLeft)                                                           #Appends the number of apples left
output += " apple " if applesLeft == 1 else " apples "                              #Appends either "apple" or "apples"
output += "remaining."                                                              #Appends the end of the message.

print(output)                                                                       #Prints the output string created.

        



        

