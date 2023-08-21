package ru.annasoft;

import ru.annasoft.lesson1.Lesson1;
import ru.annasoft.lesson2.MyHashMap;
import ru.annasoft.lesson2.MyHashMapItem;

public class Main {
    public static void main(String[] args) throws Exception {

        Lesson1 lesson1 = new Lesson1();
        lesson1.sayHello();

        MyHashMap myhashMap = new MyHashMap();
        myhashMap.add(1, 569);
        myhashMap.add(2, 584.5);

        for (MyHashMapItem item : myhashMap.getItems()) {
            System.out.println(item);
        }

        myhashMap.del(1);
        for (MyHashMapItem item : myhashMap.getItems()) {
            System.out.println(item);
        }

        myhashMap.update(2, 1000);
        for (MyHashMapItem item : myhashMap.getItems()) {
            System.out.println(item);
        }
        MyHashMapItem item = myhashMap.get(2);
        System.out.println(item);

        item = myhashMap.get(3);
        System.out.println(item);
        System.out.println(item.isEmpty());
    }
}