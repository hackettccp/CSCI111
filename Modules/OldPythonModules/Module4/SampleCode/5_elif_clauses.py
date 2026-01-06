"""
Demonstrates elif clauses
"""


score = int(input("Enter your test score: "))     #Prompts the user to enter their test score

if score >= 90 :                                  #90 or above is an A
  print("Your grade is an A.")
elif score >= 80 and score <= 89 :                #80-89 is a B
  print("Your grade is a B.")
elif score >= 70 and score <= 79 :                #70-79 is a C
  print("Your grade is a C.")
elif score >= 60 and score <= 69 :                #60-69 is a D
  print("Your grade is a D.")
else :                                            #Anything else is an F
  print("Your grade is an F.")

        

