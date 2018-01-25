package garage

import scala.collection.mutable.ListBuffer

class Garage {

  var vehicles: ListBuffer[Vehicle] = ListBuffer()
  var employees: ListBuffer[Employee] = ListBuffer()
  var customers: ListBuffer[Customer] = ListBuffer()

  var open: Boolean = false

  def removeVehicle(reg: String, vType: String): Any = vType match {
    case "car" => removeVehicle(vehicles.filter(v => v.isInstanceOf[Car]).filter(v => v._registration.equals(reg)).head)
    case "bike" => removeVehicle(vehicles.filter(v => v.isInstanceOf[Bike]).filter(v => v._registration.equals(reg)).head)
    case _=> "Type not recognized"
  }

  def addCar(vehicle: Vehicle): Unit = {
    vehicles += vehicle
  }

  def removeVehicle(vehicle: Vehicle): Unit ={
    vehicles -= vehicle
  }

  def registerEmployee(emp: Employee): Unit ={
    employees += emp
  }

  def registerCustomer(cus: Customer): Unit ={
    customers += cus
  }

  override def toString = s"Garage(vehicles=$vehicles, employees=$employees, customers=$customers)"
}
