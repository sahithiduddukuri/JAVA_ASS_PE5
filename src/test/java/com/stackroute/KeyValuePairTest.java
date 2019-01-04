package com.stackroute;import org.junit.Before;
import org.junit.Test;import java.util.HashMap;
import java.util.List;import static org.junit.Assert.*;public class KeyValuePairTest {   KeyValuePair keyValuePair = new KeyValuePair();   @Test
public void test()
{
    HashMap<String,String> actual= new HashMap<String,String>();
    actual.put("val1","java");
    actual.put("val2","c++");
    HashMap<String,String> map= new HashMap<String,String>();
    map.put("val1"," ");
    map.put("val2","java");
    assertEquals(map,keyValuePair.replace(actual));   }   @Test
public void test1()
{
    HashMap<String,String> actual= new HashMap<String,String>();
    actual.put("val1","mars");
    actual.put("val2","satrun");
    HashMap<String,String> map= new HashMap<String,String>();
    map.put("val1"," ");
    map.put("val2","mars");
    assertEquals(map,keyValuePair.replace(actual));   }   @Test
public void fail()
{
    HashMap<String,String> actual= new HashMap<String,String>();
    actual.put("val1","java");
    actual.put("val2","c++");
    HashMap<String,String> map= new HashMap<String,String>();
    map.put("val1","c++");
    map.put("val2","java");
    assertNotEquals(map,keyValuePair.replace(actual));   }
}