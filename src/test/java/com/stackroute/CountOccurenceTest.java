package com.stackroute;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountOccurenceTest {

    CountOccurence countOccurencetest;
    @Before
    public void setUp() throws Exception {
        countOccurencetest=new CountOccurence();
    }

    @After
    public void tearDown() throws Exception {
        countOccurencetest=null;
    }

    @Test
    public void countOccurenceOne() {
        String string= "one one -one___two,,three,one @three*one?two";
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("one",5);
        hashMap.put("two",2);
        hashMap.put("three",2);
        assertEquals(hashMap,countOccurencetest.countOccurence(string));

    }

    @Test
    public void countOccurenceTwo() {
        String string= "hai?hello-henry__henry,Bye,Bye";
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("hai",1);
        hashMap.put("hello",1);
        hashMap.put("henry",2);
        hashMap.put("Bye",2);
        assertEquals(hashMap,countOccurencetest.countOccurence(string));

    }

    @Test
    public void countOccurenceThree() {
        String string= "Check__Check-Mike Check";
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Check",3);
        hashMap.put("Mike",1);
        assertEquals(hashMap,countOccurencetest.countOccurence(string));

    }
}