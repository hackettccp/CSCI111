#Imports the Bus object
from bus import Bus


"""
SchoolBus Object.
"""

#Class Header
class SchoolBus(Bus) :

  #Initializer
  def __init__(self, make_in, model_in, year_in, riders_in) :
    Bus.__init__(self, make_in, model_in, year_in, riders_in)
    self.color = "Yellow"

  #Retrieves the color
  def getcolor(self) :
    return self.color


