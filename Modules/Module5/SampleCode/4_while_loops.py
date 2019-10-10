"""
This program calculates sales commissions.
"""

keep_going = "y"                                                #Creates a variable to control the loop.

while keep_going == "y":                                        #Calculate a series of commissions.
    sales = float(input("Enter the amount of sales: "))         #Get a salesperson's sales and commission rate.
    comm_rate = float(input("Enter the commission rate: "))

    commission = sales * comm_rate                              #Calculate the commission.
    print("The commission is $" + str(commission))              #Display the commission.

    keep_going = input("Do you want to calculate another commission (Enter y for yes): ")   #See if the user wants to do another one.

print("Program Complete")
