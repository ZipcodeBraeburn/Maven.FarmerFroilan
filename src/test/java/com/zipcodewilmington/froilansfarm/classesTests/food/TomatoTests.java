package com.zipcodewilmington.froilansfarm.classesTests.food;

import com.zipcodewilmington.froilansfarm.classes.food.Potato;
import com.zipcodewilmington.froilansfarm.classes.food.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.EdibleCrops;
import org.junit.Assert;
import org.junit.Test;

public class TomatoTests {
    // constructor
    @Test
    public void testTomato(){
        Tomato tomato = new Tomato();

        Assert.assertNotNull(tomato);
    }


    // test it method

    @Test
    public void TestisTomatoEdible(){ // test if edible
        // test if it can be eaten
        // call on tomato to see if the tomato is edible
        Tomato tomato = new Tomato();

        Assert.assertTrue(tomato instanceof EdibleCrops);
    }

}
