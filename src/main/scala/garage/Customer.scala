package garage

class Customer (_name: String, _age: Int, var _id: Int) extends Person(_name, _age){

  def id = _id
  def id_=(value:Int):Unit = _id = value

  override def toString = s"Person(_name=$name, _age=$age, _id=$id)"
}
