#Imports the Bus and Car object
from bus import Bus
from car import Car

"""
Taxi Object.
"""

#Class Header
class Taxi(Bus, Car) :

  #Initializer
  def __init__(self, make_in, model_in, year_in, riders_in , doors_in) :
    Bus.__init__(self, make_in, model_in, year_in, riders_in)
    Car.__init__(self, make_in, model_in, year_in, doors_in)
    self.meter = 5.0

  #Retrieves the meter
  def getmeter(self) :
    return self.meter


