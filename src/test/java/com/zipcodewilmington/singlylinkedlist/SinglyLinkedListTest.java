package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
//    @Before
//    public void setUp() {
//        SinglyLinkedList singly = new SinglyLinkedList();
//    }

//    add -- add an element to the list
    @Test
    public void addTest() {
        SinglyLinkedList singly = new SinglyLinkedList();

        Integer expectedValue = 14;

        Integer actualValue = singly.add(expectedValue);

        Assert.assertEquals(expectedValue,actualValue);
    }
}
