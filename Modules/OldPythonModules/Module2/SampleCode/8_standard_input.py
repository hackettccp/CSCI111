"""
Demonstrates prompting a user to enter input using the keyboard.
"""

"""
The input function will print "Enter your first name: " and wait for the user to type their entry.
When the user presses the "Enter" key on their keyboard, the value they typed will be returned and
assigned to the first_name variable.
"""
first_name = input("Enter your first name: ")

"""
The input function will print "Enter your last name: " and wait for the user to type their entry.
When the user presses the "Enter" key on their keyboard, the value they typed will be returned and
assigned to the last_name variable.
"""
last_name = input("Enter your last name: ")

print("Hello", first_name, last_name)           #Prints a greeting to the user using the values of the first_name and last_name variables.
