package algorithms;

// TODO - in progress
public class SortExc {
    private static int[] intArray;
    private static int arraySize = 10;

    public static void main(String[] args) {
        SortExc sortExc = new SortExc();
        sortExc.initIntArray();
        sortExc.fillIntArray();
        sortExc.printArray(arraySize);

//        sortExc.linearSearch(13);
        sortExc.bubbleSort();
        sortExc.binarySearchForValue(13);
//        sortExc.selectionSort(13);
    }

    private void binarySearchForValue(int value) {
        int indexA = 0;
        int indexB = arraySize - 1;
        int indexMid = -1;

        while (indexA <= indexB) {
            indexMid = (indexA + indexB) / 2;
            if (intArray[indexMid] < value) {
                indexB = indexMid - 1;
            } else if (intArray[indexMid] > value) {
                indexA = indexMid + 1;
            } else if (indexA == indexB) {
                indexMid = -1;
                break;
            } else {
                break;
            }
        }

        if (indexMid > 0 && intArray[indexMid] == value) {
            printStarUnderIndex(String.valueOf(indexMid));
        } else {
            System.out.println("Value not found");
        }
    }

    private void bubbleSort() {
        for (int i = arraySize - 1; i >= 0; i--) {
            for (int j = i; j < arraySize - 1; j++) {
                if (intArray[j] < intArray[j + 1]) {
                    int tmpValue = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = tmpValue;
                }
            }
        }
        printArray(arraySize);
    }

    private void linearSearch(int value) {
        StringBuilder index = new StringBuilder();
        for (int i = 0; i < arraySize; i++) {
            if (intArray[i] == value && index.toString().equals("")) {
                index.append(i);
            } else if (intArray[i] == value && !index.toString().equals("")) {
                index.append(",").append(i);
            }
        }

        if (index.toString().equals("")) {
            System.out.println("Value not found");
        } else {
            printStarUnderIndex(index.toString());
        }
    }

    private void printStarUnderIndex(String index) {
        String[] splitArray = index.split(",");

        for (int i = 0; i < arraySize; i++) {
            if (checkIfContainIndex(splitArray, i)) {
                System.out.print("| " + "*" + "  ");
            } else {
                System.out.print("| " + " " + "  ");
            }

            if (i == arraySize - 1) {
                System.out.println("| - star (found value)");
            }
        }
        System.out.println("---------------------------------------------------");
    }

    private boolean checkIfContainIndex(String[] splitArray, int i) {
        boolean isContain = false;

        for (String singleValue : splitArray) {
            if (Integer.parseInt(singleValue) == i) {
                isContain = true;
                break;
            }
        }

        return isContain;
    }

    private void printArray(int arraySize) {
        System.out.println();
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + "  ");
            if (i == arraySize - 1) {
                System.out.println("| - index");
            }
        }
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + intArray[i] + " ");
            if (i == arraySize - 1) {
                System.out.println("| - value");
            }
        }
        System.out.println("---------------------------------------------------");
    }

    private void fillIntArray() {
        for (int i = 0; i < arraySize; i++) {
            intArray[i] = (int) (Math.random() * 10) + 10;
        }
    }

    private void initIntArray() {
        if (intArray == null) {
            intArray = new int[arraySize];
        }
    }
}
