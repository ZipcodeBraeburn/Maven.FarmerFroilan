package com.zipcodewilmington.froilansfarm.classesTests;

import com.zipcodewilmington.froilansfarm.classes.food.CornStalk;
import com.zipcodewilmington.froilansfarm.classes.food.PotatoPlant;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.classes.CropRow;
import com.zipcodewilmington.froilansfarm.classes.Farmer;
import com.zipcodewilmington.froilansfarm.classes.food.TomatoPlant;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    @Test
    public void testFarmer() {
        Farmer jean = new Farmer();
        assertNotNull(jean);

    }

    @Test
    public void testFarmerExtends() {
        Farmer luke = new Farmer();
        assertTrue(luke instanceof Botanist);
        assertTrue(luke instanceof Rider);

    }

    @Test
    public void testplant(){
        Farmer luis = new Farmer();
        TomatoPlant laura = new TomatoPlant();
        CropRow julius = new CropRow();
        assertEquals(true, luis.plant( laura,julius ));

    }

    @Test
    public void testFarmerPlant(){
        Farmer farmer = new Farmer();
        TomatoPlant tomatoPlant = new TomatoPlant();
        CropRow<TomatoPlant> cropRow = new CropRow<>();

        Assert.assertTrue(farmer.plant(tomatoPlant, cropRow));
    }

    @Test
    public void testFarmerPlantCorn(){
        Farmer farmer = new Farmer();
        CornStalk cornStalk = new CornStalk();
        CropRow<CornStalk> cropRow = new CropRow<>();

        Assert.assertTrue(farmer.plant(cornStalk, cropRow));
    }

    @Test
    public void testFarmerPlantPotato(){
        Farmer farmer = new Farmer();
        PotatoPlant potatoPlant = new PotatoPlant();
        CropRow<PotatoPlant> cropRow = new CropRow<>();

        Assert.assertTrue(farmer.plant(potatoPlant, cropRow));
    }




}