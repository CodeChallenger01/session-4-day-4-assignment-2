class CalculatorScala {
  private val obj = new Calculator

  /* This method is used to add element by calling the method defined in java*/
  def addTwoElement(firstNumber: Int, secondNumber: Int): Int = {
    obj.addElement(firstNumber, secondNumber)
  }

  /* This method is used to subtract element by calling the method defined in java*/
  def subtractTwoElement(firstNumber: Int, secondNumber: Int): Int = {
    obj.subtractElement(firstNumber, secondNumber)
  }

  /* This method is used to multiply element by calling the method defined in java*/
  def multiplyTwoElement(firstNumber: Int, secondNumber: Int): Int = {
    obj.multiplyElement(firstNumber, secondNumber)
  }

  /* This method is used to divide element by calling the method defined in java*/
  def divideTwoElement(firstNumber: Int, secondNumber: Int): Int = {
    obj.divideElement(firstNumber, secondNumber)
  }

}

