package battleship.board

import battleship.units.Boat

class GridGeneration (val width: Int, val length: Int) {

  var grid:Map[String, String] = Map()
  var grid2:Map[String, String] = Map()

  def generateGrid(): Unit ={
    for(x <- 0 to width by 1){
      for(y <- 0 to length by 1){
        val coord = x.toString + "," + y.toString
        println(coord)
        grid += (coord -> "Null")
      }
    }
  }

  def choosePosition(x: Int, y: Int, d: Char, p: Boat): String ={
    val pLength = p.length
    if(d == 'u'){
      if(y + pLength <= length){
        placePiece(x, y, d, pLength)
        return "Piece placed"
      }
      return "Piece is out of bounds"
    }
    if(d == 'd'){
      if(y - pLength >= 0){
        placePiece(x, y, d, pLength)
        return "Piece placed"
      }
      return "Piece is out of bounds"
    }
    if(d == 'l'){
      if(x - pLength >= 0){
        placePiece(x, y, d, pLength)
        return "Piece placed"
      }
      return "Piece is out of bounds"
    }
    if(d == 'r'){
      if(x + pLength <= width){
        placePiece(x, y, d, pLength)
        return "Piece placed"
      }
    }
    "Nothing happened"
  }

  def placePiece(x: Int,y: Int, d: Char, length: Int): Unit ={
    var location = x.toString + "," + y.toString
    for(i <- 1 to length){
      if(d == 'u'){
        grid += (location -> "boat")
        location = x.toString + "," + y+1.toString
      }
      if(d == 'd'){
        grid += (location -> "boat")
        location = x.toString + "," + (y-1).toString
      }
      if(d == 'l'){
        grid += (location -> "boat")
        location = (x-1).toString + "," + y.toString
      }
      if(d == 'r') {
        grid += (location -> "boat")
        location = x+1.toString + "," + y.toString
      }
    }
  }

  def printMap():Unit ={
    for((k,v)<-grid)printf("key: %s, value: %s\n", k, v)
  }
}
