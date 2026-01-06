"""
Demonstrates string indexes
"""

example = "Community College of Philadelphia"

#Gets and prints the first character in the string
first_character = example[0]
print("The first character is", first_character)

#Gets and prints the fifteenth character in the string
character_fifteen = example[15]
print("The fifteenth character is", character_fifteen)

#Gets and prints the last character in the string
last_character = example[-1]
print("The last character is", last_character)

#Gets and prints the length of the string
length = len(example)
print("The length of the string is", length)

#Prints each character in the string
for character in example :
  print(character)

