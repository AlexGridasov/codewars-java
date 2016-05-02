package com.alex.gri;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alex on 02.05.16.
 */
public class VowelCountTest {

    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, VowelCount.getCount("abracadabra"));
    }

    @Test
    public void tesBytLetter() {
        assertEquals("5 a", 5, VowelCount.getCount("aaaaa"));
        assertEquals("5 e", 5, VowelCount.getCount("eeeee"));
        assertEquals("5 i", 5, VowelCount.getCount("iiiii"));
        assertEquals("5 o", 5, VowelCount.getCount("ooooo"));
        assertEquals("5 u", 5, VowelCount.getCount("uuuuu"));
    }

}