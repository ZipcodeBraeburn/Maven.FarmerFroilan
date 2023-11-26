package com.zipcodewilmington.froilansfarm.classesTests.storage;

import com.zipcodewilmington.froilansfarm.abstractClasses.Housing;
import com.zipcodewilmington.froilansfarm.classes.food.Chicken;
import com.zipcodewilmington.froilansfarm.classes.storage.ChickenCoop;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ChickenCoopTests {
    @Test
    public void testChickenCoopConstructor(){
        ChickenCoop coop = new ChickenCoop();
        Assert.assertNotNull(coop);
    }

    @Test
    public void testChickenCoopExtendsHousingAndArrayList(){
        ChickenCoop coop = new ChickenCoop();

        Assert.assertTrue(ArrayList.class.isAssignableFrom(coop.getClass()));
        Assert.assertTrue(coop instanceof Housing);
    }

    @Test
    public void testChickenCoopAdd(){
        ChickenCoop coop = new ChickenCoop();
        Chicken chimkin = new Chicken();

        Assert.assertTrue(coop.add(chimkin));
    }

    @Test
    public void testChickenCoopRemove(){
        ChickenCoop coop = new ChickenCoop();
        Chicken chimkin = new Chicken();
        coop.add(chimkin);

        Assert.assertTrue(coop.remove(chimkin));
    }

    @Test
    public void testChickenCoopSize(){
        ChickenCoop coop = new ChickenCoop();
        Chicken chimkin = new Chicken();
        coop.add(chimkin);

        Assert.assertEquals(1, coop.size());
    }

    @Test
    public void testChickenCoopGet(){
        ChickenCoop coop = new ChickenCoop();
        Chicken chimkin = new Chicken();
        coop.add(chimkin);

        Assert.assertEquals(chimkin, coop.get(0));
    }

}
