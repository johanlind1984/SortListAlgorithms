package Lindsoft;

import java.util.Scanner;

public class MenuFunctions {



    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        boolean quit = false;

        while (true) {

            if(scanner.hasNextInt()) {
                userInput = scanner.nextInt();
                if(userInput >= 0) {
                    return userInput;
                }
            } else {
                System.out.println("You have to enter a integer.");
            }
            scanner.nextLine();
        }
    }

    public static void printMenu() {
        System.out.println(" 0. Quit \n 1. Bubblesort \n 2. Insertionsort \n 3. Selectionsort \n 4. Mergesot \n 5. Heapsort \n 6. Quicksort.");
    }
}
