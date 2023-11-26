package com.zipcodewilmington.froilansfarm.classesTests.food;

import com.zipcodewilmington.froilansfarm.classes.food.CornStalk;
import com.zipcodewilmington.froilansfarm.classes.food.EarCorn;
import com.zipcodewilmington.froilansfarm.interfaces.EdibleCrops;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CornStalkTests {

    // all plants check if fertilized make plant

    EarCorn earCorn;
    CornStalk cornStalk;
    @Before
    public void setup(){
        earCorn = new EarCorn();
        cornStalk = new CornStalk();

    }
    @Test
    public void testCornStalkPlant(){
        Assert.assertNotNull(cornStalk);
    }

    @Test
    public void testCornPlantYieldCrops1(){
        boolean hasBeenFertilized = true;
        boolean hasBeenHarvested = true;
        EdibleCrops tomatoYield = cornStalk.yield( hasBeenFertilized,  hasBeenHarvested);
        Assert.assertNotNull(tomatoYield);
    }
    @Test
    public void testCornPlantYieldCrops2(){
        boolean hasBeenFertilized = false;
        boolean hasBeenHarvested = true;
        EdibleCrops tomatoYield = cornStalk.yield( hasBeenFertilized,  hasBeenHarvested);
        Assert.assertNull(tomatoYield);
    }
    @Test
    public void testCornPlantYieldCrops3(){
        boolean hasBeenFertilized = true;
        boolean hasBeenHarvested = false;
        EdibleCrops tomatoYield = cornStalk.yield( hasBeenFertilized,  hasBeenHarvested);
        Assert.assertNull(tomatoYield);
    }
    @Test
    public void testCornStalkPlantYieldCrops4(){
        boolean hasBeenFertilized = false;
        boolean hasBeenHarvested = false;
        EdibleCrops tomatoYield = cornStalk.yield( hasBeenFertilized,  hasBeenHarvested);
        Assert.assertNull(tomatoYield);
    }

    // test that it only produce one type (corn ear)
}
