package Lindsoft;

import java.io.IOException;

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

    public static void printArray(int[] array, int posOneSwap, int posTwoSwap) throws InterruptedException {

        String stringToPrint = "";

        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}

  /*      for(int i = 0; i < array.length; i++) {
            System.out.print("\u001B[0m" + array[i]);
            for (int j = 1; j <= array[i]/10; j++) {
                if(i == posOneSwap) {
                    System.out.print("\u001B[31m" + "|");
                    if(j == array[i]/10) {
                        System.out.print("LOW SWAP");
                    }
                } else if ( i == posTwoSwap){
                    System.out.print("\u001B[32m" + "|");
                    if(j == array[i]/10) {
                        System.out.print("HIGH SWAP");
                    }
                } else {
                    System.out.print("\u001B[0m" + "|");
                }
            }
            System.out.println("");
        }
        Thread.sleep(5); */

        for(int i = 0; i < array.length; i++) {
            stringToPrint += "\u001B[0m" + array[i] + "\t";

            for (int j = 1; j <= array[i]/10; j++) {
                if(i == posOneSwap) {
                    stringToPrint += "\u001B[31m" + "|";
                    if(j == array[i]/10) {
                        stringToPrint += "LOW SWAP";
                    }
                } else if ( i == posTwoSwap){
                    stringToPrint += "\u001B[32m" + "|";
                    if(j == array[i]/10) {
                        stringToPrint += "HIGH SWAP";
                    }
                } else {
                    stringToPrint += "\u001B[0m" + "|";
                }
            }
            stringToPrint += "\u001B[0m" + "\n";

        }

        System.out.println(stringToPrint);
        Thread.sleep(25);
    }
}

