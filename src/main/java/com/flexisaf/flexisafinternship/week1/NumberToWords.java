package com.flexisaf.flexisafinternship.week1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberToWords {

    private static final String[] units = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static String numberToWords(int number) {
        if (number < 0) {
            return "minus " + numberToWords(-number);
        }
        if (number < 20) {
            return units[number];
        }
        if (number < 100) {
            return tens[number / 10] + ((number % 10 != 0) ? " " + units[number % 10] : "");
        }
        if (number < 1000) {
            return units[number / 100] + " hundred" + ((number % 100 != 0) ? " and " + numberToWords(number % 100) : "");
        }
        return "Number out of range";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number between 0 and 999: ");
            String input = scanner.nextLine();

            if (input == null || input.trim().isEmpty()) {
                throw new InvalidInputException("Input cannot be null or empty.");
            }

            int number = Integer.parseInt(input.trim());

            if (number < 0 || number > 999) {
                throw new NumberOutOfRangeException("Number out of range: " + number);
            }

            System.out.println("The number in words is: " + numberToWords(number));
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter an integer.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter a valid number.");
        } catch (InvalidInputException e) {
            System.err.println(e.getMessage());
        } catch (NumberOutOfRangeException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}