package ru.annasoft.lesson3;

import java.util.ArrayList;
import java.util.List;

import java.lang.Exception;

public class MyHashMapParam {
    private List<MyHashMapParamItem> items;

    public MyHashMapParam() {

        this.items = new ArrayList<MyHashMapParamItem>();
    }

    private MyHashMapParamItem findByKey(int key){

        MyHashMapParamItem result = new MyHashMapParamItem();
        for (MyHashMapParamItem item : this.items) {
            if (item.getKey() == key){
                result = item;
                break;
            }
        }
        return result;
    }

    public void put(int key, String value) throws Exception{
        MyHashMapParamItem item = findByKey(key);
        if (item.getKey() < 0){
            MyHashMapParamItem newItem = new MyHashMapParamItem(key, value);
            this.items.add(newItem);
        } else{
            throw new Exception("Adding isn't possible. Item with key="+ key +" is already exist.");
        }
    }

    public void remove(int key) throws Exception{
        MyHashMapParamItem item = findByKey(key);
        if (item.getKey() >= 0 ){
            this.items.remove(item);
        } else {
            throw new Exception("Deleting isn't possible. Item with key="+ key +" is doesn't exist.");
        }
    }

    public void update(int key, String value) throws Exception{
        MyHashMapParamItem item = findByKey(key);
        if (item.getKey() >= 0){
            item.setValue(value);
        }else {
            throw new Exception("Updating isn't possible. Item with key="+ key +" is doesn't exist.");
        }
    }

    public MyHashMapParamItem get(int key){
        return this.findByKey(key);
    }

    public List<MyHashMapParamItem> getItems() {
        return items;
    }
}