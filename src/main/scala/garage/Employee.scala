package garage

class Employee (_name: String, _age: Int, var _id: Int) extends Person(_name, _age){

  def id = _id
  def id_=(value:Int):Unit = _id = value


  override def toString = s"Employee(_id=$id, _name=$name, _age=$age)"
}
