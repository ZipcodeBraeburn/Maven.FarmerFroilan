package com.zipcodewilmington.froilansfarm.classesTests;

import com.zipcodewilmington.froilansfarm.classes.CropRow;
import com.zipcodewilmington.froilansfarm.classes.Field;
import com.zipcodewilmington.froilansfarm.classes.food.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class FieldTests {

    @Test
    public void testField(){
        Field jardin = new Field();
        assertNotNull(jardin);
    }

    @Test
    public void testFieldAdd(){
        Field field = new Field();
        CropRow<TomatoPlant> cropRow = new CropRow<>();

        Assert.assertTrue(field.add(cropRow));
    }
}
