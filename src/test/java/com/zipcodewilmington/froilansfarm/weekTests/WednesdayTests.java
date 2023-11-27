package com.zipcodewilmington.froilansfarm.weekTests;

import com.zipcodewilmington.froilansfarm.classes.*;
import com.zipcodewilmington.froilansfarm.classes.food.*;
import com.zipcodewilmington.froilansfarm.classes.rideables.CropDuster;
import com.zipcodewilmington.froilansfarm.classes.rideables.Horse;
import com.zipcodewilmington.froilansfarm.classes.rideables.Tractor;
import com.zipcodewilmington.froilansfarm.classes.storage.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.zipcodewilmington.froilansfarm.weekTests.ThursdayTests.farm;

public class WednesdayTests {   static Field fieldTest;
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

        farm.setField(fieldTest);

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
        Assert.assertEquals(4, farm.getCoops().get(0).size());
        Assert.assertEquals(20, tomatoStorage.size());
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

    @Test
    public void testFroilandaRidesHorses(){
        for(Stable s : farm.getStables()){
            for(Horse h : s){
                Assert.assertTrue(froilanda.mount(h));
                Assert.assertNotNull(h.makeNoise());
                Assert.assertTrue(froilanda.dismount(h));
            }
        }
    }

    @Test
    public void testFeedHorses(){
        for(Stable s : farm.getStables()){
            for(Horse h : s){
                Assert.assertTrue(h.eat(farm.getCornStorage().get(0), farm.getCornStorage()));
                Assert.assertTrue(h.eat(farm.getCornStorage().get(1), farm.getCornStorage()));
                Assert.assertTrue(h.eat(farm.getCornStorage().get(2), farm.getCornStorage()));
            }
        }
    }

    @Test
    public void testFroilanBreakfast(){
        // froilan eats 1 corn
        Assert.assertTrue(froilan.eat(farm.getCornStorage().get(0), farm.getCornStorage()));
        // 2 tomatoes
        Assert.assertTrue(froilan.eat(farm.getTomatoStorage().get(0), farm.getTomatoStorage()));
        Assert.assertTrue(froilan.eat(farm.getTomatoStorage().get(1), farm.getTomatoStorage()));
        // 5 eggs
        Assert.assertTrue(froilan.eat(farm.getEggStorage().get(0), farm.getEggStorage()));
        Assert.assertTrue(froilan.eat(farm.getEggStorage().get(1), farm.getEggStorage()));
        Assert.assertTrue(froilan.eat(farm.getEggStorage().get(2), farm.getEggStorage()));
        Assert.assertTrue(froilan.eat(farm.getEggStorage().get(3), farm.getEggStorage()));
        Assert.assertTrue(froilan.eat(farm.getEggStorage().get(4), farm.getEggStorage()));

    }

    @Test
    public void testFroilandaBreakfast(){
        // froilanda eats 2 corn
        Assert.assertTrue(froilanda.eat(farm.getCornStorage().get(0), farm.getCornStorage()));
        Assert.assertTrue(froilanda.eat(farm.getCornStorage().get(0), farm.getCornStorage()));
        // 1 tomato
        Assert.assertTrue(froilanda.eat(farm.getTomatoStorage().get(0), farm.getTomatoStorage()));
        // 2 eggs
        Assert.assertTrue(froilanda.eat(farm.getEggStorage().get(0), farm.getEggStorage()));
        Assert.assertTrue(froilanda.eat(farm.getEggStorage().get(1), farm.getEggStorage()));
    }


    @Test
   public void testFeedChickens(){
       for(ChickenCoop coop: farm.getCoops() ){
           for(Chicken c : coop ){
               Assert.assertTrue(c.eat(farm.getPotatoStorage().get(0), farm.getPotatoStorage()));

           }
       }
   }


    @Test
    public void testChickensMakeNoise(){
        Assert.assertEquals("chrip", coop.get(0).makeNoise());

    }

    @Test
    public void testChickenYield(){
        coop.get(0).setHasBeenFertilized(false);
        Assert.assertNotNull(coop.get(0).yield());
    }

}
