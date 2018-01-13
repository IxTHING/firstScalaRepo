object Main {

  var helloWorld = "Hello World"

  def returnString(input: String): String = input

  def returnAll(input: Any): Any = input

  def returnPartOfString(stringInput: String, intInput: Int): String = stringInput.substring(intInput,stringInput.length())

  def returnFullWord(s1: String, s2: String, s3: Char, s4: Char): String = s1.concat(s2).replace(s3,s4)

  def returnValue(num1: Int, num2: Int, b: Boolean): Int = if(b){num1 + num2} else {num1 * num2}

  var r = "";
  def printMultipleLines(word: String, value: Int) = for(i <- 1 to value) println(word)

  def main(args: Array[String])  = {}
}


