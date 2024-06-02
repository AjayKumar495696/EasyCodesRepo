object factorialProgramme {
  def main(args:Array[String]):Unit={
    var a = scala.io.StdIn.ReadInt()
    println(s"Enter number a :")
    println(factorial(a))

    def factorial(n:Int):Int={
      if (n == 1) 1
      else {
        n * factorial(n-1)
      }
    }

  }
}
