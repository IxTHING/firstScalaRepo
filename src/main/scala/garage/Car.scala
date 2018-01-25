package garage

class Car (_make: String, _registration: String, _colour: String, var _doors: Integer, var _seats: Integer)
  extends Vehicle(_make, _registration, _colour){

  def doors = _doors
  def doors_=(value:Integer):Unit = _doors = value

  def seats = _seats
  def seats_=(value:Integer):Unit = _seats = value

  override def toString = s"Vehicle(_make=$make, _registration=$registration, _colour=$colour, _doors=$doors, _seats=$seats)"
}
