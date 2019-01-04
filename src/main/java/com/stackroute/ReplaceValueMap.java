package com.stackroute;

import  java.util.Map;

public class ReplaceValueMap {

    Map<String,String> replaceValue(Map<String,String> map){

        if (map.containsKey("val1") && map.containsKey("val2")) {
            String s = map.get("val1");
            map.remove("val1");
            map.put("val1", " ");
            map.remove("val2");
            map.put("val2", s);
            return map;
        } else
            return null;
    }
}