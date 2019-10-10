"""
This program determines whether a bank customer
qualifies for a loan.
"""

min_salary = 30000.0                                                                                    #The minimum annual salary
min_years = 2                                                                                           #The minimum years on the job

salary = float(input("Enter your annual salary: "))                                                     #Prompts for the customer's annual salary
years_on_job = int(input("Enter the number of years employed: "))                                       #Prompts for the number of years on the current job

if salary >= min_salary:                                                                                #Determines if the salary is high enough
    if years_on_job >= min_years:                                                                       #Determines if the time period is long enough
        print("You qualify for the loan.")
    else:
        print("You must have been employed for at least", min_years, "years to qualify.")               #Does not qualify (time period not long enough)
else:
    print("You must earn at least $", format(min_salary, ",.2f"), " per year to qualify.", sep="")      #Does not qualify (salary not high enough)

        

