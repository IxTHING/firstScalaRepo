package garage

class Bike (_make: String, _registration: String, _colour: String, var _stroke: Integer, var _types: String)
  extends Vehicle(_make, _registration, _colour){

  def stroke = _stroke
  def stroke_=(value:Integer):Unit = _stroke = value

  def types = _types
  def types_=(value:String):Unit = _types = value

  override def toString = s"Vehicle(_make=$make, _registration=$registration, _colour=$colour, _stroke=$stroke, _types=$types)"
}

