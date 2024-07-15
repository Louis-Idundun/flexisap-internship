package com.flexisaf.flexisafinternship.week1;

import java.util.Collection;
import java.util.List;

public class GenericElementCounter {
    public static <T> int counter(Collection<T> collection, String property) {
        int count = 0;
        for (T element : collection) {
            if (check(element, property)) {
                count++;
            }
        }
        return count;
    }
    private static <T> boolean check(T element, String property) {
        switch (property.toLowerCase()) {
            case "odd":
                if (element instanceof Integer && ((Integer) (element) % 2 != 0)) {
                    return true;
                }
                break;
            case "prime":
                if (element instanceof Integer) {
                    int num = (Integer) element;
                    if (num <= 1) {
                        return false;
                    }
                    for (int i = 2; i * i <= num; i++) {
                        if (num % i == 0) {
                            return false;
                        }
                    }
                    return true;
                }
                break;
            case "palindrome":
                String str = String.valueOf(element);
                return isPalindrome(str);
        }
        return false;
    }
    private static boolean isPalindrome(String str) {
        int leftSide = 0;
        int rightSide = str.length() - 1;
        while (leftSide < rightSide) {
            if (str.charAt(leftSide++) != str.charAt(rightSide--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 21, -12);

        int oddCount = counter(numbers, "odd");
        System.out.println("Number of odd integers: " + oddCount);

        int primeCount = counter(numbers, "prime");
        System.out.println("Number of prime integers: " + primeCount);

        List<String> words = List.of("radar", "hello", "level", "world", "deified", "121", "11", "1");

        int palindromeCount = counter(words, "palindrome");
        System.out.println("Number of palindrome strings: " + palindromeCount);
    }
}