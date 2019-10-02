package Lindsoft;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int speed = 0;
        int minValue = 10;
        int maxValue = 300;
        int arrayLength = 60;
        int userInput = 0;
        boolean quit = false;

        while (!quit) {

            MenuFunctions.printMenu();
            System.out.println("You are going to sort a array of lenght: " + arrayLength + ", minimum value: " + minValue + " maximum valie: " + maxValue);
            userInput = MenuFunctions.getInput();
            int[] sortArray = ArrayFunctions.createArray(minValue, maxValue, arrayLength);

            switch (userInput) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    Sort.bubbleSort(sortArray);
                    break;
                case 2:
                    Sort.insertionSort(sortArray);
                    break;
                case 3:
                    Sort.selectionSort(sortArray);
                    break;
                case 4:
                    MergeSort.mergeSort(sortArray, 0, sortArray.length-1);
                    break;
                default:
            }

        }
    }
}