package com.zipcodewilmington.froilansfarm.classesTests;

import com.zipcodewilmington.froilansfarm.classes.Field;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class FieldTests {

    @Test
    public void testField(){
        Field jardin = new Field();
        assertNotNull(jardin);
    }
}
