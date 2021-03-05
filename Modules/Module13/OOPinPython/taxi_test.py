#Imports the Taxi object
from taxi import Taxi

"""
Demonstrates a Taxi Object.
"""

def main() :
  test_taxi = Taxi("Yellow Cab", "NYC1", 2005, 4, 2)
  print(test_taxi.getmake())	
  print(test_taxi.getmodel())	
  print(test_taxi.getyear())	
  print(test_taxi.getriders())	
  print(test_taxi.getmeter())

  test_taxi.soundhorn()
	
main()



