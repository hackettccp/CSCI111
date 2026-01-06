"""
Demonstrates tokenizing strings.
"""

example = "This is a string"

tokens = example.split()

print(tokens[0])
print(tokens[1])
print(tokens[2])
print(tokens[3])
#print(tokens[4]) #IndexError

for t in tokens :
    print(t)

#********************************#
print()

date = "02/14/2016"

tokens2 = date.split("/")

month = tokens[0]
day = tokens[1]
year = tokens[2]

print("Month:", month)
print("Day:", day)
print("Year:", year)

#********************************#
print()
