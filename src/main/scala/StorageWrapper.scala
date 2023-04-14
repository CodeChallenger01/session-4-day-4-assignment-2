import com.typesafe.scalalogging.Logger

trait StorageWrapper {
  val storageWrapper = new Storage

  def addElementInArray(arrayOfInteger: Array[Int], length: Int, value: Int): List[Int]

  def removeElementInArray(arrayOfInteger: Array[Int], position: Int): List[Int]

  def removeAllElement(arrayOfInteger: Array[Int]): List[Int]

  def checkArrayElement(arrayOfInteger: Array[Int], valueToCheck: Int): Boolean
}

/* A class extending the trait of name StorageWrapper and defined all the method inside this class */
class WrappingFromJava extends StorageWrapper {
  val loggers = Logger(getClass)
  /* This method is used to add element in array by calling the method defined in java Storage Class */
  def addElementInArray(arrayOfInteger: Array[Int], length: Int, value: Int): List[Int] = {
    loggers.info(" Adding the element in The array of Element ")
    val result = storageWrapper.addElement(arrayOfInteger, length, value)
    val list: List[Int] = result.toList
    list
  }

  /* This method is used to remove element in array by calling the method defined in java Storage Class */
  def removeElementInArray(arrayOfInteger: Array[Int], position: Int): List[Int] = {
    loggers.info(" Removing the element from The array of Element ")
    val result = storageWrapper.removeElement(arrayOfInteger, position)
    val list = result.toList
    list
  }

  /* This method is used to remove All element in array by calling the method defined in java Storage Class */
  def removeAllElement(arrayOfInteger: Array[Int]): List[Int] = {
    loggers.info(" Removing All elements  in The array of Element ")
    val result = storageWrapper.removeAll(arrayOfInteger)
    val list = result.toList
    list
  }

  /* This method is used to check element in array by calling the method defined in java Storage Class */
  def checkArrayElement(arrayOfInteger: Array[Int], valueToCheck: Int): Boolean = {
    loggers.info(" Checking the value available in array or not ")
    val result: Boolean = storageWrapper.checkIfContains(arrayOfInteger, valueToCheck)
    result
  }
}

