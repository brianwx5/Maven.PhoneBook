package com.zipcodewilmington.phonebook;


import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    TreeMap<String, String> treeMap = new TreeMap<String, String>();

    public void add(String name, String phoneNumber) {
        treeMap.put(name, phoneNumber);

    }

    public void removeRecord(String name) {
        treeMap.remove(name);
    }

    public String lookUp(String name) {
        String number = treeMap.get(name);
        return number;
    }

    public String reverseLookUp(String phoneNumber) {
        String name = "";
        for (String i: treeMap.keySet()) {
            if(treeMap.get(i) == phoneNumber) {
               return name += i;
            }
        } return name;
    }

    public void clear() {
        treeMap.clear();
    }


    public void display() {
    //This will give you a list of names
    Set<String> setOfNames = treeMap.keySet();

    for (String name : setOfNames) {
        System.out.println(name + " " + treeMap.get(name) +"/n");
    }
    }
}

//This model can only accept one value per key
//ANOTHER MODEL WILL BE ABLE TO ACCEPT MORE THAN ONE VALUE PER KEY