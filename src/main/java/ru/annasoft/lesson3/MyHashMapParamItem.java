package ru.annasoft.lesson3;

public class MyHashMapParamItem {

    private Integer key;
    private String value;

    public MyHashMapParamItem(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public MyHashMapParamItem() {
        this.key = null;
        this.value = null;
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

    public void setKey(Integer key) {
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
        if (this.key == null){
            result = true;
        }
        return result;
    }
}
