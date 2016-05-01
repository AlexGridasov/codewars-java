package com.alex.gri;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alex on 01.05.16.
 */
public class EmailObfuscatorTest {

    @Test
    public void shouldObfuscateAtSymbol() {
        assertEquals("[at]",
                EmailObfuscator.obfuscate("@"));
    }

    @Test
    public void shouldObfuscateDotSymbol() {
        assertEquals("[dot]",
                EmailObfuscator.obfuscate("."));
    }

    @Test
    public void test1() {
        assertEquals("test [at] 123 [dot] com",
                EmailObfuscator.obfuscate("test@123.com"));
    }

    @Test
    public void test2() {
        assertEquals("Code_warrior [at] foo [dot] ac [dot] uk",
                EmailObfuscator.obfuscate("Code_warrior@foo.ac.uk"));
    }
}