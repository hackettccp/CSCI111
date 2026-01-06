"""
Demonstrates string slicing (substrings)
"""

example = "Community College of Philadelphia" 

slice1 = example[10:16]                                 #Characters 10 through 15
print(slice1)

slice2 = example[:17]                                   #Characters 0 through 16
print(slice2)

slice3 = example[28:]                                   #Characters 28 through end
print(slice3)

slice4 = example[:-12]                                  #Characters 0 through (end-12)
print(slice4)

