"""
Demonstrates While Loops
"""

done = False                                    #Declares a variable named done and assign it the value False

while not done :                                #A while loop that iterates as long as done is not equal to True
  entry = input("Enter a value (x to exit): ")  #Declares a variable named entry and prompt the user to enter any value.

  if entry == "x" :                             #If the user entered the letter x, sets the done variable to True
    done = True
  else :                                        #Otherwise, prints the value of the entry variable.
    print("You entered: " + entry)

print("Thank you!")

print()

"""
#Declares a variable named userNum and prompt the user
#to enter a number between 1 and 10.
#Assigns the user's input to the userNum variable.
user_number = int(input("Enter a number between 1 and 10: "))

#Begins a while loop. It must iterate as long as the user enters a number
#outside of the 1-10 range.
while user_number < 1 or user_number > 10 :

  #Prompts the user to try entering a number again
  #Assigns their input to user_number.
  user_number = int(input("Try again. Enter a number between 1 and 10: "))

#An else clause that prints a thank you message.
else :
  print("Thank you!")
"""

#********************************#
print()

"""
#Declares a variable named password.
password = "P@55w0Rd"

#Prompts the user to enter the password.
#Assigns the user's input to a variable named userPW
user_pw = input("Enter password: ")

#Declares a variable named attempts and assigns it the value 1
attempts = 1

#Begins a while loop.
#Iterates as long as userPW is not equal to the value in
#the password variable
while user_pw != password :

  #If the user has made 5 attempts, prints an error message and
  #stops the program by calling the exit() function.
  if attempts == 5 :
    print("Too many incorrect attempts.")
    exit()

  #Prompts the user to try entering the password again.
  #Assigns the new input to the userPW variable
  user_pw = input("Retry password: ")

  #Adds one to the value of attempts
  attempts += 1

#An else clause that prints "Access Granted!"
else :
  print("Access Granted")
"""
