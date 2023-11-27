package com.zipcodewilmington.froilansfarm.classesTests.rideables;

import com.zipcodewilmington.froilansfarm.classes.CropRow;
import com.zipcodewilmington.froilansfarm.classes.Farm;
import com.zipcodewilmington.froilansfarm.classes.Froilan;
import com.zipcodewilmington.froilansfarm.classes.food.Tomato;
import com.zipcodewilmington.froilansfarm.classes.food.TomatoPlant;
import com.zipcodewilmington.froilansfarm.classes.rideables.Tractor;
import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TractorTests {
    Froilan froilan;
    Tractor tractor;
    CropRow cropRow;
    TomatoPlant tomatoPlant;
@Before
public void setup(){
    tractor = new Tractor();
    froilan = new Froilan();
    cropRow = new CropRow();
    tomatoPlant = new TomatoPlant();
}
    @Test
    public void testTractor(){
        Tractor cropRowTractor = new Tractor();
        assertNotNull(cropRowTractor);

    }

    @Test
    public void testFarmVehicleExtends (){
        Tractor gardenTractors = new Tractor();
        assertTrue(gardenTractors instanceof Vehicle);

    }

    @Test
    public void testoperator(){
        Farm farm = new Farm();
        Tractor kubato = new Tractor();
        assertTrue(kubato.operator(farm));

    }
    @Test
    public void TestIfMountTractorAble(){
    Assert.assertTrue(froilan.mount(tractor));
    }

    @Test
    public void TestIfDisMountTractor(){
    froilan.mount(tractor);
    Assert.assertTrue(froilan.dismount(tractor));
    }

    @Test
    public void TestTractorSound(){
    String actual = tractor.makeNoise();
    String expected = "RrrooMMMMM";
    Assert.assertSame(actual,expected);
    }

    @Test
    public void TestIfCropHasBeenHarvested(){
        // if cropRow have fruit count fruit per crop in row.array list
        cropRow.add(tomatoPlant);
        cropRow.add(tomatoPlant);
        cropRow.add(tomatoPlant);

       int actual = tractor.harvestCrop(cropRow);
       int expected = 3;
       Assert.assertEquals(actual,expected);

    }
}

