package com.zipcodewilmington.froilansfarm.classesTests.food;

import com.zipcodewilmington.froilansfarm.classes.food.Potato;

import com.zipcodewilmington.froilansfarm.interfaces.EdibleCrops;
import org.junit.Assert;
import org.junit.Test;

public class PotatoTests {
    @Test
    public void testPotato(){
        Potato potato = new Potato();

        Assert.assertNotNull(potato);
    }

    // test it method

    @Test
    public void TestisPotatoEdible(){ // test if edible
        // test if it can be eaten
        // call on tomato to see if the tomato is edible
        Potato potato = new Potato();

        Assert.assertTrue(potato instanceof EdibleCrops);
    }



}

