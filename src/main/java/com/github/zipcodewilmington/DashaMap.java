package com.github.zipcodewilmington;

import com.github.zipcodewilmington.mylinkedlist.MyLinkedList;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public abstract class DashaMap implements HashMapX {

    private MyLinkedList[] dash;

    public DashaMap(){

        dash = new MyLinkedList[56];
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < dash.length; i++){
            dash[i] = new MyLinkedList("" + alphabet.charAt(i));
        }
    }

    @Override
    public void set(String key, String value) {

    }

    @Override
    public String delete(String key) {
        return null;
    }

    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public boolean isEmpty() {

        for(MyLinkedList mll : dash){
            if(!mll.isEmpty()){
                return false;
            }
        }
        return true;
    }

    @Override
    public long size() {

        long totalSize = 0;
        for(MyLinkedList mll : dash){
            totalSize += mll.size();
        }
        return totalSize;
    }

    @Override
    public boolean bucketSize(String key) {
        return false;
    }
}
