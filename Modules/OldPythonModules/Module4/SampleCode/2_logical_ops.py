"""
Demonstrates logical operators
"""

b1 = True                                                   #Four variables used in the demonstrations below
b2 = False
b3 = False
b4 = True
        
result1 = b1 and b2                                         #Result of b1 and'ed with b2
print("b1 and b2 is", result1)                              #Prints the value of result1


print()


result2 = b1 or b2                                          #Result of b1 or'ed with b2
print("b1 or b2 is", result2)                               #Prints the value of result2


print()


result3 = b1 or b2 and b3                                   #Result of b1 or'ed with b2 and'ed with b3
print("b1 or b2 and b3 is", result3)                        #Prints the value of result3


print()


result4 = (b1 or b2) and b3                                 #Result of (b1 or'ed with b2) and'ed with b3
print("(b1 or b2) and b3 is", result4)                      #Prints the value of result4


print()


result5 = b1 or not b2 and b3                               #Result of b1 or'ed with not b2 and'ed with b3
print("b1 or not b2 and b3 is", result5)                    #Prints the value of result5


print()


result6 = b1 or not(b2 and b3)                              #Result of b1 or'ed with not(b2 and'ed with b3)
print("b1 or not(b2 and b3) is", result6)                   #Prints the value of result6

