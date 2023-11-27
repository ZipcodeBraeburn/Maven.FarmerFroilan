package com.zipcodewilmington.froilansfarm.classesTests;

import com.zipcodewilmington.froilansfarm.classes.Froilan;
import com.zipcodewilmington.froilansfarm.classes.Froilanda;
import com.zipcodewilmington.froilansfarm.classes.food.Tomato;
import com.zipcodewilmington.froilansfarm.classes.rideables.CropDuster;
import com.zipcodewilmington.froilansfarm.classes.rideables.Horse;
import com.zipcodewilmington.froilansfarm.classes.storage.TomatoStorage;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class FroilandaTest {

    @Test

    public void testFroilandaContructor(){
        Froilanda froilanda = new Froilanda();
        assertNotNull(froilanda);
    }


    @Test
    public void testFroilandaMount (){
        Froilanda froilanda = new Froilanda();
        Horse horse = new Horse();
        assertTrue(froilanda.mount(horse));

    }

    @Test
    public void testFroilandaDismount(){
        Froilanda froilanda = new Froilanda();
        Horse horse = new Horse();
        froilanda.mount(horse);
        assertTrue(froilanda.dismount(horse));
    }

    @Test
    public void testCropDusterMounted(){
        Froilanda froilanda = new Froilanda();
        CropDuster cropDuster = new CropDuster();
        assertTrue(froilanda.mount(cropDuster));
    }

@Test
    public void testCropDusterDismounted(){
        Froilanda froilanda = new Froilanda();
        CropDuster cropDuster=  new CropDuster();
         froilanda.mount(cropDuster);
        assertTrue(froilanda.dismount(cropDuster));
}


    @Test
    public void testifFroilandaEat(){

        Froilanda froilanda = new Froilanda();
        TomatoStorage storageOfTomatoes = new TomatoStorage();
        Tomato tomato = new Tomato();
        storageOfTomatoes.add(tomato);
        boolean eaten = froilanda.eat(tomato, storageOfTomatoes);
        Assert.assertTrue(eaten);
    }
}

