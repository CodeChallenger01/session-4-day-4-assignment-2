import com.typesafe.scalalogging.Logger

/* This is Driver object that is used to call all the method inside it */
object Driver extends App {
  val loggers = Logger(getClass)
  /* This 7 line of code is used to print the output of java Calculator class method*/
  private val calculatorTestObj = new CalculatorScala
  private val firstNumber: Int = 100;
  private val secondNumber: Int = 10;
  private val addition: Int = calculatorTestObj.addTwoElement(firstNumber, secondNumber)
  private val subtraction: Int = calculatorTestObj.subtractTwoElement(firstNumber, secondNumber)
  private val multiply: Int = calculatorTestObj.multiplyTwoElement(firstNumber, secondNumber)
  private val division: Int = calculatorTestObj.divideTwoElement(firstNumber, secondNumber)
  loggers.info("Addition of Two Number :" + addition)
  loggers.info("Subtraction of Two Number :" + subtraction)
  loggers.info("Multiplication of Two Number :" + multiply)
  loggers.info("Division of Two Number :" + division)

  /* The below code is to perform operation on Storage Class methods */
  private val storageObj = new WrappingFromJava
  private val array: Array[Int] = Array(1, 2, 3, 4)

  private val arrayAfterAddition: List[Int] = storageObj.addElementInArray(array, array.length, 100)
  loggers.info("\nArray After adding Element : " + arrayAfterAddition)

  private val arrayAfterRemoving: List[Int] = storageObj.removeElementInArray(array, 2)
  loggers.info("Array After removing Element : " + arrayAfterRemoving)

  private val checkElementInArray: Boolean = storageObj.checkArrayElement(array, 4)
  loggers.info("Status of number present is array is : " + checkElementInArray)

  private val arrayAfterRemovingAllElement: List[Int] = storageObj.removeAllElement(array)
  loggers.info("After Removing all the element of array : " + arrayAfterRemovingAllElement)

}