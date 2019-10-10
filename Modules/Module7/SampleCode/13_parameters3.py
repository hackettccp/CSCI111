"""
Demonstrates what happens when you change the value of a parameter.
"""

def change_me(v):
    print("I am changing the value.")
    v = 0                                   #Does not affect the value variable outside of the procedure.
    print("Now the value is", v)

value = 99                                  #Declared a variable named value and assigns it 99
print("The value is", value)                #Prints the value
change_me(value)                            #Calls the change_me procedure
print("Back in main the value is", value)   #Prints the value
