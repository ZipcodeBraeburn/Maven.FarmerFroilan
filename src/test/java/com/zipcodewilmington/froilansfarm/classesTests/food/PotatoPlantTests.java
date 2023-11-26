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
        boolean hasBeenFertilized = true;
        boolean hasBeenHarvested = true;
        EdibleCrops potatoYield = potatoPlant.yield( hasBeenFertilized,  hasBeenHarvested);
        Assert.assertNotNull(potatoYield);
    }
    @Test
    public void testPotatoPlantYieldCrops2(){
        boolean hasBeenFertilized = false;
        boolean hasBeenHarvested = true;
        EdibleCrops tomatoYield = potatoPlant.yield( hasBeenFertilized,  hasBeenHarvested);
        Assert.assertNull(tomatoYield);
    }
    @Test
    public void testPotatoPlantYieldCrops3(){
        boolean hasBeenFertilized = true;
        boolean hasBeenHarvested = false;
        EdibleCrops potatoYield = potatoPlant.yield( hasBeenFertilized,  hasBeenHarvested);
        Assert.assertNull(potatoYield);
    }
    @Test
    public void testTomatoPlantYieldCrops4(){
        boolean hasBeenFertilized = false;
        boolean hasBeenHarvested = false;
        EdibleCrops potatoYield = potatoPlant.yield( hasBeenFertilized,  hasBeenHarvested);
        Assert.assertNull(potatoYield);
    }
    // test that it only produce one type (potato)
}
