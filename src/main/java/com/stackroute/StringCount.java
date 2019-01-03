package com.stackroute;


import java.util.HashMap;
import java.util.Map;

public class StringCount {
    public Map<String, Boolean> stringCount(String[] string) {
        Map<String, Boolean> map = new HashMap<>();
        boolean boolVal;
        for (String s : string) {

            if (!map.containsKey(s)) {
                boolVal = false;
                map.put(s, boolVal);
            } else {
                boolVal = true;
                map.put(s, boolVal);
            }
        }
        return map;
    }
}