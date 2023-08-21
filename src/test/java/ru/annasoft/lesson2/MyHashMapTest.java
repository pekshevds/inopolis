package ru.annasoft.lesson2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class MyHashMapTest {

    private MyHashMap myHashMap;

    @Before
    public void setUp() throws Exception {
        this.myHashMap = new MyHashMap();
        myHashMap.add(1, "one");
        myHashMap.add(2, "two");
        myHashMap.add(3, "three");
    }

    @Test
    public void add_positive() throws Exception{

        boolean expected = true;
        boolean result = true;
        try {
            this.myHashMap.add(4, "some value");
        }catch (Exception e){
            result = false;
        }
        Assert.assertEquals(expected, result);
    }

    @Test
    public void add_negative() throws Exception{

        boolean expected = true;
        boolean result = true;
        try {
            this.myHashMap.add(1, "some value");
        }catch (Exception e){
            result = false;
        }
        Assert.assertEquals(expected, !result);
    }

    @Test
    public void del_positive() {
        boolean expected = true;
        boolean result = true;
        try {
            this.myHashMap.del(1);
        }catch (Exception e){
            result = false;
        }
        Assert.assertEquals(expected, result);
    }

    @Test
    public void del_negative() {
        boolean expected = true;
        boolean result = true;
        try {
            this.myHashMap.del(4);
        }catch (Exception e){
            result = false;
        }
        Assert.assertEquals(expected, !result);
    }

    @Test
    public void update_positive() {
        boolean expected = true;
        boolean result = true;
        try {
            this.myHashMap.update(3, "some value");
        }catch (Exception e){
            result = false;
        }
        Assert.assertEquals(expected, result);
    }

    @Test
    public void update_negative() {
        boolean expected = true;
        boolean result = true;
        try {
            this.myHashMap.update(4, "some value");
        }catch (Exception e){
            result = false;
        }
        Assert.assertEquals(expected, !result);
    }

    @Test
    public void get_positive() {
        boolean expected = true;
        MyHashMapItem result = this.myHashMap.get(1);
        Assert.assertEquals(expected, !result.isEmpty());
    }

    @Test
    public void get_negative() {
        boolean expected = true;
        MyHashMapItem result = this.myHashMap.get(4);
        Assert.assertEquals(expected, result.isEmpty());
    }

    @Test
    public void getItems() {
        int expected = 3;
        Assert.assertEquals(expected, (int) this.myHashMap.getItems().size());
    }
}