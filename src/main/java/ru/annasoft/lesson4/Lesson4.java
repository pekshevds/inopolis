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

    static Field findFieldByName(Field[] fields, String fieldName){
        Field result = null;
        for (Field field: fields){
            if (field.getName() == fieldName){
                result = field;
                break;
            }
        }
        return  result;
    }

    static Object getDefaultValue(String type){
        switch (type){
            case "int":
            case "bite":
            case "short":
            case "long":
                return 0;
            case "float":
            case "double":
                return 0F;
            case "boolean":
                return false;
            default:
                return "";
        }
    }

    static void cleanField(Object object, Field field){

        for (Method declaredMethod: object.getClass().getDeclaredMethods()) {

            String methodName = declaredMethod.getName().toLowerCase();
            String fieldName = "set" + field.getName().toLowerCase();
            if(methodName.equals(fieldName)){
                try{
                    Object[] data = new Object[1];
                    data[0] = null;
                    if(field.getType().isPrimitive()){
                        data[0] = getDefaultValue(field.getType().getName());
                    }
                    declaredMethod.invoke(object, data);
                }catch (IllegalAccessException e1){
                    System.out.println("IllegalAccessException");
                }catch (IllegalArgumentException e2){
                    System.out.println("IllegalArgumentException");
                }catch (java.lang.reflect.InvocationTargetException e3){
                    System.out.println("java.lang.reflect.InvocationTargetException");
                }
            }
        }
    }

    static void cleanupFields(Object object, Field[] fields, List<String> fieldsToCleanup){
        for (String fieldName: fieldsToCleanup){
            Field field = findFieldByName(fields, fieldName);
            if (field != null){
                cleanField(object, field);
            }
        }
    }

    static void outputFields(Object object, Field[] fields, List<String> fieldsToOutput){
        for (Field field: fields){
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.getType().isPrimitive());
        }
    }
    static void cleanup(Object object, List<String> fieldsToCleanup, List<String> fieldsToOutput){

        Field[] fields = object.getClass().getDeclaredFields();

        cleanupFields(object, fields, fieldsToCleanup);
        /*outputFields(object, fields, fieldsToOutput);*/
    }
}
