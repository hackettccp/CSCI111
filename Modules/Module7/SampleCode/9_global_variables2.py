"""
Demonstrates global variables.
"""

"""
Procedure that prompts the user to enter a number.
This procedure then calls the show_number procedure.
"""
def prompt():
    global number                                       #Creates a global variable named number within the prompt function.
    number = int(input("Enter a number: "))             #Prompts the user to enter a number; Then converted to an int-type and assigned to the global variable, number
    show_number()                                       #Calls the show_number function

"""
Procedure that simply prints the value of the
global variable, number
"""
def show_number():
    print("The number you entered is", number)


prompt()                                                  #Calls the prompt procedure.

