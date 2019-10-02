package Lindsoft;

import java.io.IOException;

class MergeSort
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    public static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];

        // print needs to be colored medween l and r....

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {

            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    public static void mergeSort(int[] array, int left, int right) throws InterruptedException {
        if (left < right)
        {
            // Find the middle point
            int middle = (left+right)/2;

            // Sort first and second halves
            mergeSort(array, left, middle);
            mergeSort(array ,middle+1, right);

            // Merge the sorted halves
            merge(array, left, middle, right);
            printMergeSort(array, left, right, middle);
        }
    }

    public static void printMergeSort(int[] array, int left, int right, int middle) throws InterruptedException {

        String stringToPrint = "";

        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}

        for(int i = 0; i < array.length; i++) {
            stringToPrint += "\u001B[0m" + array[i] + "\t";

            for (int j = 1; j <= array[i]/10; j++) {
                if(i >= left && i <= middle) {
                    stringToPrint += "\u001B[31m" + "|";
                    if(j == array[i]/10) {
                        stringToPrint += "LEFT SIDE";
                    }

                } else if ( i <= right && i > middle){
                    stringToPrint += "\u001B[32m" + "|";
                    if(j == array[i]/10) {
                        stringToPrint += "RIGHT SIDE";
                    }
                } else {
                    stringToPrint += "\u001B[0m" + "|";
                }
            }
            stringToPrint += "\u001B[0m" + "\n";

        }

        System.out.println(stringToPrint);
        Thread.sleep(200);

    }
}
