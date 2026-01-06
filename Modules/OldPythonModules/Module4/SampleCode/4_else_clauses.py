"""
Demonstrates the else clause
"""

water_temp = int(input("Enter the water temperature: "))    #Gets the temperature of the water

if water_temp <= 32 :                                       #Prints if the water is frozen (temperature is less than or equal to 32) or not frozen
  print("The water is frozen.")
else :
  print("The water is not frozen.")

print()

if water_temp >= 212 :                                      #Prints if the water is boiling (temperature is greater than or equal to 212) or not boiling
  print("The water is boiling.")
else :
  print("The water is not boiling.")

print()

if water_temp > 32 and water_temp < 212 :                   #Prints if the water is liquid (temperature is between to 33 and 211) or not liquid
  print("The water is liquid.")
else :
  print("The water is not liquid.")

