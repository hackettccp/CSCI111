"""
Demonstrates branching statements
"""


for i in range(1, 21) :               #Includes logic and a break statement to exit the loop when the counter's value is 15.
  if i == 15 :
    break                             #Immediately stops the loop
  print(i)

print()

for i in range(1, 51) :               #Includes logic and a continue statement to skip printing any even numbers.
  if i % 2 == 0 :
    continue                          #Begins the next iteration of the loop
  print(i)


