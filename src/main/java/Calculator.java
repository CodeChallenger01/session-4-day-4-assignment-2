public class Calculator {
    /* This method is used to add two integer element */
    int addElement(int elementOne, int elementTwo) {
        return elementOne + elementTwo;
    }

    /* This method is used to subtract two integer element */
    int subtractElement(int elementOne, int elementTwo) {
        int subtract;
        if (elementOne > elementTwo) {
            subtract = elementOne - elementTwo;
        } else {
            subtract = elementTwo - elementOne;
        }
        return subtract;
    }

    /* This method is used to multiply two integer element */
    int multiplyElement(int elementOne, int elementTwo) {
        if (elementOne == 0 || elementTwo == 0) return 0;
        else {
            int multiply = elementOne * elementTwo;
            return multiply;
        }
    }

    /* This method is used to divide two integer element */
    int divideElement(int dividend, int divisor) {
        try {
            if (divisor == 0) throw new ArithmeticException("Divide By Zero");
            else {
                int divide = dividend / divisor;
                return divide;
            }
        } catch (Exception e) {
            return -1;
        }
    }
}


