"""
Automobile Object.
"""

#Class Header
class Automobile :

  #Initializer
  def __init__(self, make_in, model_in, year_in) :
    self.make = make_in
    self.model = model_in
    self.year = year_in

  #Retrieves the make
  def getmake(self) :
    return self.make

  #Changes the make
  def setmake(self, make_in) :
    self.make = make_in

  #Retrieves the model
  def getmodel(self) :
    return self.model

  #Changes the model
  def setmodel(self, model_in) :
    self.model = model_in

  #Retrieves the year
  def getyear(self) :
    return self.year

  #Changes the year
  def setyear(self, year_in) :
    self.year = year_in

  #Makes a "noise"
  def soundhorn(self) :
    print("Honk Honk!")


