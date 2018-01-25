package garage

class Vehicle (var _make: String, var _registration: String, var _colour: String){
  def make = _make
  def make_=(value:String):Unit = _make = value

  def registration = _registration
  def registration_=(value:String):Unit = _registration = value

  def colour = _colour
  def colour_=(value:String):Unit = colour = value


  override def toString = s"Vehicle(_make=$make, _registration=$registration, _colour=$colour)"
}
