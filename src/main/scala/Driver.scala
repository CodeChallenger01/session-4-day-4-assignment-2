/* This is Driver object that is used to call all the method inside it */
object Driver extends App {

  /* This 7 line of code is used to print the output of java Calculator class method*/
  private val calculatorTestObj = new CalculatorScala
  private val firstNumber: Int = 100;
  private val secondNumber: Int = 10;
  private val addition: Int = calculatorTestObj.addTwoElement(firstNumber, secondNumber)
  private val subtraction: Int = calculatorTestObj.subtractTwoElement(firstNumber, secondNumber)
  private val multiply: Int = calculatorTestObj.multiplyTwoElement(firstNumber, secondNumber)
  private val division: Int = calculatorTestObj.divideTwoElement(firstNumber, secondNumber)
  println("Addition of Two Number :" + addition)
  println("Subtraction of Two Number :" + subtraction)
  println("Multiplication of Two Number :" + multiply)
  println("Division of Two Number :" + division)

  /* The below code is to perform operation on Storage Class methods */
  private val storageObj = new WrappingFromJava
  private val array: Array[Int] = Array(1, 2, 3, 4)

  private val arrayAfterAddition: List[Int] = storageObj.addElementInArray(array, array.length, 100)
  println("\nArray After adding Element : " + arrayAfterAddition)

  private val arrayAfterRemoving: List[Int] = storageObj.removeElementInArray(array, 2)
  println("Array After removing Element : " + arrayAfterRemoving)

  private val checkElementInArray: Boolean = storageObj.checkArrayElement(array, 4)
  println("Status of number present is array is : " + checkElementInArray)

  private val arrayAfterRemovingAllElement: List[Int] = storageObj.removeAllElement(array)
  println("After Removing all the element of array : " + arrayAfterRemovingAllElement)

}