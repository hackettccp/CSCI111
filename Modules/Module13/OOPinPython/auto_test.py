#Imports the Car object
from car import Car

"""
Demonstrates a Car Object.
"""

def main() :
  test_car = Car("Ford", "Focus", 2013, 2)
  print(test_car.getmake())
  print(test_car.getmodel())
  print(test_car.getyear())
  print(test_car.getdoors())
  test_car.soundhorn()
	
main()


