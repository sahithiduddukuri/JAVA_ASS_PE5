package com.stackroute;import java.util.HashMap;
import java.util.Map;public class KeyValuePair {
    public Map<String,String> replace(Map<String,String> actual)
    {
        if (actual.containsKey("val1") && actual.containsKey("val2"))
        {
            String s = actual.get("val1");
            actual.remove("val1");
            actual.put("val1", " ");
            actual.remove("val2");
            actual.put("val2", s);
            return actual;
        }
        else
            return null;
    }
}