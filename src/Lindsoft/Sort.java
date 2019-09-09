package Lindsoft;

public class Sort {

    public static int[] bubbleSort(int[] arrayList) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arrayList.length - 1; i++) {
                if (arrayList[i] > arrayList[i + 1]) {
                    temp = arrayList[i];
                    arrayList[i] = arrayList[i+1];
                    arrayList[i+1] = temp;
                    sorted = false;
                }
            }
        }

        return arrayList;
    }

    public int[] insertionSort(int[] arrayList) {

        for (int i = 1; i < arrayList.length; i++) {
            int current = arrayList[i];
            int j = i - 1;
            while(j >= 0 && current < arrayList[j]) {
                arrayList[j+1] = arrayList[j];
                j--;
            }
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= a[j]
            arrayList[j+1] = current;
        }

        return arrayList;
    }

    public int[] selectionSort(int[] arrayList) {

        for (int i = 0; i < arrayList.length; i++) {
            int min = arrayList[i];
            int minId = i;
            for (int j = i+1; j < arrayList.length; j++) {
                if (arrayList[j] < min) {
                    min = arrayList[j];
                    minId = j;
                }
            }
            // swapping
            int temp = arrayList[i];
            arrayList[i] = min;
            arrayList[minId] = temp;
        }
        return arrayList;
    }


    public int[] mergeSort(int[] arrayList) {

        return arrayList;
    }

    public int[] heapSort(int[] arrayList) {

        return arrayList;
    }

    public int[] quickSort(int[] arrayList) {

        return arrayList;
    }
}
