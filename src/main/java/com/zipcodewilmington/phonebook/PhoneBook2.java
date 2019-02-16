package com.zipcodewilmington.phonebook;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook2 {
    TreeMap<String, ArrayList<String>> contacts = new TreeMap<>();
    ArrayList<String> phoneNumber = new ArrayList<>();

    public void add(String name, String cellNumber) {
        for(Map.Entry<String, ArrayList<String>> each: contacts.entrySet()){
            if(each.getKey().equals(name)){
                each.getValue().add(cellNumber);
            }
        }
    }

    public void addEntry(String name, ArrayList<String> phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public void removeRecord(String name) {
        contacts.remove(name);
    }

    public void removeNumber(String name,String cellNumber) {
        for (Map.Entry<String, ArrayList<String>> each : contacts.entrySet()) {
            if (each.getKey().equals(name)) {
                each.getValue().remove(cellNumber);
            }
        }
    }

    public ArrayList<String> lookUp(String name) {
        return contacts.get(name);
    }

    public String reverseLookUp(String phoneNumber2) {
        for(Map.Entry<String,ArrayList<String>> number: contacts.entrySet()) {
            ArrayList<String > phoneNumber = number.getValue();
            for(String p: phoneNumber ) {
                if(p.equals(phoneNumber2)) {
                    return number.getKey();
                }
            }
        } return null;
    }


    public void clear() {
        contacts.clear();
    }


    public void display() {
        //This will give you a list of names
        Set<String> setOfNames = contacts.keySet();

        for (String name : setOfNames) {
            System.out.println(name + " " + contacts.get(name) +"\n");
        }
    }
}

