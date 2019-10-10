"""
Demonstrates how numbers can be displayed with formatting.

The format function always returns a string-type, regardless
of if the value to be formatted is a float or int.

f - floating point value
d - decimal integer value
e - scientific notation

"""

amount_due = 15000.0
monthly_payment = amount_due / 12
print("The monthly payment is $", monthly_payment)                              #No formatting applied

monthly_payment_rounded = format(monthly_payment, ".2f")                        #Formatted to two decimal places
print("The monthly payment is $", monthly_payment_rounded)               

monthly_payment_rounded = format(monthly_payment, ",.2f")                       #Formatted to two decimal places and includes commas
print("The monthly payment is $", monthly_payment_rounded)              
print("The monthly payment is $", monthly_payment_rounded, sep="")              #No separator character(s) printed between the arguments


print()


weekly_pay = 1300
annual_salary = weekly_pay * 52
print("The annual salary is $", annual_salary)                                  #No formatting applied

annual_salary_formatted = format(annual_salary, ",d")                           #Formatted with commas
print("The annual salary is $", annual_salary_formatted)
print("The annual salary is $", format(annual_salary, ",d"), sep="")            #No separator character(s) printed between the arguments

print()


distance = 567.465234
print("The distance is", distance)                                              #No formatting applied

distance_formatted = format(distance, ".5e")                                    #Formatted in scientific notation with 5 decimal places
print("The distance is", distance_formatted)


print()


num1 = 127.899
num2 = 3465.148
num3 = 3.776
num4 = 264.821
num5 = 88.081
num6 = 799.999

print(format(num1, '7.2f'))                #Displays each number in a field/width of 7 characters (including decimal point) and rounded to 2 decimal places
print(format(num2, '7.2f'))
print(format(num3, '7.2f'))
print(format(num4, '7.2f'))
print(format(num5, '7.2f'))
print(format(num6, '7.2f'))

