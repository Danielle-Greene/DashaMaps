package com.github.zipcodewilmington.mylinkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyNodeTest {


    @Test
    public void setNextTest() {

        MyNode first = new MyNode("Danielle", 5);
        MyNode second = new MyNode("Carol", 7);

        first.setNext(second);

        Assert.assertEquals(second, first.getNext());
    }

    @Test
    public void testEquals() {

        MyNode node1 = new MyNode("Kris", 10);
        MyNode node2 = new MyNode("Kris", 10);
    }
}