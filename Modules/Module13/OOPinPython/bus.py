#Imports the Automobile object
from automobile import Automobile

"""
Bus Object.
"""

#Class Header
class Bus(Automobile) :

  #Initializer
  def __init__(self, make_in, model_in, year_in, riders_in) :
    Automobile.__init__(self, make_in, model_in, year_in)
    self.riders = riders_in

  #Retrieves the riders
  def getriders(self) :
    return self.riders

  #Makes a "noise"
  """
  def soundhorn(self) :
    print("Ding Ding!")
  """
