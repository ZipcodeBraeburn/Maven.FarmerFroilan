package com.zipcodewilmington.froilansfarm.weekTests;

import com.zipcodewilmington.froilansfarm.abstractClasses.Crop;
import com.zipcodewilmington.froilansfarm.classes.*;
import com.zipcodewilmington.froilansfarm.classes.food.*;
import com.zipcodewilmington.froilansfarm.classes.rideables.CropDuster;
import com.zipcodewilmington.froilansfarm.classes.rideables.Horse;
import com.zipcodewilmington.froilansfarm.classes.rideables.Tractor;
import com.zipcodewilmington.froilansfarm.classes.storage.*;
import com.zipcodewilmington.froilansfarm.classesTests.FieldTests;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FridayTests {
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
    static TomatoStorage tomatoStorage;
    static PotatoStorage potatoStorage;
    static CornStorage cornStorage;
    static EggStorage eggStorage;

    @Before
    public void setUp(){
        // setting up field
        fieldTest = new Field();
        froilanda = new Froilanda();
        cropDuster =new CropDuster();

        cropRow = new CropRow<>();
        for(int i = 0; i < 20; i++){
            cropRow.add(new CornStalk());
        }
        cropRow2 = new CropRow<>();
        for(int i = 0; i < 20; i++){
            cropRow2.add(new TomatoPlant());
        }
        cropRow3 = new CropRow<>();
        for(int i = 0; i < 20; i++){
            cropRow3.add(new PotatoPlant());
        }
        cropRow4 = new CropRow<>();
        for(int i = 0; i < 20; i++){
            cropRow4.add(new TomatoPlant());
        }
        cropRow5 = new CropRow<>();
        for(int i = 0; i < 20; i++){
            cropRow5.add(new CornStalk());
        }

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


        // setting up storages
        tomatoStorage = new TomatoStorage();
        for(int i = 0; i < 20; i++){
            tomatoStorage.add(new Tomato());
        }
        potatoStorage = new PotatoStorage();
        for(int i = 0; i < 20; i++){
            potatoStorage.add(new Potato());
        }
        cornStorage = new CornStorage();
        for(int i = 0; i < 40; i++){
            cornStorage.add(new EarCorn());
        }
        eggStorage = new EggStorage();
        for(int i = 0; i < 20; i++){
            eggStorage.add(new EdibleEgg());
        }


        // setting up farm
        farm = new Farm(farmHouse);

        farm.addCoops(coop);
        farm.addCoops(coop2);
        farm.addCoops(coop3);
        farm.addCoops(coop4);

        farm.addStables(stable);
        farm.addStables(stable2);
        farm.addStables(stable3);


        farm.setCornStorage(cornStorage);
        farm.setEggStorage(eggStorage);
        farm.setPotatoStorage(potatoStorage);
        farm.setTomatoStorage(tomatoStorage);

    }

    @Test
    public void test(){
        Assert.assertEquals(5,fieldTest.size());
    }
    @Test
    public void testFly(){
        Assert.assertTrue(cropDuster.fly());
    }
    @Test
    public void testFroilandaMountingCropDuster(){
       Assert.assertTrue( froilanda.mount(cropDuster));

    }
    @Test
    public void testFroilandaDismountingCropDuster(){
        froilanda.mount(cropDuster);
        Assert.assertTrue(froilanda.dismount(cropDuster));
    }
    @Test
    public void testifCropDustmakeNoise(){
        String actual = cropDuster.makeNoise();
        String expected = "Whir~~~~!";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testIfCropRowHasNotBeenFertilized(){

        for ( Crop crop: cropRow){
            Assert.assertFalse(crop.hasBeenFertilized);
        }
    }
    @Test
    public void testIfCropRowHasBeenFertilized(){
        cropDuster.fertilize(cropRow);
        for ( Crop crop: cropRow){
            Assert.assertTrue(crop.hasBeenFertilized);
        }
    }

    @Test
    public void testIfCropRow2HasNotBeenFertilized(){

        for ( Crop crop: cropRow2){
            Assert.assertFalse(crop.hasBeenFertilized);
        }
    }
    @Test
    public void testIfCropRow2HasBeenFertilized(){
        cropDuster.fertilize(cropRow2);
        for ( Crop crop: cropRow2){
            Assert.assertTrue(crop.hasBeenFertilized);
        }
    }

    @Test
    public void testIfCropRow3HasNotBeenFertilized(){

        for ( Crop crop: cropRow){
            Assert.assertFalse(crop.hasBeenFertilized);
        }
    }

    @Test
    public void testIfCropRow3HasBeenFertilized(){
        cropDuster.fertilize(cropRow3);
        for ( Crop crop: cropRow3){
            Assert.assertTrue(crop.hasBeenFertilized);
        }
    }

    @Test
    public void testIfCropRow4HasNotBeenFertilized(){

        for ( Crop crop: cropRow){
            Assert.assertFalse(crop.hasBeenFertilized);
        }
    }

    @Test
    public void testIfCropRow4HasBeenFertilized(){
        cropDuster.fertilize(cropRow4);
        for ( Crop crop: cropRow4){
            Assert.assertTrue(crop.hasBeenFertilized);
        }
    }
    @Test
    public void testIfCropRow5HasNotBeenFertilized(){

        for ( Crop crop: cropRow5){
            Assert.assertFalse(crop.hasBeenFertilized);
        }
    }
    @Test
    public void testIfCropRow5HasBeenFertilized(){
        cropDuster.fertilize(cropRow5);
        for ( Crop crop: cropRow5){
            Assert.assertTrue(crop.hasBeenFertilized);
        }
    }

//his sister, Froilanda
// uses the CropDuster to fly over the Field and
// fertilizeeach of the CropRow
}
