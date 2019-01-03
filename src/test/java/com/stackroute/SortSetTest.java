package com.stackroute;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SortSetTest {
    SortSet sortSet;
    @Before
    public void setUp() throws Exception {
        sortSet=new SortSet();
    }

    @After
    public void tearDown() throws Exception {
        sortSet=null;
    }

    @Test
    public void setSortOne() {
        String[] strings={"Harry","Olive","Alice","Bluto","Eugene"};
        TreeSet set=new TreeSet();
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        set.add("Harry");
        set.add("Olive");
        assertEquals(set,sortSet.setSort(strings));

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.addAll(set);

        assertEquals(arrayList,sortSet.setSortArr(set));
    }


    @Test
    public void setSortTwo() {
        String[] strings={"Akhila","Sruthi","Pavani","Andhra","Swathi"};
        TreeSet set=new TreeSet();
        set.add("Akhila");
        set.add("Andhra");
        set.add("Pavani");
        set.add("Sruthi");
        set.add("Swathi");
        assertEquals(set,sortSet.setSort(strings));

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.addAll(set);

        assertEquals(arrayList,sortSet.setSortArr(set));
    }

}