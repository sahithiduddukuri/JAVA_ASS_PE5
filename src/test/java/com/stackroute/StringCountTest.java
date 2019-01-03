package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringCountTest {
    StringCount stringCountTest;
    @Before
    public void setUp() throws Exception {
        stringCountTest=new StringCount();
    }

    @After
    public void tearDown() throws Exception {
        stringCountTest=null;
    }

    @Test
    public void stringCountOne() {
        String arr[] = {"a","b","c","d","a","c","c"};
        Map<String,Boolean> map=new HashMap<>();
        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);

        assertEquals(map,stringCountTest.stringCount(arr));
    }


    @Test
    public void stringCountTwo() {
        String arr[] = {"1","1","2","1","2","3","3","4"};
        Map<String,Boolean> map=new HashMap<>();
        map.put("1",true);
        map.put("2",true);
        map.put("3",true);
        map.put("4",false);

        assertEquals(map,stringCountTest.stringCount(arr));
    }
}