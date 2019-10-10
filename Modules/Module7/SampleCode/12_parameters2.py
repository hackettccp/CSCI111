"""
This program uses parameters and the return value of a function.
"""
    
"""
The sum_ages function accepts two arguments and returns the sum of those arguments.
"""
def sum_ages(num1, num2):
    result = num1 + num2
    return result


first_age = int(input("Enter your age: "))                      #Get the user's age.
second_age = int(input("Enter your best friend's age: "))       #Get the user's best friend's age.

total = sum_ages(first_age, second_age)                         #Get the sum of both ages.

print("Together you are", total, "years old.")                  #Display the total age.
