"""
Demonstrates type casting.
"""

int_value1 = 35                                     #Declares a variable named int_value1 and assigns it the value 35
float_value1 = float(int_value1)                    #Declares a variable named float_value1 and assigns it int_value1 typecast as a float

print(int_value1)                                   #Prints the value of int_value1. The typecast did not change the variable, its value, or its type.
print(float_value1)                                 #Prints the value of float_value1.


print()


float_value2 = 23.8                                 #Declares a variable named float_value2 and assigns it the value 23.8
int_value2 = int(float_value2)                      #Declares a variable named int_value2 and assigns it float_value2 typecast as an int

print(float_value2)                                 #Prints the value of float_value2. The typecast did not change the variable, its value, or its type.
print(int_value2)                                   #Prints the value of int_value2


print()


str_value1 = "101"                                  #Declares a variable named str_value1 and assigns it the string literal "101"

total1 = int(str_value1) + int_value1               #Declares a variable named total1 and assigns to it the sum of str_value1 (typecast as an int) and int_value1
total2 = str_value1 + str(int_value1)               #Declares a variable named total2 and assigns to it the concatenation of str_value1 and int_value1 (typecast as a string) 

print("total1:", total1)                            #Prints the value of total1
print("total2:", total2)                            #Prints the value of total1


print()


str_value2 = "102.7"                                #Declares a variable named str_value2 and assigns it the string literal "102.7"

total3 = float(str_value2) - int_value2             #Declares a variable named total3 and assigns to it the difference of str_value2 (typecast as a float) and int_value2

print("total3:", total3)                            #Prints the value of total3


print()


str_value3 = "102.7 FM"                             #Declares a variable named str_value3 and assigns it the string literal "102.7 FM"

float_value3 = float(str_value3)                    #Declares a variable named float_value3 and attempts to assign to it str_value3 typecast as a float.
                                                    #This will not work and will cause an exception, stopping the program.

                                                    #The same thing would happen if we tried to convert str_value3 to an int.
                                                    #Additionally, "102.7" could not be converted to an int because it contains
                                                    #a period. This is ok when converting to a float because the period represents
                                                    #the decimal place.

