object factorialProgramme {
  def main(args:Array[String]):Unit={
    var a = scala.io.StdIn.ReadInt()
    println(s"Enter number a :")
    println(factorial(a))

    def factorial(a:Int):Int={
      if (a == 1) 1
      else {
        a * factorial(a-1)
      }
    }

  }
}
