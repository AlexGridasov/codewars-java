package com.alex.gri;

import java.util.Arrays;
import java.util.List;

/**
 * Created by alex on 02.05.16.
 */
public class VowelCount {

//    public static List<String> vowelsList = Arrays.asList("a", "e", "i", "o", "u");

    /**
     * Return the number (count) of vowels in the given string.
     * We will consider a, e, i, o, and u as vowels
     * @param str the given string
     * @return number of vowels
     */
    public static int getCount(String str) {
        int vowelsCount = (int) Arrays.asList(str.split(""))
                .stream()
                .filter(letter -> letter.matches("[aeiou]"))
                .count();

        return vowelsCount;
    }
}
