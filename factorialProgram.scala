object factorialProgramme {
  def main(args:Array[String]):Unit={
    var a = scala.io.StdIn.ReadInt()
    println(s"Enter number a :")
    println(factorial(a))

    def factorial(k:Int):Int={
      if (k == 1) 1
      else {
        k * factorial(k-1)
      }
    }

  }
}
