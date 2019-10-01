package Lindsoft;

public class Sort {

    public static int[] bubbleSort(int[] array) throws InterruptedException {
        // while the array is not sorted keep stepping through the arrays positions checking if array[i] holds a value
        // greater than array[i+1], if position i holds a greater value than position i+1, swap the positions placing
        // the greater value at pos i + 1.

        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {


                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                    printArray(array, i, (i+1));
                }

            }
        }

        return array;
    }

    public static int[] insertionSort(int[] array) throws InterruptedException {
        // Outer forloop iterates through the array, nested whileloop iterates backwards from position i-1 and
        // looks for a greater value than position array[i], if found place the greater value at position [j+1]

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
                printArray(array, j, j+1);
            }

            array[j+1] = current;

        }

        return array;
    }

    public static int[] selectionSort(int[] array) throws InterruptedException {
        // outer forloop iterates through the array, storing a value at position i in varible min, stores position i in
        // minId. Inner forloop starts at position i+1 and iterates through the array checking if position j is less
        // than position min (which is position i in array). If the value at position j is less than position min,
        // set min to hold position j instead, and set varible min to the value at position j. When the inner forloop
        // is completed the min hold the lowest value in the array and the position of the lowest value in the array.
        // After the inner forloop ends, swap array[min] with array[i].

        for (int i = 0; i < array.length; i++) {
            //printArray(array);

            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }

            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
            printArray(array, i, minId);
        }
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

    public static void printArray(int[] array, int posOneSwap, int posTwoSwap) throws InterruptedException {

        for (int i = 0; i < 50; ++i) System.out.println();

        for(int i = 0; i < array.length; i++) {
            System.out.print("\u001B[0m" + array[i]);
            for (int j = 1; j < array[i]/10; j++) {
                if(i == posOneSwap) {
                    System.out.print("\u001B[31m" + "|");
                } else if ( i == posTwoSwap){
                    System.out.print("\u001B[32m" + "|");
                } else {
                    System.out.print("\u001B[0m" + "|");
                }
            }
            System.out.println("");
        }
        Thread.sleep(100);
    }
}
