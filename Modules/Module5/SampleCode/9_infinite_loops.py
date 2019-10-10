"""
This program demonstrates an infinite loop.
This program will need to be force closed as it will never end.
"""

keep_going = "y"                                                        #Variable to control the loop.

#Warning! Infinite loop! This program will never end.
while keep_going == "y":
    sales = float(input("Enter the amount of sales: "))                 #Get a salesperson's sales and commission rate.
    comm_rate = float(input("Enter the commission rate: "))

    commission = sales * comm_rate                                      #Calculate the commission.

    print("The commission is $", format(commission, ",.2f"), sep="")    #Display the commission.

"""
Since keep_going never changes in the body of the loop,
the loop's condition will always be true.
"""
