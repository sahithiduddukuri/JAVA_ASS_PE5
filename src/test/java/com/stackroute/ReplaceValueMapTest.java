package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ReplaceValueMapTest {

    ReplaceValueMap replaceValueMap;
    @Before
    public void setUp() throws Exception {
        replaceValueMap=new ReplaceValueMap();
    }

    @After
    public void tearDown() throws Exception {
        replaceValueMap=null;
    }

    @Test
    public void replaceValueOne() {
        Map<String,String> map=new HashMap<>();
        map.put("val1", "java");
        map.put("val2","c++");

        Map<String,String> mapNew=new HashMap<>();
        mapNew.put("val1", " ");
        mapNew.put("val2","java");
        assertEquals(mapNew,replaceValueMap.replaceValue(map));
    }

    @Test
    public void replaceValueTwo() {
        Map<String,String> map=new HashMap<>();
        map.put("val1", "mars");
        map.put("val2","saturn");

        Map<String,String> mapNew=new HashMap<>();
        mapNew.put("val1", " ");
        mapNew.put("val2","mars");
        assertEquals(mapNew,replaceValueMap.replaceValue(map));
    }
    @Test
    public void replaceValueThree() {
        Map<String,String> map=new HashMap<>();
        map.put("valA", "mars");
        map.put("valB","saturn");

        Map<String,String> mapNew=new HashMap<>();
        mapNew.put("val1", " ");
        mapNew.put("val2","mars");
        assertNotEquals(mapNew,replaceValueMap.replaceValue(map));
    }


}