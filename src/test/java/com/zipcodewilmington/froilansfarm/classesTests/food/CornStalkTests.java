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
        cornStalk.setHasBeenFertilized(true);
        cornStalk.setHasBeenHarvested(true);
        EdibleCrops tomatoYield = cornStalk.yield();
        Assert.assertNotNull(tomatoYield);
    }
    @Test
    public void testCornPlantYieldCrops2(){
        cornStalk.setHasBeenFertilized(false);
        cornStalk.setHasBeenHarvested(true);
        EdibleCrops tomatoYield = cornStalk.yield();
        Assert.assertNull(tomatoYield);
    }
    @Test
    public void testCornPlantYieldCrops3(){
        cornStalk.setHasBeenFertilized(true);
        cornStalk.setHasBeenHarvested(false);
        EdibleCrops tomatoYield = cornStalk.yield();
        Assert.assertNull(tomatoYield);
    }
    @Test
    public void testCornStalkPlantYieldCrops4(){
        cornStalk.setHasBeenFertilized(false);
        cornStalk.setHasBeenHarvested(false);
        EdibleCrops tomatoYield = cornStalk.yield();
        Assert.assertNull(tomatoYield);
    }

    // test that it only produce one type (corn ear)
}
