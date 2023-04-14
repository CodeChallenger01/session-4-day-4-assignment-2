import com.typesafe.scalalogging.Logger

class CalculatorScala {
  private val loggers = Logger(getClass)
  private val obj = new Calculator

  /* This method is used to add element by calling the method defined in java*/
  def addTwoElement(firstNumber: Int, secondNumber: Int): Int = {
    loggers.info(" Performing the addition operation ")
    obj.addElement(firstNumber, secondNumber)
  }

  /* This method is used to subtract element by calling the method defined in java*/
  def subtractTwoElement(firstNumber: Int, secondNumber: Int): Int = {
    loggers.info(" Performing the subtraction operation ")
    obj.subtractElement(firstNumber, secondNumber)
  }

  /* This method is used to multiply element by calling the method defined in java*/
  def multiplyTwoElement(firstNumber: Int, secondNumber: Int): Int = {
    loggers.info(" Performing the multiplication operation ")
    obj.multiplyElement(firstNumber, secondNumber)
  }

  /* This method is used to divide element by calling the method defined in java*/
  def divideTwoElement(firstNumber: Int, secondNumber: Int): Int = {
    loggers.info(" Performing the division  operation ")
    obj.divideElement(firstNumber, secondNumber)
  }

}

