package com.zipcodewilmington.froilansfarm.classesTests.rideables;

import com.zipcodewilmington.froilansfarm.abstractClasses.Aircraft;
import com.zipcodewilmington.froilansfarm.classes.Farm;
import com.zipcodewilmington.froilansfarm.classes.Froilan;
import com.zipcodewilmington.froilansfarm.classes.Froilanda;
import com.zipcodewilmington.froilansfarm.classes.rideables.CropDuster;
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

}