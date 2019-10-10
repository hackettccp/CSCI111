"""
This program calculates retail prices.
"""

mark_up = 2.5                                                               #The markup percentage
another = "y"                                                               #Variable to control the loop.

while another == "y" or another == "Y":                                     #Process one or more items.
    wholesale = float(input("Enter the item's wholesale cost: "))           #Get the item"s wholesale cost.

    while wholesale < 0:                                                    #Validate the wholesale cost.
        print("ERROR: the cost cannot be negative.")
        wholesale = float(input("Enter the correct wholesale cost:"))
 
    retail = wholesale * mark_up                                            #Calculate the retail price.
    print("Retail price: $" + str(retail))                                  #Display the retail price.

    another = input("Do you have another item? (Enter y for yes): ")        #Do this again?

print("Program Complete")
