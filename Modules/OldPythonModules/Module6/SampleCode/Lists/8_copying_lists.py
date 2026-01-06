"""
Demonstrates copying lists
"""

numbers = [1, 2, 3, 4]                              #Declares a list named numbers containing the values 1, 2, 3 and 4

numbers2 = numbers                                  #Creates a shallow copy of the numbers list named numbers2

numbers2[0] = 100                                   #Changes the first element of the numbers2 list to 100

print("numbers:", numbers)                          #Prints the numbers list (in list form)


print()


scores = [80.5, 75.4, 90.15, 86.75]                 #Declares a list named scores containing the values 80.5, 75.4, 90.15 and 86.75    
scores2 = []                                        #Declares an empty list named scores2
        
for s in scores:                                    #Copies each element from the scores list to the scores2 list
  scores2.append(s)

scores[1] = 93.25;                                  #Changes the second element of the scores list to 93.25
        
print("scores:", scores)                            #Prints the scores list (in list form)
print("scores2:", scores2)                          #Prints the scores2 list (in list form)


print()


values = [5, 7, 3, 1]                               #Declares a list named values containing 5, 7, 3 and 1     
values2 = [] + values                               #Declares a list named values2 and assigns it a deep copy of the values list

values2[0] = 50;                                    #Changes the first element of the scores list to 50
        
print("values:", values)                            #Prints the values list (in list form)
print("values2:", values2)                          #Prints the values2 list (in list form)

