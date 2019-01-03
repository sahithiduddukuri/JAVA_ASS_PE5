package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountOccurence {

    HashMap<String,Integer> countOccurence(String string) {

        String[] wordsArray = string.split("\\s+|-+|\\?+|,+|\\*|_+|@+");
        int count;
        ArrayList<String> arr=new ArrayList<>();
        arr.addAll(Arrays.asList(wordsArray));
        arr.removeAll(Arrays.asList(""));

        HashMap<String, Integer> map = new HashMap<>();
        for (String word : arr) {

            if (map.containsKey(word)) {
                count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet())
            hashMap.put(entry.getKey(), entry.getValue());

        return hashMap;
    }



}