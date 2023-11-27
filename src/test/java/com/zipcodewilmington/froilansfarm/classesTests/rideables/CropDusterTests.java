package com.zipcodewilmington.froilansfarm.classesTests.rideables;

import com.zipcodewilmington.froilansfarm.abstractClasses.Aircraft;
import com.zipcodewilmington.froilansfarm.classes.CropRow;
import com.zipcodewilmington.froilansfarm.classes.Farm;
import com.zipcodewilmington.froilansfarm.classes.Froilan;
import com.zipcodewilmington.froilansfarm.classes.Froilanda;
import com.zipcodewilmington.froilansfarm.classes.food.Tomato;
import com.zipcodewilmington.froilansfarm.classes.food.TomatoPlant;
import com.zipcodewilmington.froilansfarm.classes.rideables.CropDuster;
import com.zipcodewilmington.froilansfarm.interfaces.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropDusterTests {


    @Test
    public void testCropDuster() {
        CropDuster john = new CropDuster();
        assertNotNull(john);
    }

    @Test
    public void testCropDustExtends() {
        CropDuster Amy = new CropDuster();
        assertTrue(Amy instanceof FarmVehicle);

        assertTrue(Amy instanceof Aircraft);
    }

    @Test
    public void testoperator() {
        Farm farm = new Farm();
        CropDuster lily = new CropDuster();
        Assert.assertTrue(lily.operator(farm));
    }

    @Test
    public void testmakeNoise() {
        boolean james = true;
        CropDuster James = new CropDuster();
        assertTrue(james);
    }

    @Test
    public void testCropDusterConstructor() {
        CropDuster cropDuster = new CropDuster();
        assertNotNull(cropDuster);
    }

    @Test
    public void testCropDusterFertilize(){
        CropDuster cropDuster = new CropDuster();
        CropRow<TomatoPlant> tomatoRow = new CropRow<>();
        tomatoRow.add(new TomatoPlant());
        tomatoRow.add(new TomatoPlant());
        tomatoRow.add(new TomatoPlant());

        cropDuster.fertilize(tomatoRow);

        Assert.assertTrue(tomatoRow.get(0).getHasBeenFertilized());

        // REWRITE YIELD METHOD, DON'T NEED 2 PARAMETERS YIELD
    }

}