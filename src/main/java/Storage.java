public class Storage {

    /* This method is used to add element in array */
    int[] addElement(int arr[], int length, int value) {
        int[] newArray = new int[length + 1];
        for (int index = 0; index < length; index++) {
            newArray[index] = arr[index];
        }
        newArray[length] = value;
        return newArray;
    }

    /* This method is used to remove element in array */
    int[] removeElement(int arr[], int position) {
        int length = arr.length;
        int[] newArray = new int[length - 1];
        if (position < arr.length && position >= 0) {
            for (int index = 0; index < length - 1; index++) {
                if (arr[index] == position) {
                    for (index = position - 1; index < length - 1; index++) {
                        newArray[index] = arr[index + 1];
                    }
                } else {
                    newArray[index] = arr[index];
                }
            }
            return newArray;
        } else {
            return arr;
        }
    }

    /* This method is used to removeAll element in array */
    int[] removeAll(int arr[]) {
        arr = new int[0];
        return arr;
    }

    /* This method is used to check that element is present in array */
    boolean checkIfContains(int arr[], int valueToCheck) {
        int length = arr.length;
        int flag = 0;
        for (int index = 0; index < length - 1; index++) {
            if (arr[index] == valueToCheck) {
                flag += 1;
                break;
            }
            arr[index] = arr[index + 1];
        }
        if (flag == 1) return true;
        else return false;
    }
}
