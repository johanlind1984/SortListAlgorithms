package Lindsoft;

public class ArrayFunctions {

    public static int[] createArray(int minValue, int maxValue, int totalValues) {
        // creates array with random numbers between minValue and

        int[] unSortedArray = new int[totalValues];
        int tempNum;

        for (int i = 0; i <= totalValues - 1; i++) {
            tempNum = (int) ((maxValue - minValue) * Math.random() + minValue);
            unSortedArray[i] = tempNum;
        }

        return unSortedArray;
    }

    public static void printArray(int[] arrayList) {
        //prints all the values of the array
        System.out.println("===START OF LIST===");
        for (int value : arrayList) {
            System.out.println(value);
        }
        System.out.println("===END OF LIST===");
    }
}

