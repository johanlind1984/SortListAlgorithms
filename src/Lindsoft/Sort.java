package Lindsoft;

import java.io.IOException;

public class Sort {

    public static int[] bubbleSort(int[] array) throws InterruptedException {
        // while the array is not sorted keep stepping through the arrays positions checking if array[i] holds a value
        // greater than array[i+1], if position i holds a greater value than position i+1, swap the positions placing
        // the greater value at pos i + 1.
        int iterations = 0;
        int swaps = 0;
        boolean sorted = false;
        int temp;

        while(!sorted) {
            sorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                iterations++;

                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                    swaps++;
                    ArrayFunctions.printArray(array, i, (i+1));
                    System.out.println("======= BUBBLESORT =======");

                }

            }
        }
        System.out.println("SORT COMPLETED, TOTAL ITERATIONS: " + iterations + "\n" + "\t TOTAL SWAPS: " + swaps);
        return array;
    }

    public static int[] insertionSort(int[] array) throws InterruptedException {
        // Outer forloop iterates through the array, nested whileloop iterates backwards from position i-1 and
        // looks for a greater value than position array[i], if found place the greater value at position [j+1]
        int iterations = 0;
        int swaps = 0;

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            while(j >= 0 && current < array[j]) {
                iterations++;
                array[j+1] = array[j];
                j--;
                swaps++;
                ArrayFunctions.printArray(array, j, j+1);
                System.out.println("======= INSERSIONSORT =======");
            }

            array[j+1] = current;

        }
        System.out.println("SORT COMPLETED, TOTAL ITERATIONS: " + iterations + "\n" + "\t TOTAL SWAPS: " + swaps);
        return array;
    }

    public static int[] selectionSort(int[] array) throws InterruptedException {
        // outer forloop iterates through the array, storing a value at position i in varible min, stores position i in
        // minId. Inner forloop starts at position i+1 and iterates through the array checking if position j is less
        // than position min (which is position i in array). If the value at position j is less than position min,
        // set min to hold position j instead, and set varible min to the value at position j. When the inner forloop
        // is completed the min hold the lowest value in the array and the position of the lowest value in the array.
        // After the inner forloop ends, swap array[min] with array[i].

        int iterations = 0;
        int swaps = 0;

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;

            for (int j = i+1; j < array.length; j++) {
                iterations++;

                if (array[j] < min) {
                    min = array[j];
                    minId = j;

                }
            }

            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
            swaps++;
            ArrayFunctions.printArray(array, i, minId);
            System.out.println("======= SELECTIONSORT =======");
        }

        System.out.println("SORT COMPLETED, TOTAL ITERATIONS: " + iterations + "\n" + "\t TOTAL SWAPS: " + swaps);
        return array;
    }


    public int[] mergeSort(int[] array) {
        // to be implemented
        return array;

    }

    public int[] heapSort(int[] array) {
        // to be implemented

        return array;
    }

    public int[] quickSort(int[] array) {
        // to be implemented
        return array;
    }
}
