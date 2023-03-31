# session-4-day-4-assignment-2

STEPS TO ADD JAVA & SCALA Classes Together 
Step 1: Open IntelliJ and create a new Project of Name assignment-2 
Step 2: Create Two java file of name Claculator and Storage in src/main/java.
Step 3: Create Two more class that extend property from java and display it by using scala and create in src/main/scala
Step 4: In java file create two classes:

1. Calculator: In calculator class define four method for addition of two element, subtraction of two element, multiplication of two element and division of two element with exception handling concept and pass two parameter to all.
Four methods are:
 i. add Element
 ii. subtractelement
 iii. multpiplicationOfElement
 iv. divideElement


2. Storgae :In storage class define four method operation that performed on the listare are:
 i.addElement: with three parameter
 ii. removeElement: with two parameter
 iii. removeAll: It should return the array of empty list.
 iv. checkIfContains it also takes a single parameter.
 
Step 5: Now similarly in scala file create three classes CalculatorScala, Driver and StorgaeWrapper.

1. CalculatorScala: It contains four same method as defined in scala but different syntax and in each method call it call method from java class method.
Four methods are:
 i.addTwoElement with two parameter and inside it call the add from java by creating instance of java.
 ii.subtractTwoElement :with two parameter and inside it call the subtract
 iii. multiplyTwoElement :with two parameter and inside it call the multiply
 iv. divideTwoElementwith two parameter and inside it call the divide
 
2. Now create StorageWrapper and inside the same file create a trait and add four abstract type method. and extend these method to other class with name WrappingFromJava. Inside the method call the java method defined to perform operations.
i.addElementInArray
ii. removeElementInArray
iii. removeAllElement
iv. checkArrayElement

3. Create a Driver scala and inside it make instance of both the class and make variable and store the operation after performing and print the result.
Step 6: After that add the scalatest dependencies in build.sbt file
Step 7: Create a two different Test Class in src/test/scala/. Inside the test class extend the AnyFlatSpec with Matchers Class and import the scalatest package in that test class.
Step 8: Inside the test class create instance of Class in each test case with **different scenario and check with assert. **
Step 9: In terminal run the command sbt test it show the result that test case is passed or fail.

OUTPUT
sbt compile & sbt run
![Screenshot from 2023-03-31 23-44-20](https://user-images.githubusercontent.com/124979629/229198658-41dfdd32-cd1e-4d0c-aac2-aed552ae21f8.png)
sbt test

![Screenshot from 2023-03-31 23-45-14](https://user-images.githubusercontent.com/124979629/229198685-62e34ae9-178a-46ae-b7d3-62a8bf8d25c2.png)

![Screenshot from 2023-03-31 23-45-30](https://user-images.githubusercontent.com/124979629/229198710-42de9368-76a4-496c-a2d8-73842d9cf90a.png)
