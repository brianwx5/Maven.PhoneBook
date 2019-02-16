package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PhoneBook2Test {

    @Test
    public void testAdd2() {
        //Given
        PhoneBook2 phoneBook = new PhoneBook2();
        String name = "Brian";
        String phoneNumber = "267-111-1121";
        String phoneNumber2 = "302-111-1121";
        String phoneNumber3 = "233-342-3654";
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(phoneNumber);
        arr.add(phoneNumber2);
        //When
        phoneBook.addEntry(name,arr);
        phoneBook.add(name,phoneNumber3);
        ArrayList<String> actual = phoneBook.lookUp(name);

        //Then
        Assert.assertTrue(actual.contains(phoneNumber3));
    }


    @Test
    public void testAddEntry2() {
        //Given
        PhoneBook2 phoneBook = new PhoneBook2();
        String name = "Brian";
        String phoneNumber = "267-111-1121";
        String phoneNumber2 = "302-111-1121";
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(phoneNumber);
        arr.add(phoneNumber2);
        //When
        phoneBook.addEntry(name,arr);
        ArrayList<String> actual = phoneBook.lookUp(name);

        //Then
        Assert.assertEquals(arr,actual);
    }

    @Test
    public void removeRecord() {
        //Given
        PhoneBook2 phoneBook = new PhoneBook2();
        ArrayList<String> arr = new ArrayList<String>();
        String name = "Charlie";
        String phoneNumber = "267-213-2313";
        arr.add(phoneNumber);

        //When
        phoneBook.add(name, phoneNumber);
        phoneBook.removeRecord(name);
        ArrayList<String> actual = phoneBook.lookUp(name);

        //Then
        Assert.assertNull(actual);

    }

    @Test
    public void removeNumber() {
        //Given
        PhoneBook2 phoneBook = new PhoneBook2();
        ArrayList<String> arr = new ArrayList<String>();
        String name = "Brian";
        String phoneNumber = "267-555-2562";
        String phoneNumber2 = "215-222-1243";
        arr.add(phoneNumber);
        arr.add(phoneNumber2);
        phoneBook.addEntry(name, arr);


        //When
        phoneBook.removeNumber(name, phoneNumber);


        //Then
        Assert.assertEquals(1, phoneBook.lookUp(name).size());
    }

    @Test
    public void lookUp() {
        //Given
        PhoneBook2 phoneBook = new PhoneBook2();
        ArrayList<String> arr = new ArrayList<String>();
        String name = "Charlie";
        String phoneNumber = "267-511-0993";
        String phoneNumber2 = "254-644-7523";
        arr.add(phoneNumber);
        arr.add(phoneNumber2);
        phoneBook.addEntry(name,arr);

        //When

        ArrayList<String> actual = phoneBook.lookUp(name);

        //Then
        Assert.assertEquals(arr, actual);
    }

    @Test
    public void reverseLookUp() {
        //Given
        PhoneBook2 phoneBook = new PhoneBook2();
        ArrayList<String> arr = new ArrayList<String>();
        String name = "Charlie";
        String phoneNumber = "267-511-0993";
        String phoneNumber2 = "254-644-7523";
        arr.add(phoneNumber);
        arr.add(phoneNumber2);
        phoneBook.addEntry(name,arr);

        //When
        String actual = phoneBook.reverseLookUp(phoneNumber);

        //Then
        Assert.assertEquals(name,actual);


    }

    @Test
    public void display() {
        //Given
        PhoneBook2 phoneBook = new PhoneBook2();
        ArrayList<String> arr = new ArrayList<String>();
        String name = "Charlie";
        String phoneNumber = "267-511-0993";
        String phoneNumber2 = "254-644-7523";
        arr.add(phoneNumber);
        arr.add(phoneNumber2);
        phoneBook.addEntry(name,arr);


        //When
        phoneBook.display();


    }
}