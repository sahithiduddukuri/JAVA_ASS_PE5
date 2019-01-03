package com.stackroute;


import java.util.*;

public class SortSet {

    Set<String> setSort(String[] strings){

        TreeSet<String> set=new TreeSet<String>();
        for (String str:strings) {
            set.add(str);
        }
        return set;

    }
    ArrayList<String> setSortArr(Set set){
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.addAll(set);
        return  arrayList;
    }

}