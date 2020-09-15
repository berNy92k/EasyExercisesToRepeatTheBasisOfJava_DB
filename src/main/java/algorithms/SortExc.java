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

        sortExc.linearSearch(13);
//        sortExc.bubbleSort();
//        sortExc.binarySearchForValue(13);
//        sortExc.selectionSort(13);
    }

    private void linearSearch(int value) {

    }

    private void printArray(int arraySize) {
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
