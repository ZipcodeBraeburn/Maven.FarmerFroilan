package com.zipcodewilmington.froilansfarm.weekTests;

import com.zipcodewilmington.froilansfarm.classes.CropRow;
import com.zipcodewilmington.froilansfarm.classes.Field;
import com.zipcodewilmington.froilansfarm.classes.Froilan;
import com.zipcodewilmington.froilansfarm.classes.Froilanda;
import com.zipcodewilmington.froilansfarm.classes.food.Chicken;
import com.zipcodewilmington.froilansfarm.classes.food.CornStalk;
import com.zipcodewilmington.froilansfarm.classes.food.PotatoPlant;
import com.zipcodewilmington.froilansfarm.classes.food.TomatoPlant;
import com.zipcodewilmington.froilansfarm.classes.rideables.CropDuster;
import com.zipcodewilmington.froilansfarm.classes.rideables.Horse;
import com.zipcodewilmington.froilansfarm.classes.rideables.Tractor;
import com.zipcodewilmington.froilansfarm.classes.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.classes.storage.Stable;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;


public class ThursdayTests {


    Field fieldTest;
    CropRow<CornStalk> cropRow;
    CropRow<TomatoPlant> cropRow2;
    CropRow<PotatoPlant> cropRow3;
    CropRow<TomatoPlant> cropRow4;
    CropRow<CornStalk> cropRow5;

    ChickenCoop coop;
    ChickenCoop coop2;
    ChickenCoop coop3;
    ChickenCoop coop4;
    Stable stable;
    Stable stable2;
    Stable stable3;
    Tractor tractor;
    CropDuster cropDuster;
    Froilan froilan;
    Froilanda froilanda;


    @BeforeAll
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
        coop.add(new Chicken());
        coop.add(new Chicken());
        coop.add(new Chicken());
        coop.add(new Chicken());
        coop2.add(new Chicken());
        coop2.add(new Chicken());
        coop2.add(new Chicken());
        coop2.add(new Chicken());
        coop3.add(new Chicken());
        coop3.add(new Chicken());
        coop3.add(new Chicken());
        coop3.add(new Chicken());
        coop4.add(new Chicken());
        coop4.add(new Chicken());
        coop4.add(new Chicken());

        // setting up stables
        stable.add(new Horse());
        stable.add(new Horse());
        stable.add(new Horse());
        stable.add(new Horse());
        stable.add(new Horse());
        stable2.add(new Horse());
        stable2.add(new Horse());
        stable3.add(new Horse());
        stable3.add(new Horse());

        // setting up FarmVehicles
        tractor = new Tractor();
        cropDuster = new CropDuster();

        // setting up the frois
        froilan = new Froilan();
        froilanda = new Froilanda();

    }



}

