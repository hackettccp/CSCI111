"""
Demonstrates trimming strings.
"""

example = "John Smith , 123 Any Street , Philadelphia , PA , 19019 "

tokens = example.split(",")

#Untrimmed
print("Name     :", tokens[0], ".", sep="")
print("Street   :", tokens[1], ".", sep="")
print("City     :", tokens[2], ".", sep="")
print("State    :", tokens[3], ".", sep="")
print("Zip Code :", tokens[4], ".", sep="")

print()

#Trimmed
print("Name     :", tokens[0].lstrip().rstrip(), ".", sep="")
print("Street   :", tokens[1].lstrip().rstrip(), ".", sep="")
print("City     :", tokens[2].lstrip().rstrip(), ".", sep="")
print("State    :", tokens[3].lstrip().rstrip(), ".", sep="")
print("Zip Code :", tokens[4].lstrip().rstrip(), ".", sep="")

