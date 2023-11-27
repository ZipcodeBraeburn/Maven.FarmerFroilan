package com.zipcodewilmington.froilansfarm.classesTests.food;

import com.zipcodewilmington.froilansfarm.classes.food.Tomato;
import com.zipcodewilmington.froilansfarm.classes.food.TomatoPlant;
import com.zipcodewilmington.froilansfarm.interfaces.EdibleCrops;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TomatoPlantTests {
    // all plants check if fertilized make plant

    Tomato tomato;
    TomatoPlant tomatoPlant;
    @Before
    public void setup(){
        tomato = new Tomato();
        tomatoPlant =new TomatoPlant();

    }
@Test
    public void testTomatoPlant(){
    Assert.assertNotNull(tomatoPlant);
}

@Test
 public void testTomatoPlantYieldCrops1(){
    tomatoPlant.setHasBeenHarvested(true);
    tomatoPlant.setHasBeenFertilized(true);
    EdibleCrops tomatoYield = tomatoPlant.yield();
        Assert.assertNotNull(tomatoYield);
}
    @Test
    public void testTomatoPlantYieldCrops2(){
        tomatoPlant.setHasBeenFertilized(false);
        tomatoPlant.setHasBeenHarvested(true);
        EdibleCrops tomatoYield = tomatoPlant.yield();
        Assert.assertNull(tomatoYield);
    }
    @Test
    public void testTomatoPlantYieldCrops3(){
        tomatoPlant.setHasBeenFertilized(true);
        tomatoPlant.setHasBeenHarvested(false);
        EdibleCrops tomatoYield = tomatoPlant.yield();
        Assert.assertNull(tomatoYield);
    }
    @Test
    public void testTomatoPlantYieldCrops4(){
        tomatoPlant.setHasBeenFertilized(false);
        tomatoPlant.setHasBeenHarvested(false);
        EdibleCrops tomatoYield = tomatoPlant.yield();
        Assert.assertNull(tomatoYield);
    }
    // test that it only produce one type (tomato)
}
