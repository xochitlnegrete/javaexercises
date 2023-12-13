package com.org.xochitl.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class PracticeLists {
    public static void main(String[] args) {

        System.out.println("LISTS-------");
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("Xochitl");
        arrayList.add("del");
        arrayList.add("Rocio");
        arrayList.add("Negrete");
        arrayList.add("Eufracio");

        linkedList.add("Xochitl");
        linkedList.add("del");
        linkedList.add("Rocio");
        linkedList.add("Negrete");
        linkedList.add("Eufracio");


        System.out.println("arrayList: \t\t" + arrayList);
        System.out.println("linkedList: \t" + linkedList);

        System.out.println("SETS-------");
        Set<String> hashSet = new HashSet<>(arrayList);
        Set<String> hashSet2 = new HashSet<>();

        hashSet2.add("Xochitl");
        hashSet2.add("del");
        hashSet2.add("Rocio");
        hashSet2.add("Negrete");
        hashSet2.add("Eufracio");

        System.out.println("hashSet: \t\t" + hashSet);
        System.out.println("hashSet2: \t\t" + hashSet2);

        arrayList.add("México");
        System.out.println("arrayList after adding new element: \t\t" + arrayList);
        System.out.println("hashSet: \t\t" + hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Xochitl");
        linkedHashSet.add("del");
        linkedHashSet.add("Rocio");
        linkedHashSet.add("Negrete");
        linkedHashSet.add("Eufracio");
        linkedHashSet.add("Eufracio");

        System.out.println("linkedHashSet: \t" + linkedHashSet);

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Xochitl");
        treeSet.add("del");
        treeSet.add("Rocio");
        treeSet.add("Negrete");
        treeSet.add("Eufracio");
        treeSet.add("Eufracio");

        System.out.println("treeSet: \t" + treeSet);

        System.out.println("MAPS-------");

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Xochitl", 27);
        hashMap.put("Rocio", 27);
        hashMap.put("", 28);
        hashMap.put("Roberto", 22);
        hashMap.put("Jose", 37);
        hashMap.put("Rodrigo", 23);//It doesn't add it but no error

        System.out.println("hashMap: \t\t" + hashMap);
        System.out.println("null hashMap: " +hashMap.get(""));

        Map<String, Integer> treeMap = new TreeMap<>();//Order alphabetically
        treeMap.put("Xochitl", 27);
        treeMap.put("Rocio", 27);
        treeMap.put("", 28);
        treeMap.put("Roberto", 22);
        treeMap.put("Jose", 37);
        treeMap.put("Rodrigo", 23);

        System.out.println("treeMap: \t\t" + treeMap);
        System.out.println("null treeMap: " +treeMap.get(""));


        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Xochitl", 27);
        hashtable.put("Rocio", 27);
        hashtable.put("", 28);
        hashtable.put("Roberto", 22);
        hashtable.put("Jose", 37);
        hashtable.put("Rodrigo", 23);

        System.out.println("hashtable: \t\t" + hashtable);
        System.out.println("null hashtable: " +hashtable.get(""));

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();//Order by insertion
        linkedHashMap.put("Xochitl", 27);
        linkedHashMap.put("Rocio", 27);
        linkedHashMap.put("", 28);
        linkedHashMap.put("Roberto", 22);
        linkedHashMap.put("Jose", 37);
        linkedHashMap.put("Rodrigo", 23);

        System.out.println("linkedHashMap: \t"+ linkedHashMap);
        System.out.println("null linkedHashMap: " +linkedHashMap.get(""));
    }


}
