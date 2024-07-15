package com.flexisaf.flexisafinternship.week1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnnotationExample {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");
        words.add("elderberry");

        System.out.println("Original list: " + words);

        String wordToRemove = "banana";
        String letterToRemove = "ry";

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.equals(wordToRemove) || word.contains(letterToRemove)) {
                iterator.remove();
            }
        }

        System.out.println("Modified list after removing \"" + wordToRemove + "\": " + words);
        System.out.println("Modified list after removing words with \"" + letterToRemove + "\": " + words);
    }
}
