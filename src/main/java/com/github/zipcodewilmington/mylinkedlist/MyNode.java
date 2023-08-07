package com.github.zipcodewilmington.mylinkedlist;

import java.util.Objects;

public class MyNode {

    MyPair data;

    MyNode next;
    private MyNode head;

    public MyNode(String key, Integer value){
      data = new MyPair(key, value);
      next = null;
  }

    public MyPair getData() {
        return data;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public Integer remove(String key){
      MyNode previousNode = head;
      MyNode currentNode = head.getNext();

      while(currentNode != null && !currentNode.getData().getKey().equals(key)){
          previousNode = currentNode;
          currentNode = currentNode.getNext();
      }
      if(currentNode == null){
          return null;
      }

      previousNode.setNext(currentNode.getNext());
      return currentNode.getData().getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyNode myNode = (MyNode) o;
        return Objects.equals(data, myNode.data) && Objects.equals(next, myNode.next);
    }
}
