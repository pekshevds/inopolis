package ru.annasoft.lesson3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class MyHashMapParamTest {

    private MyHashMapParam myHashMapParam;

    @Before
    public void setUp() throws Exception {
        this.myHashMapParam = new MyHashMapParam();
        myHashMapParam.put(1, "one");
        myHashMapParam.put(2, "two");
        myHashMapParam.put(3, "three");
    }

    @Test
    public void put_positive() throws Exception{

        boolean expected = true;
        boolean result = true;
        try {
            this.myHashMapParam.put(4, "some value");
        }catch (Exception e){
            result = false;
        }
        Assert.assertEquals(expected, result);
    }

    @Test
    public void put_negative() throws Exception{

        boolean expected = true;
        boolean result = true;
        try {
            this.myHashMapParam.put(1, "some value");
        }catch (Exception e){
            result = false;
        }
        Assert.assertEquals(expected, !result);
    }

    @Test
    public void remove_positive() {
        boolean expected = true;
        boolean result = true;
        try {
            this.myHashMapParam.remove(1);
        }catch (Exception e){
            result = false;
        }
        Assert.assertEquals(expected, result);
    }

    @Test
    public void remove_negative() {
        boolean expected = true;
        boolean result = true;
        try {
            this.myHashMapParam.remove(4);
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
            this.myHashMapParam.update(3, "some value");
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
            this.myHashMapParam.update(4, "some value");
        }catch (Exception e){
            result = false;
        }
        Assert.assertEquals(expected, !result);
    }

    @Test
    public void get_positive() {
        boolean expected = true;
        MyHashMapParamItem result = this.myHashMapParam.get(1);
        Assert.assertEquals(expected, !result.isEmpty());
    }

    @Test
    public void get_negative() {
        boolean expected = true;
        MyHashMapParamItem result = this.myHashMapParam.get(4);
        System.out.println(result);
        Assert.assertEquals(expected, result.isEmpty());
    }

    @Test
    public void getItems() {
        int expected = 3;
        Assert.assertEquals(expected, (int) this.myHashMapParam.getItems().size());
    }

}
