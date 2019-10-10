"""
Demonstrates an Infinite While Loop
"""

while True:                                                                                 #Creates an infinite loop
    sales = float(input("Enter the amount of sales: "))                                     #Get a salesperson's sales and commission rate.
    comm_rate = float(input("Enter the commission rate: "))

    commission = sales * comm_rate                                                          #Calculate the commission.

    print("The commission is $", format(commission, ",.2f"), sep="")                        #Display the commission.

    keep_going = input("Do you want to calculate another commission (Enter y for yes): ")   #See if the user wants to do another one.

    if keep_going != "y" and keep_going != "Y" :                                            #Tests if the uses didn't enter y or Y
      break                                                                                 #Exits the loop

print("Program Complete")
