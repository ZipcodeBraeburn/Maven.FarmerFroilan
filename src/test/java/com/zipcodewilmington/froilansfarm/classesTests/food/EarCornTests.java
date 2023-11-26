package com.zipcodewilmington.froilansfarm.classesTests.food;


import com.zipcodewilmington.froilansfarm.classes.food.EarCorn;
import com.zipcodewilmington.froilansfarm.classes.food.Potato;
import com.zipcodewilmington.froilansfarm.interfaces.EdibleCrops;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EarCornTests {
    EarCorn earCorn;

    @Before
    public void setup() {
        earCorn = new EarCorn();
    }

    @Test
    public void testPotato() {
        earCorn = new EarCorn();

        Assert.assertNotNull(earCorn);
    }

    // test it method

    @Test
    public void TestisEdible() { // test if edible
        // test if it can be eaten
        // call on tomato to see if the tomato is edible


        Assert.assertTrue(earCorn instanceof EdibleCrops);
    }
}