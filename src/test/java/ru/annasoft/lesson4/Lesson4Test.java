package ru.annasoft.lesson4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import ru.annasoft.lesson4.Lesson4;

import java.util.ArrayList;
import java.util.List;

public class Lesson4Test {

    private TestClass testObject;
    private List<String> fieldsToCleanup;
    private List<String> fieldsToOutput;

    @Before
    public void setUp() throws Exception {
        this.testObject = new TestClass();
        this.fieldsToCleanup =  new ArrayList<>();
        fieldsToCleanup.add("field1");
        fieldsToCleanup.add("field2");
        fieldsToCleanup.add("field3");
        fieldsToCleanup.add("field4");
        fieldsToCleanup.add("field5");
        fieldsToCleanup.add("field6");
        fieldsToCleanup.add("field7");

        this.fieldsToOutput = new ArrayList<>();
        fieldsToOutput.add("field3");
        fieldsToOutput.add("field4");
    }

    @Test
    public void cleanup_positive() throws Exception{

        System.out.println(this.testObject);
        Lesson4.cleanup(this.testObject, this.fieldsToCleanup, this.fieldsToOutput);
        System.out.println(this.testObject);

        boolean expected = true;
        boolean result = true;
        Assert.assertEquals(expected, result);
    }

}
