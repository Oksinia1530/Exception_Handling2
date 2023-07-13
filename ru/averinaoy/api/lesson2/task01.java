/*Implement a method that prompts the user to enter a fractional number (of type float) 
and returns the value entered. Entering text instead of a number should not cause the app to crash, 
instead, you should re-prompt the user for input. */

package ru.averinaoy.api.lesson2;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        float number = getFloat();
        System.out.println("Enter the number: " + number);
    }

    public static float getFloat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a fractional number: ");
        while (true) {
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Try again: ");
            }
        }
    }
}