package com.stackroute.exercise4;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurenceTest {

    Occurence occurence;
    @Before
    public void setUp() throws Exception {
        occurence= new Occurence();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestCheckOccurence() {
        String expected="10";
        String actual=occurence.countOccurence("Java is java again java again","a");

        assertEquals(expected,actual);
    }
    @Test(expected = NullPointerException.class)
    public void TestShouldReturnNullException(){
        String result = occurence.countOccurence(null,null);

    }
    @Test
    public void TestShouldreturnZero() {
        String expected="0";
        String actual=occurence.countOccurence("Java is java again java again","b");

        assertEquals(expected,actual);
    }
    @Test
    public void TestShouldReturnErrorMessage(){
        String expected = "should not enter empty string";
        String actual = occurence.countOccurence("","");
        assertEquals(expected,actual);

    }
}
