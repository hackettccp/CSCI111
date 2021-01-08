"""
Demonstrates subsets and supersets
"""

#Declares two sets
values1 = {"A", "C"}
values2 = {"A", "B", "C"}

#Subsets
#Tests if values1 is a subset of values2
if values1.issubset(values2) :
  print(values1, "is a subset of", values2)

#Tests if values2 is a subset of values1
if values2.issubset(values1) :
  print(values2, "is a subset of", values1)

print()

#Supersets
#Tests if values1 is a superset of values2
if values1.issuperset(values2) :
  print(values1, "is a superset of", values2)

#Tests if values2 is a superset of values1
if values2.issuperset(values1) :
  print(values2, "is a superset of", values1)

print()

