"""
Demonstrates string indexes
"""

example = "Community College of Philadelphia"


first_character = example[0]                                #Gets and prints the first character in the string
print("The first character is", first_character)

character_fifteen = example[15]                             #Gets and prints the fifteenth character in the string
print("The fifteenth character is", character_fifteen)

last_character = example[-1]                                #Gets and prints the last character in the string
print("The last character is", last_character)

length = len(example)                                       #Gets and prints the length of the string
print("The length of the string is", length)

for character in example :                                  #Prints each character in the string
  print(character)


