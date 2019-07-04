package com.stackroute.exercise4;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceTest
{

    Replace replace;
    @Before
    public void setUp() throws Exception {
        replace= new Replace();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkOne() {
        String expected = "faity fry";
        String actual = replace.replace("daily dry");

        assertEquals(expected, actual);
    }

    @Test
    public void TestShouldReturnErrorMessage(){
        String expected = "should not enter empty string";
        String actual = replace.replace("");
        assertEquals(expected,actual);

    }

    @Test(expected = NullPointerException.class)
    public void TestShouldReturnNullException(){
        String result = replace.replace(null);

    }
}