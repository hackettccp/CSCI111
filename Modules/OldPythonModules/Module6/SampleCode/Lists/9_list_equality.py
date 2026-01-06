"""
Demonstrates testing the equality of lists.
"""

numbers1 = [3, 5, 7, 9]
numbers2 = [9, 7, 5, 3]
numbers3 = [3, 5, 7, 9]
numbers4 = [3, 5]


if numbers1 == numbers4 :                                 #Uses an if statement to print if the numbers1 and numbers4 lists are equal or not
  print("numbers1 and numbers4 are equal")
else :
  print("numbers1 and numbers4 are not equal")


if numbers1 == numbers3 :                                 #Uses an if statement to print if the numbers1 and numbers3 lists are equal or not
  print("numbers1 and numbers3 are equal")
else :
  print("numbers1 and numbers3 are not equal")


if numbers1 == numbers2 :                                 #Uses an if statement to print if the numbers1 and numbers2 lists are equal or not 
  print("numbers1 and numbers2 are equal")
else :
  print("numbers1 and numbers2 are not equal")


if numbers2 == numbers3 :                                 #Uses an if statement to print if the numbers2 and numbers3 lists are equal or not
  print("numbers2 and numbers3 are equal")
else :
  print("numbers2 and numbers3 are not equal")


if numbers3 == numbers4 :                                 #Uses an if statement to print if the numbers3 and numbers4 lists are equal or not
  print("numbers3 and numbers4 are equal")
else :
  print("numbers3 and numbers4 are not equal")

print()


numbers5 = numbers1                                       #Creates a shallow copy of the numbers1 list

if numbers5 is numbers1 :                                 #Uses an if statement to print if numbers5 is a shallow copy of the numbers1 array
  print("numbers5 is a shallow copy of numbers1")
else :
  print("numbers5 is not a shallow copy of numbers1")

