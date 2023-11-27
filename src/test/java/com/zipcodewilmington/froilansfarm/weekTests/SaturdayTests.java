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
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import org.junit.Before;

public class SaturdayTests {

    Field field;
    CropRow<CornStalk>cropRow;
    CropRow<TomatoPlant>cropRow2;
    CropRow<PotatoPlant>cropRow3;

    CropRow<CornStalk>cropRow4;
    CropRow<PotatoPlant>cropRow5;


    ChickenCoop coop1;
    ChickenCoop coop2;
    ChickenCoop coop3;
    ChickenCoop coop4;
    Stable stable1;
    Stable stable2;
    Stable stable3;
    CropDuster cropduster;
    Tractor tractor;
    Froilan froilan;
    Froilanda froilanda;

    @Before
    public void setUp(){
        // field
        field = new Field();
        cropRow = new CropRow<>();
        cropRow2 = new CropRow<>();
        cropRow3 = new CropRow<>();
        cropRow4 = new CropRow<>();
        cropRow5 = new CropRow<>();
        field.add(cropRow);
        field.add(cropRow2);
        field.add(cropRow3);
        field.add(cropRow4);
        field.add(cropRow5);

        // ChickenCoop
        ChickenCoop coop = new ChickenCoop();
        coop1.add(new Chicken());
        coop1.add(new Chicken());
        coop1.add(new Chicken());
        coop1.add(new Chicken());

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
        coop4.add(new Chicken());

        // stable
        Stable stable = new Stable();
        stable1.add(new Horse());
        stable1.add(new Horse());
        stable1.add(new Horse());
        stable1.add(new Horse());
        stable1.add(new Horse());

        stable2.add(new Horse());
        stable2.add(new Horse());
        stable2.add(new Horse());

        stable3.add(new Horse());
        stable3.add(new Horse());
        stable3.add(new Horse());


        // setting FarmVehicles;
      tractor = new Tractor();
      cropduster = new CropDuster();

    }

}


