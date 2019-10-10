"""
Demonstrates global variables
"""

g_variable = "I'm a global variable"        #Declares a variable named g_variable and assigns it the value "I'm a global variable"

def main() :
  print(g_variable)                         #Prints the value of g_variable
  localtest()                               #Calls the localtest procedure

  #Attempts to print the value of the local_var variable
  #It is unable to, because local_var exists only in the localtest function.
  #To fix, comment out or remove the below line
  print(local_var)

def localtest() :
  print("In local_test function")           #Prints the text "In local_test function"
  print(g_variable)                         #Prints the value of g_variable
  local_var = "I'm a local variable"        #Declares a variable named local_var and assigns it the value "I'm a local variable"
  print(local_var)                          #Prints the value of local_var


main()                                      #Calls main procedure

