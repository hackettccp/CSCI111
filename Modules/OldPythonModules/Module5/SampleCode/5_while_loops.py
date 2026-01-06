"""
This program assists a technician in the process
of checking a substance's temperature.
"""

max_temp = 102.5                                                                    #Create a variable to represent the maximum temperature.

temperature = float(input("Enter the substance's Celsius temperature: "))           #Get the substance's temperature.

while temperature > max_temp:                                                       #As long as necessary, instruct the user to adjust the thermostat.
    print("The temperature is too high.")
    print("Turn the thermostat down and wait")
    print("5 minutes. Then take the temperature")
    print("again and enter it.")
    temperature = float(input("Enter the new Celsius temperature: "))

print("The temperature is acceptable.")                                             #Remind the user to check the temperature again in 15 minutes.
print("Check it again in 15 minutes.")


