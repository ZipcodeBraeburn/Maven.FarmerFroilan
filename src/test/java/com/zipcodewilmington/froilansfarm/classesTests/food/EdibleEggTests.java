package com.zipcodewilmington.froilansfarm.classesTests.food;

import com.zipcodewilmington.froilansfarm.classes.food.EdibleEgg;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EdibleEggTests {
    EdibleEgg edibleEgg;
    @Before
    public void setup(){
        edibleEgg = new EdibleEgg();

    }

    @Test
    public void TestEdibleEgg(){
        Assert.assertNotNull(edibleEgg);
    }
    // test if edible
    @Test
    public void TestisEdible(){

        Assert.assertTrue(edibleEgg instanceof Edible);
    }


}
