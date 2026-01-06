"""
Demonstrates concatenation and appending strings
"""

united = "United"                                   #Declares a variables named united and assigns the string literal "United" to it
states = "States"                                   #Declares a variables named states and assigns the string literal "States" to it
of_america = "of America"                           #Declares a variables named of_america and assigns the string literal "of America" to it

usa1 = united + states + of_america                 #Declares a variable named usa1 and concatenates the united, states, and of_america together and assigns the result to the usa1 variable

print(usa1)                                         #Prints the value of the usa1 variable

usa1 = united + " " + states + " " + of_america     #Concatenates the united, states, and of_america together with spaces and assigns the result to the usa1 variable

print(usa1)                                         #Prints the value of the usa1 variable

print()

print(united)                                       #Prints the values of the original 3 variables to show their individual values have not changed
print(states)
print(of_america)


print()


usa2 = ""                                           #Declares a variable named usa2 and assigns usa2 an empty string
        
usa2 += united                                      #Appends the value of united to usa2
usa2 += " "                                         #Appends a space to usa2
usa2 += states                                      #Appends the value of states to usa2
usa2 += " " + of_america                            #Concats a space with of_america and appends the result to usa2
        
print(usa2)                                         #Prints the value of the usa2 variable.

print()

print(united)                                       #Prints the values of the original 3 variables to show their individual values have not changed
print(states)
print(of_america)

