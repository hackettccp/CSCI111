#Imports the Automobile object
from automobile import Automobile

"""
Car Object.
"""

#Class Header
class Car(Automobile) :

  #Initializer
  def __init__(self, make_in, model_in, year_in, doors_in) :
    #Initializes the superclass
    Automobile.__init__(self, make_in, model_in, year_in)

    #Initializes its own field
    self.doors = doors_in

  #Retrieves the doors
  def getdoors(self) :
    return self.doors

  #Changes the doors
  def setdoors(self, doors_in) :
    self.doors = doors_in

  #Makes a "noise"
  def soundhorn(self) :
    print("Beep Beep!")
