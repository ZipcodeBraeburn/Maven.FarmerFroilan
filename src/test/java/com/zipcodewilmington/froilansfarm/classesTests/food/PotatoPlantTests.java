package com.zipcodewilmington.froilansfarm.classesTests.food;

import com.zipcodewilmington.froilansfarm.classes.food.Potato;
import com.zipcodewilmington.froilansfarm.classes.food.PotatoPlant;
import com.zipcodewilmington.froilansfarm.interfaces.EdibleCrops;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PotatoPlantTests {
    // all plants check if fertilized make plant
    Potato potato;
    PotatoPlant potatoPlant;
    @Before
    public void setup(){
        potato = new Potato();
        potatoPlant = new PotatoPlant();

    }
    @Test
    public void testPotatoPlant(){
        Assert.assertNotNull(potatoPlant);
    }

    @Test
    public void testPotatoPlantYieldCrops1(){
        potatoPlant.setHasBeenHarvested(true);
        potatoPlant.setHasBeenFertilized(true);
        EdibleCrops potatoYield = potatoPlant.yield();
        Assert.assertNotNull(potatoYield);
    }
    @Test
    public void testPotatoPlantYieldCrops2(){
        potatoPlant.setHasBeenHarvested(true);
        potatoPlant.setHasBeenFertilized(false);
        EdibleCrops potatoYield = potatoPlant.yield();
        Assert.assertNull(potatoYield);
    }
    @Test
    public void testPotatoPlantYieldCrops3(){
        potatoPlant.setHasBeenHarvested(false);
        potatoPlant.setHasBeenFertilized(true);
        EdibleCrops potatoYield = potatoPlant.yield();
        Assert.assertNull(potatoYield);
    }
    @Test
    public void testTomatoPlantYieldCrops4(){
        potatoPlant.setHasBeenHarvested(false);
        potatoPlant.setHasBeenFertilized(false);
        EdibleCrops potatoYield = potatoPlant.yield();
        Assert.assertNull(potatoYield);
    }
    // test that it only produce one type (potato)
}
