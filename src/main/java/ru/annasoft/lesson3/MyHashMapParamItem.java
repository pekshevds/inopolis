package ru.annasoft.lesson3;

public class MyHashMapParamItem {

    private int key;
    private String value;

    public MyHashMapParamItem(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public MyHashMapParamItem() {
        this.key = -1;
        this.value = "";
    }

    @Override
    public String toString() {
        return "MyHasMapParamItem {" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isEmpty(){
        boolean result = false;
        if (this.key < 0){
            result = true;
        }
        return result;
    }
}
