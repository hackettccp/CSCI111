#Imports the SchoolBus object
from schoolbus import SchoolBus

"""
Demonstrates a SchoolBus Object.
"""

def main() :
  test_bus = SchoolBus("Bus Co.", "SB101", 1998, 25)
  print(test_bus.getmake())	
  print(test_bus.getmodel())	
  print(test_bus.getyear())	
  print(test_bus.getriders())
  print(test_bus.getcolor())
	
main()



