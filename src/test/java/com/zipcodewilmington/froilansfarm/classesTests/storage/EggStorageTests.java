package com.zipcodewilmington.froilansfarm.classesTests.storage;

import com.zipcodewilmington.froilansfarm.abstractClasses.EdibleStorage;
import com.zipcodewilmington.froilansfarm.classes.food.EdibleEgg;
import com.zipcodewilmington.froilansfarm.classes.storage.EggStorage;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class EggStorageTests {

    @Test
    public void testEggStorageConstructor(){
        EggStorage eggs = new EggStorage();
        Assert.assertNotNull(eggs);
    }

    @Test
    public void testEggStorageExtendsEdibleStorageAndArrayList(){
        EggStorage eggs = new EggStorage();

        Assert.assertTrue(ArrayList.class.isAssignableFrom(eggs.getClass()));
        Assert.assertTrue(eggs instanceof EdibleStorage);
    }

    @Test
    public void testEggStorageAdd(){
        EggStorage eggs = new EggStorage();
        EdibleEgg egg = new EdibleEgg();

        Assert.assertTrue(eggs.add(egg));
    }

    @Test
    public void testEggStorageRemove(){
        EggStorage eggs = new EggStorage();
        EdibleEgg egg = new EdibleEgg();
        eggs.add(egg);

        Assert.assertTrue(eggs.remove(egg));
    }

    @Test
    public void testEggStorageSize(){
        EggStorage eggs = new EggStorage();
        EdibleEgg egg = new EdibleEgg();
        eggs.add(egg);

        Assert.assertEquals(1, eggs.size());
    }

    @Test
    public void testEggStorageGet(){
        EggStorage eggs = new EggStorage();
        EdibleEgg egg = new EdibleEgg();
        eggs.add(egg);

        Assert.assertEquals(egg, eggs.get(0));
    }
}

