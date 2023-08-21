package ru.annasoft.lesson2;

import java.util.ArrayList;
import java.util.List;

import java.lang.Exception;

public class MyHashMap {

    private List<MyHashMapItem> items;

    public MyHashMap() {

        this.items = new ArrayList<MyHashMapItem>();
    }

    private MyHashMapItem findByKey(Object key){

        MyHashMapItem result = new MyHashMapItem();
        for (MyHashMapItem item : this.items) {
            if (item.getKey() == key){
                result = item;
                break;
            }
        }
        return result;
    }

    public void put(Object key, Object value) throws Exception{
        MyHashMapItem item = findByKey(key);
        if (item.getKey() == null){
            MyHashMapItem newItem = new MyHashMapItem(key, value);
            this.items.add(newItem);
        } else{
            throw new Exception("Adding isn't possible. Item with key="+ key +" is already exist.");
        }
    }

    public void remove(Object key) throws Exception{
        MyHashMapItem item = findByKey(key);
        if (item.getKey() != null){
            this.items.remove(item);
        } else {
            throw new Exception("Deleting isn't possible. Item with key="+ key +" is doesn't exist.");
        }
    }

    public void update(Object key, Object value) throws Exception{
        MyHashMapItem item = findByKey(key);
        if (item.getKey() != null){
            item.setValue(value);
        }else {
            throw new Exception("Updating isn't possible. Item with key="+ key +" is doesn't exist.");
        }
    }

    public MyHashMapItem get(Object key){
        return this.findByKey(key);
    }

    public List<MyHashMapItem> getItems() {
        return items;
    }
}
