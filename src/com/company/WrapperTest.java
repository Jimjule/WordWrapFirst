package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class WrapperTest {

    @Test
    public void testWrapperNotNull() {
        Wrapper wrapper = new Wrapper();

        assertNotNull(wrapper);
    }

    @Test
    public void testWrapReturnsString() {
        Wrapper wrapper = new Wrapper();

        assertEquals("This is a string with looooooong words and various others and stuff", wrapper.wrap("This is a string with looooooong words and various others and stuff", 200));
    }

    @Test
    public void testWrapSimple() {
        Wrapper wrapper = new Wrapper();
        assertEquals("A short\n line", wrapper.wrap("A short line", 7));
    }

    @Test
    public void testWrapBreaksString10() {
        Wrapper wrapper = new Wrapper();
        assertEquals("This is a \nstring wit\nh looooooo\nng words a\nnd various\n others an\nd stuff", wrapper.wrap("This is a string with looooooong words and various others and stuff", 10));
    }

    @Test
    public void testWrapBreaksString7() {
        Wrapper wrapper = new Wrapper();
        assertEquals("This is\n a stri\nng with\n looooo\noong wo\nrds and\n variou\ns other\ns and s\ntuff", wrapper.wrap("This is a string with looooooong words and various others and stuff", 7));
    }
}