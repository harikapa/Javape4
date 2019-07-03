package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReplaceTest {

    public static StringReplace stringReplace;

    @BeforeClass
    public static void setUp()
    {
        stringReplace = new StringReplace();
    }

    @AfterClass
    public static void tearDown()
    {
        stringReplace = null;
    }


    @Test
    public void givenStringShouldReturnStringAfterReplacingdAndl()
    {
        assertEquals("fairy mitk", stringReplace.replaceCharacters("dairy milk"));
    }

    @Test
    public void givenStringShouldReturnStringAfterReplacingl()
    {
        assertEquals("tetters", stringReplace.replaceCharacters("letters"));
    }

    @Test
    public void givenStringShouldReturnOriginalString()
    {
        assertEquals("Dairy", stringReplace.replaceCharacters("Dairy"));
    }

    @Test
    public void givenNullShouldReturnErrorMessage()
    {
        assertEquals("String must not be null or empty", stringReplace.replaceCharacters(null));
    }

    @Test
    public void givenEmptyStringShouldReturnErrorMessage()
    {
        assertEquals("String must not be null or empty", stringReplace.replaceCharacters(""));
    }

}