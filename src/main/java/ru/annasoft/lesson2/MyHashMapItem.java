package ru.annasoft.lesson2;

public class MyHashMapItem {

    private Object key;
    private Object value;

    public MyHashMapItem(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public MyHashMapItem() {
        this.key = null;
        this.value = null;
    }

    @Override
    public String toString() {
        return "MyHashMapItem {" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public boolean isEmpty(){
        boolean result = false;
        if (this.key == null){
            result = true;
        }
        return result;
    }
}
