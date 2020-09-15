package algorithms;

public class ArrayExc {

    private static int[] intArray;
    private static int arraySize = 10;

    public static void main(String[] args) {
        ArrayExc arrayExc = new ArrayExc();
        arrayExc.initIntArray();
        arrayExc.fillIntArray();
        arrayExc.printArray(arraySize);

//        arrayExc.getValueByIndex(5);
//        arrayExc.getIndexesByValue(15);
//        arrayExc.removeRowByIndex(3);
//        arrayExc.insertValue(13);
        arrayExc.linearSearch(13);
    }

    private void linearSearch(int value) {
        getIndexesByValue(value);
    }

    private void insertValue(int value) {
        int newArraySize = arraySize + 1;
        int[] newIntArray = new int[newArraySize];

        for (int i = 0; i < newArraySize; i++) {
            if (i == newArraySize - 1) {
                newIntArray[i] = value;
            } else {
                newIntArray[i] = intArray[i];
            }
        }

        intArray = newIntArray;
        printArray(newArraySize);
    }

    private void removeRowByIndex(int index) {
        int[] newIntArray = new int[arraySize - 1];

        int indexToSelectData = 0;
        for (int i = 0; i < arraySize; i++) {
            if (i != index) {
                newIntArray[indexToSelectData++] = intArray[i];
            }
        }

        intArray = newIntArray;
        printArray(arraySize - 1);
    }

    private void getIndexesByValue(int value) {
        StringBuilder indexed = new StringBuilder();
        for (int i = 0; i < arraySize; i++) {
            if (intArray[i] == value) {
                if (!indexed.toString().equals("")) {
                    indexed.append(",");
                }
                indexed.append(i);
            }
        }
        System.out.println("Search index/es by value: " + indexed);
    }

    private void getValueByIndex(int index) {
        for (int i = 0; i < arraySize; i++) {
            if (i == index) {
                System.out.println("Search value by index: " + intArray[i]);
                break;
            }
        }
    }

    private void printArray(int arraySize) {
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++) {
            System.out.println("| " + i + " | " + intArray[i] + " |");
            System.out.println("----------");
        }
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
