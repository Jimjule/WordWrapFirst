package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testMainNotNull() {
        Main main = new Main();

        assertNotNull(main);
    }

    @Test
    public void testWrapReturnsString() {
        Main main = new Main();

        assertEquals("This is a string with looooooong words and various others and stuff", main.wrap("This is a string with looooooong words and various others and stuff", 200));
    }

    @Test
    public void testWrapSimple() {
        Main main = new Main();
        assertEquals("A short\n line", main.wrap("A short line", 7));
    }

    @Test
    public void testWrapBreaksString10() {
        Main main = new Main();
        assertEquals("This is a \nstring wit\nh looooooo\nng words a\nnd various\n others an\nd stuff", main.wrap("This is a string with looooooong words and various others and stuff", 10));
    }

    @Test
    public void testWrapBreaksString7() {
        Main main = new Main();
        assertEquals("This is\n a stri\nng with\n looooo\noong wo\nrds and\n variou\ns other\ns and s\ntuff", main.wrap("This is a string with looooooong words and various others and stuff", 7));
    }
}