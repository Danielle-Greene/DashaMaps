package com.github.zipcodewilmington.mylinkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    public void addTest() {
        MyLinkedList mll = new MyLinkedList("brent");
        String expectedKey = "nigel";
        Integer expectedValue = 7;
        MyNode expected = new MyNode(expectedKey, expectedValue);

        mll.add(expectedKey, expectedValue);
        MyNode actual = mll.getHead().getNext();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest() {
        int expected = 1;
        MyLinkedList mll = new MyLinkedList("brent");
        mll.add("nigel", 7);

        int actual = mll.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest() {
        MyLinkedList mll = new MyLinkedList("brent");
        String expectedKey = "nigel";
        Integer expectedValue = 6;
        MyNode expected = new MyNode(expectedKey, expectedValue);
        mll.add(expectedKey, expectedValue);

        MyNode actual = mll.get(expectedKey);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeTest() {

        MyLinkedList mll = new MyLinkedList("brent");
        String expectedKey = "nigel";
        Integer expectedValue = 15;
        mll.add(expectedKey, expectedValue);

        Integer actualValue = mll.remove(expectedKey);

        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertEquals(true, mll.isEmpty());
    }

    @Test
    public void isEmptyTest() {
        MyLinkedList mll = new MyLinkedList("brent");
        boolean actual = mll.isEmpty();

        Assert.assertEquals(true, actual);
        
    }

    @Test
    public void isNotEmptyTest() {
        MyLinkedList mll = new MyLinkedList("brent");

        mll.add("nigel", 6);

        boolean actual = mll.isEmpty();

        Assert.assertEquals(false, actual);
    }

    }