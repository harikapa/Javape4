package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MatchesMethodDemoTest {


    public static MatchesMethodDemo matchesMethodDemo;

    @BeforeClass
    public static void setUp()
    {
        matchesMethodDemo = new MatchesMethodDemo();
    }

    @AfterClass
    public static void tearDown()
    {
        matchesMethodDemo = null;
    }

    @Test
    public void givenStringShouldReturnMatchedPositions()
    {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(27);
        assertEquals(list, matchesMethodDemo.getStringMatches("She sells seashells by the seashore","se"));

        list.clear();
        list.add(0);
        assertEquals(list, matchesMethodDemo.getStringMatches("RegularExpression","Re"));


        list.clear();
        assertEquals(list, matchesMethodDemo.getStringMatches("RegularExpression","abc"));
    }

    @Test
    public void givenNullShouldReturnNull()
    {
        assertNull(matchesMethodDemo.getStringMatches(null,"a"));
    }

    @Test
    public void givenEmptyStringShouldReturnNull()
    {
        assertNull(matchesMethodDemo.getStringMatches("","a"));
    }





}