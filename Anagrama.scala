object HelloWorld {
	def main(args: Array[String]): Unit = {
	  println("Ingrese palabra 1:")
	  val a = scala.io.StdIn.readLine()
	  println("Ingrese palabra 2:")
	  val b = scala.io.StdIn.readLine()

    printf(s"Las palabras '$a' y '$b' ")

    if(a.length() == b.length()){
      var char1 = a.toCharArray()
      var char2 = b.toCharArray()
      
      scala.util.Sorting.quickSort(char1)
      scala.util.Sorting.quickSort(char2)
      
      var result : Boolean = true; 
      result = java.util.Arrays.equals(char1, char2)
      if(result){
        println("Son anagramas.")
      }else{
        println("No son anagramas.")
      }
      
    }else{
      println("No son anagramas.")
    }
	}
}