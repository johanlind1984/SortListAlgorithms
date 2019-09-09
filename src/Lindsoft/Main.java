package Lindsoft;

import java.util.ArrayList;
import java.util.Random;

public class Main {
 //////////////////////FIXA SÅ DET ÄR ARRAYS INTE ARRAYLISTS, array.lenght ist för array.size() /////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        int[] array = ArrayFunctions.createArray(30, 200, 10);
        ArrayFunctions.printArray(array);
        Sort.bubbleSort(array);
        ArrayFunctions.printArray(array);


    }
}
