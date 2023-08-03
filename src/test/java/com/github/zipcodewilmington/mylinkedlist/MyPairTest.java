package com.github.zipcodewilmington.mylinkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPairTest {

    @Test
    public void testSetKey() {

        String expectedKey = "fun";
        MyPair pair = new MyPair("no", 3);

        pair.setKey(expectedKey);

        String actualKey = pair.getKey();

        Assert.assertEquals(expectedKey, actualKey);
    }

    @Test
    public void GetValue() {

        Integer expectedValue = 21;
        MyPair pair = new MyPair("no", 3);

        pair.setValue(expectedValue);

        Integer actualKey = pair.getValue();

        Assert.assertEquals(expectedValue, actualKey);
    }

    @Test
    public void testEquals() {

        MyPair mp1 = new MyPair("dog", 5);
        MyPair mp2 = new MyPair("dog", 5);
    }
}