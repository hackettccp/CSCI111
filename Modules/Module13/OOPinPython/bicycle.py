"""
Bicycle Object.
"""

#Class Header
class Bicycle :

  """
  Initializer that creates three fields
  """
  def __init__(self, gear_in, speed_in, color_in) :
    self.gear = gear_in
    self.speed = speed_in
    self.color = color_in

  #ACCESSORS
  """
  Accessor function for the gear field
  """
  def getgear(self) :
    return self.gear

  """
  Accessor function for the speed field
  """
  def getspeed(self) :
    return self.speed

  """
  Accessor function for the color field
  """
  def getcolor(self) :
    return self.color

  #MUTATORS
  """
  Mutator function for the gear field
  """
  def setgear(self, gear_in) :
    if not isinstance(gear_in, int) : 
      raise TypeError("Value not an int")
    
    if gear_in >= 1 and gear_in <= 10 : 
      self.gear = gear_in
    else :
      raise ValueError("Value not in 1-10")


  """
  Mutator function for the speed field
  """
  def setspeed(self, speed_in) :
    self.speed = speed_in

  """
  Mutator function for the color field
  """
  def setcolor(self, color_in) :
    self.color = color_in

  #OTHER FUNCTIONS
  """
  Returns a copy/clone of this class
  """
  def copy(self) :
    return Bicycle(self.gear, self.speed, self.color)

  """
  String representation of this instance
  """
  def __str__(self) :
    toString = "Bicycle Information: \n"
    toString += "Current Gear: " + str(self.gear) + "\n"
    toString += "Current Speed: " + str(self.speed) + "\n"
    toString += "Color: " + self.color

    return toString

