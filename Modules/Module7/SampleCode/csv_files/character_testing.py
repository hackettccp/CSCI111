"""
Demonstrates string/character tests
"""

#Gets a string from the user.
example = input("Enter a string: ")

print("This is what I found about that string:")

for character in example :
    
    if character.isdigit():
        print(character, " is a digit.")
    if character.isalpha():
        print(character, " is a letter.")
    if character.isspace():
        print(character, " is a space.")
    if character.islower():
        print(character, " is a lowercase letter.")
    if character.isupper():
        print(character, " is an uppercase letter.")
    if character.isalnum():
        print(character, " is alphanumeric.")
    

