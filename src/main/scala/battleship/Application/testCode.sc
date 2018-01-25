

//var grid:Map[String, String] = Map()
val boat = new PatrolBoat()

val gen = new GridGeneration(5, 5)

gen.generateGrid()
gen.printMap()

gen.choosePosition(2, 2, 'u', boat)
gen.choosePosition(5, 5, 'u', boat)

gen.printMap()

gen.grid