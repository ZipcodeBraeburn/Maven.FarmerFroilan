package com.zipcodewilmington.froilansfarm.classesTests;

import com.zipcodewilmington.froilansfarm.classes.CropRow;
import com.zipcodewilmington.froilansfarm.classes.food.TomatoPlant;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CropRowTests {
    CropRow<TomatoPlant> tomatoCropRow;
    TomatoPlant tomatoPlant;

@Before
public void setup(){
    tomatoCropRow = new CropRow<>();
    tomatoPlant = new TomatoPlant();
}

    @Test
    public void testCropRow (){
        CropRow tomato = new CropRow();
        assertNotNull(tomato);
    }
    @Test
    public void getTest(){
    // if adding  tomato plant to a croprow im get
        // back a tomato plant
        tomatoCropRow.add(tomatoPlant);
      TomatoPlant actual = tomatoCropRow.get(0);
        Assert.assertEquals(actual, tomatoPlant);

    }

}
