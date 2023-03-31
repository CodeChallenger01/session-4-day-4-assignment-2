import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class StorageWrapperTest extends AnyFlatSpec with Matchers {

  private val storageObj = new WrappingFromJava
  val array = Array(1, 2, 3, 4, 5, 6, 7)

  "addMethod" should "add the element in array" in {
    val actualOutput = storageObj.addElementInArray(array, array.length, 10)
    val expectedOutput = List(1, 2, 3, 4, 5, 6, 7, 10)
    expectedOutput shouldBe actualOutput
  }

  "addMethod" should "not add other  element in array" in {
    val actualOutput = storageObj.addElementInArray(array, array.length, 10)
    val expectedOutput = List(1, 2, 3, 4, 5, 6, 7, 100)
    assert(expectedOutput != actualOutput)
  }

  "removeElement" should "remove element from array" in {
    val actualOutput = storageObj.removeElementInArray(array, 3)
    val expectedOutput = List(1, 2, 4, 5, 6, 7)
    expectedOutput shouldBe actualOutput
  }

  "removeElement" should "return list if element not found" in {
    val actualOutput = storageObj.removeElementInArray(array, 13)
    val expectedOutput = List(1, 2, 3, 4, 5, 6, 7)
    expectedOutput shouldBe actualOutput
  }

  "removeAllElement" should "return list of empty type" in {
    val actualOutput = storageObj.removeAllElement(array)
    val expectedOutput = List()
    expectedOutput shouldBe actualOutput
  }

  "removeAllElement" should "not return list with element" in {
    val actualOutput = storageObj.removeAllElement(array)
    val expectedOutput = List(1, 2, 3, 4, 5)
    assert(expectedOutput != actualOutput)
  }

  "checkIfContains" should "return true boolean value" in {
    val actualOutput = storageObj.checkArrayElement(array, 2)
    val expectedOutput = true
    expectedOutput shouldBe actualOutput
  }

  "checkIfContains" should "return false boolean value" in {
    val actualOutput = storageObj.checkArrayElement(array, 12)
    val expectedOutput = false
    expectedOutput shouldBe actualOutput
  }

  "checkIfContains" should "not return false boolean value" in {
    val actualOutput = storageObj.checkArrayElement(array, 2)
    val expectedOutput = false
    assert(expectedOutput != actualOutput)
  }

  "checkIfContains" should "not return true boolean value" in {
    val actualOutput = storageObj.checkArrayElement(array, 12)
    val expectedOutput = true
    assert(expectedOutput != actualOutput)
  }

}
