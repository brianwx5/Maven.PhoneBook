package com.zipcodewilmington.phonebook;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.TreeMap;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {

    @After
    public void tearDown() {
       PhoneBook phoneBook = new PhoneBook();
        phoneBook.clear();
    }

    @Test
    public void testAdd() {
        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Brian";
        String phoneNumber = "267-111-1121";

        //When
        phoneBook.add(name,phoneNumber);
        String actual = phoneBook.lookUp(name);

        //Then
        Assert.assertEquals(phoneNumber,actual);
    }


    @Test
    public void testRemoveRecord(){
        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Jim";
        String phoneNumber = "267-321-1121";

        //When
        phoneBook.add(name,phoneNumber);
        phoneBook.removeRecord(name);
        String actual = phoneBook.lookUp(name);

        //Then
        Assert.assertNull(actual);
    }


    @Test
    public void  testLookUp() {
        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Charlie";
        String phoneNumber = "267-511-0993";
        phoneBook.add(name,phoneNumber);

        //When

        String actual = phoneBook.lookUp(name);

        //Then
        Assert.assertEquals(phoneNumber, actual);
    }


    @Test
    public void testReverseLookUp() {
        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "David";
        String phoneNumber = "405-211-1121";

        //When
        phoneBook.add(name,phoneNumber);
        String actual = phoneBook.reverseLookUp(phoneNumber);

        //Then
        Assert.assertEquals(name,actual);
    }


    @Test
    public void display() {
        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Brian";
        String phoneNumber = "267-111-1121";
        String name2 = "Jim";
        String phoneNumber2 = "302-524-0475";


        //When
        phoneBook.display();

        //Then

    }


}
