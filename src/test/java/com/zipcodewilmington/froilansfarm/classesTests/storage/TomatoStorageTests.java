package com.zipcodewilmington.froilansfarm.classesTests.storage;

import com.zipcodewilmington.froilansfarm.abstractClasses.EdibleStorage;
import com.zipcodewilmington.froilansfarm.classes.food.Tomato;
import com.zipcodewilmington.froilansfarm.classes.storage.TomatoStorage;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TomatoStorageTests {
    @Test
    public void testTomatoStorageConstructor(){
        TomatoStorage tomatoes = new TomatoStorage();
        Assert.assertNotNull(tomatoes);
    }

    @Test
    public void testTomatoStorageExtendsEdibleStorageAndArrayList(){
        TomatoStorage tomatoes = new TomatoStorage();

        Assert.assertTrue(ArrayList.class.isAssignableFrom(tomatoes.getClass()));
        Assert.assertTrue(tomatoes instanceof EdibleStorage);
    }

    @Test
    public void testTomatoStorageAdd(){
        TomatoStorage tomatoes = new TomatoStorage();
        Tomato tomato = new Tomato();

        Assert.assertTrue(tomatoes.add(tomato));
    }

    @Test
    public void testTomatoStorageRemove(){
        TomatoStorage tomatoes = new TomatoStorage();
        Tomato tomato = new Tomato();
        tomatoes.add(tomato);

        Assert.assertTrue(tomatoes.remove(tomato));
    }

    @Test
    public void testTomatoStorageSize(){
        TomatoStorage tomatoes = new TomatoStorage();
        Tomato tomato = new Tomato();
        tomatoes.add(tomato);

        Assert.assertEquals(1, tomatoes.size());
    }

    @Test
    public void testTomatoStorageGet(){
        TomatoStorage tomatoes = new TomatoStorage();
        Tomato tomato = new Tomato();
        tomatoes.add(tomato);

        Assert.assertEquals(tomato, tomatoes.get(0));
    }
}
