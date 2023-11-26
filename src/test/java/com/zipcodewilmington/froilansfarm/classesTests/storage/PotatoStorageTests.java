package com.zipcodewilmington.froilansfarm.classesTests.storage;

import com.zipcodewilmington.froilansfarm.abstractClasses.EdibleStorage;
import com.zipcodewilmington.froilansfarm.classes.food.Potato;
import com.zipcodewilmington.froilansfarm.classes.storage.PotatoStorage;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PotatoStorageTests {

    @Test
    public void testPotatoStorageConstructor(){
        PotatoStorage potatoes = new PotatoStorage();
        Assert.assertNotNull(potatoes);
    }

    @Test
    public void testPotatoStorageExtendsEdibleStorageAndArrayList(){
        PotatoStorage potatoes = new PotatoStorage();

        Assert.assertTrue(ArrayList.class.isAssignableFrom(potatoes.getClass()));
        Assert.assertTrue(potatoes instanceof EdibleStorage);
    }

    @Test
    public void testPotatoStorageAdd(){
        PotatoStorage potatoes = new PotatoStorage();
        Potato potato = new Potato();

        Assert.assertTrue(potatoes.add(potato));
    }

    @Test
    public void testPotatoStorageRemove(){
        PotatoStorage potatoes = new PotatoStorage();
        Potato potato = new Potato();
        potatoes.add(potato);

        Assert.assertTrue(potatoes.remove(potato));
    }

    @Test
    public void testPotatoStorageSize(){
        PotatoStorage potatoes = new PotatoStorage();
        Potato potato = new Potato();
        potatoes.add(potato);

        Assert.assertEquals(1, potatoes.size());
    }

    @Test
    public void testPotatoStorageGet(){
        PotatoStorage potatoes = new PotatoStorage();
        Potato potato = new Potato();
        potatoes.add(potato);

        Assert.assertEquals(potato, potatoes.get(0));
    }
}
