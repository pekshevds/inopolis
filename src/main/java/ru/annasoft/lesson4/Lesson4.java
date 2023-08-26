package ru.annasoft.lesson4;

/*
Домашнее задание 4
Необходимо реализовать метод void cleanup(Object object, Set<String> fieldsToCleanup, Set<String> fieldsToOutput),
принимающий любой объект и две коллекции строк. В объекте, посредством reflection надо поля,
перечисленные в fieldsToClenup установить в значение null, или, если поля примитивных типов в их значение по умолчанию.
Поля, перечисленные в fieldsToOutput сконвертировать в строку (вызвав toString у объектов, или String.valueOf для примитивных типов)
и вывести результат преобразования в консоль. Если переданный первым параметром объект является реализацией интерфейса Map,
то проделать аналогичные операции - для списка fieldsToCleanup удалить ключи из мапы, для fieldsToOutput вывести в консоль значения,
хранящиеся в мапе. При отсутствии в объекте/мапе нузных полей/ключей - падать с IllegalArgumentException, оставив объект неизменным.
*/

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Lesson4 {

    static void cleanField(Object object, Field field) throws Exception{
        Class<?> type = field.getType();
        if (type.isPrimitive()){
            if (type.equals(byte.class) || type.equals(int.class)) {
                field.set(object, 0);
            } else if (type.equals(float.class) || type.equals(double.class)) {
                field.set(object, 0F);
            } else if (type.equals(boolean.class)) {
                field.set(object, false);
            }
        }else{
            field.set(object, null);
        }
    }

    static void cleanupFields(Object object, List<String> fieldsToCleanup) throws Exception {
        for (String fieldName: fieldsToCleanup){
            Class c = object.getClass();
            Field field = c.getDeclaredField(fieldName);
            cleanField(object, field);
        }
    }

    static void outputFields(Object object, Field[] fields, List<String> fieldsToOutput){
        for (Field field: fields){
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.getType().isPrimitive());
        }
    }
    static void cleanup(Object object, List<String> fieldsToCleanup, List<String> fieldsToOutput) throws Exception{

        cleanupFields(object, fieldsToCleanup);
        /*outputFields(object, fields, fieldsToOutput);*/
    }
}
