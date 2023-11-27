package com.zipcodewilmington.froilansfarm.weekTests;

import com.zipcodewilmington.froilansfarm.classes.*;
import com.zipcodewilmington.froilansfarm.classes.food.*;
import com.zipcodewilmington.froilansfarm.classes.rideables.CropDuster;
import com.zipcodewilmington.froilansfarm.classes.rideables.Horse;
import com.zipcodewilmington.froilansfarm.classes.rideables.Tractor;
import com.zipcodewilmington.froilansfarm.classes.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.classes.storage.FarmHouse;
import com.zipcodewilmington.froilansfarm.classes.storage.Stable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SundayTests {
    static Field fieldTest;
    static CropRow<CornStalk> cropRow;
    static CropRow<TomatoPlant> cropRow2;
    static CropRow<PotatoPlant> cropRow3;
    static CropRow<TomatoPlant> cropRow4;
    static CropRow<CornStalk> cropRow5;

    static ChickenCoop coop;
    static ChickenCoop coop2;
    static ChickenCoop coop3;
    static ChickenCoop coop4;
    static Stable stable;
    static Stable stable2;
    static Stable stable3;
    static Tractor tractor;
    static CropDuster cropDuster;
    static Froilan froilan;
    static Froilanda froilanda;
    static FarmHouse farmHouse;

    static Farm farm;


    @Before
    public void setUp(){
        // setting up field
         fieldTest = new Field();
         cropRow = new CropRow<>();
         cropRow2 = new CropRow<>();
         cropRow3 = new CropRow<>();
         cropRow4 = new CropRow<>();
         cropRow5 = new CropRow<>();
        fieldTest.add(cropRow);
        fieldTest.add(cropRow2);
        fieldTest.add(cropRow3);
        fieldTest.add(cropRow4);
        fieldTest.add(cropRow5);

        // setting up chicken coops
        coop = new ChickenCoop();
        coop.add(new Chicken());
        coop.add(new Chicken());
        coop.add(new Chicken());
        coop.add(new Chicken());

        coop2 = new ChickenCoop();
        coop2.add(new Chicken());
        coop2.add(new Chicken());
        coop2.add(new Chicken());
        coop2.add(new Chicken());

        coop3 = new ChickenCoop();
        coop3.add(new Chicken());
        coop3.add(new Chicken());
        coop3.add(new Chicken());
        coop3.add(new Chicken());

        coop4 = new ChickenCoop();
        coop4.add(new Chicken());
        coop4.add(new Chicken());
        coop4.add(new Chicken());

        // setting up stables
        stable = new Stable();
        stable.add(new Horse());
        stable.add(new Horse());
        stable.add(new Horse());
        stable.add(new Horse());
        stable.add(new Horse());

        stable2 = new Stable();
        stable2.add(new Horse());
        stable2.add(new Horse());

        stable3 = new Stable();
        stable3.add(new Horse());
        stable3.add(new Horse());
        stable3.add(new Horse());

        // setting up FarmVehicles
        tractor = new Tractor();
        cropDuster = new CropDuster();

        // setting up the frois
        froilan = new Froilan();
        froilanda = new Froilanda();

        // setting up farmhouse
        farmHouse = new FarmHouse();
        farmHouse.add(froilan);
        farmHouse.add(froilanda);

        // setting up farm
        farm = new Farm(farmHouse);

        farm.addCoops(coop);
        farm.addCoops(coop2);
        farm.addCoops(coop3);
        farm.addCoops(coop4);

        farm.addStables(stable);
        farm.addStables(stable2);
        farm.addStables(stable3);

    }

    @Test
    public void test(){
        Assert.assertEquals(4, coop.size());
    }

    @Test
    public void testFroilanRidesHorses(){
        for(Stable s : farm.getStables()){
            for(Horse h : s){
                Assert.assertTrue(froilan.mount(h));
                Assert.assertNotNull(h.makeNoise());
                Assert.assertTrue(froilan.dismount(h));
            }
        }
    }



}
