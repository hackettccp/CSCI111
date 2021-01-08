"""
Demonstrates set functions
"""

#Declares two sets
numbers1 = {20, 40, 10, 30}
numbers2 = {10, 50, 30, 60}

#Intersection
intersect = numbers1.intersection(numbers2)
print("The intersection of the sets:")
print(intersect)
print()

#Union
union = numbers1.union(numbers2)
print("The union of the sets:")
print(union)
print()

#Difference
difference = numbers1.difference(numbers2)
print("The difference of numbers1 and number2:")
print(difference)
print()
difference2 = numbers2.difference(numbers1)
print("The difference of numbers2 and number1:")
print(difference2)
print()

#Symmetric Difference
sym_difference = numbers1.symmetric_difference(numbers2)
print("The symmetric difference of the sets:")
print(sym_difference)
print()
