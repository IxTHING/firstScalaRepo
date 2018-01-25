package garage

abstract class Person(var _name: String, var _age: Int) {

  def name = _name
  def name_=(value:String):Unit = _name = value

  def age = _age
  def age_=(value:Int):Unit = _age = value

  override def toString = s"Person(_name=$name, _age=$age)"
}
