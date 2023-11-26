package com.zipcodewilmington.froilansfarm.classesTests.storage;

import com.zipcodewilmington.froilansfarm.abstractClasses.EdibleStorage;
import com.zipcodewilmington.froilansfarm.classes.food.EarCorn;
import com.zipcodewilmington.froilansfarm.classes.storage.CornStorage;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CornStorageTests {

    @Test
    public void testCornStorageConstructor(){
        CornStorage corns = new CornStorage();
        Assert.assertNotNull(corns);
    }

    @Test
    public void testCornStorageExtendsEdibleStorageAndArray(){
        CornStorage corns = new CornStorage();

        Assert.assertTrue(ArrayList.class.isAssignableFrom(corns.getClass()));
        Assert.assertTrue(corns instanceof EdibleStorage);
    }

    @Test
    public void testCornStorageAdd(){
        CornStorage corns = new CornStorage();
        EarCorn corn = new EarCorn();

        Assert.assertTrue(corns.add(corn));
    }

    @Test
    public void testCornStorageRemove(){
        CornStorage corns = new CornStorage();
        EarCorn corn = new EarCorn();
        corns.add(corn);

        Assert.assertTrue(corns.remove(corn));
    }

    @Test
    public void testCornStorageSize(){
        CornStorage corns = new CornStorage();
        EarCorn corn = new EarCorn();
        corns.add(corn);

        Assert.assertEquals(1, corns.size());
    }

    @Test
    public void testCornStorageGet(){
        CornStorage corns = new CornStorage();
        EarCorn corn = new EarCorn();
        corns.add(corn);

        Assert.assertEquals(corn, corns.get(0));
    }
}
