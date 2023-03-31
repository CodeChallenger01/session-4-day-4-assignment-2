import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CalculatorScalaTest extends AnyFlatSpec with Matchers {

  private val calculatorTestObj = new CalculatorScala

  "it " should "match with addition of two number" in {
    val (firstNumber, secondNumber) = (100, 20)
    val actualOutput = calculatorTestObj.addTwoElement(firstNumber, secondNumber)
    val expectedOutput = 120
    expectedOutput shouldBe actualOutput
  }

  "it " should "not match with different sum of two number" in {
    val (firstNumber, secondNumber) = (100, 20)
    val actualOutput = calculatorTestObj.addTwoElement(firstNumber, secondNumber)
    val expectedOutput = 150
    assert(expectedOutput != actualOutput)
  }

  "it " should "match with subtraction of two number" in {
    val (firstNumber, secondNumber) = (100, 20)
    val actualOutput = calculatorTestObj.subtractTwoElement(firstNumber, secondNumber)
    val expectedOutput = 80
    expectedOutput shouldBe actualOutput
  }

  "it " should "match with subtraction of two number if we swap both number" in {
    val (firstNumber, secondNumber) = (20, 100)
    val actualOutput = calculatorTestObj.subtractTwoElement(firstNumber, secondNumber)
    val expectedOutput = 80
    expectedOutput shouldBe actualOutput
  }

  "it " should "match with multiplication of two number" in {
    val (firstNumber, secondNumber) = (100, 20)
    val actualOutput = calculatorTestObj.multiplyTwoElement(firstNumber, secondNumber)
    val expectedOutput = 2000
    expectedOutput shouldBe actualOutput
  }

  "it " should "match with multiplication of two number with zero" in {
    val (firstNumber, secondNumber) = (100, 0)
    val actualOutput = calculatorTestObj.multiplyTwoElement(firstNumber, secondNumber)
    val expectedOutput = 0
    expectedOutput shouldBe actualOutput
  }

  "it " should "not match with multiplication of two number with zero" in {
    val (firstNumber, secondNumber) = (100, 0)
    val actualOutput = calculatorTestObj.multiplyTwoElement(firstNumber, secondNumber)
    val expectedOutput = 200
    assert(expectedOutput != actualOutput)
  }

  "it " should "match with division of two number" in {
    val (dividend, divisor) = (10, 2)
    val actualOutput = calculatorTestObj.divideTwoElement(dividend, divisor)
    val expectedOutput = 5
    expectedOutput shouldBe actualOutput
  }

  "it " should "match with -1 if divisor is 0" in {
    val (dividend, divisor) = (10, 0)
    val actualOutput = calculatorTestObj.divideTwoElement(dividend, divisor)
    val expectedOutput = -1
    expectedOutput shouldBe actualOutput
  }

  "it " should "not match with -1 if divisor is not zero" in {
    val (dividend, divisor) = (10, 10)
    val actualOutput = calculatorTestObj.divideTwoElement(dividend, divisor)
    val expectedOutput = -1
    assert(expectedOutput != actualOutput)
  }

}
