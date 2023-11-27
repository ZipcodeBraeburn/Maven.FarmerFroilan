package com.zipcodewilmington.froilansfarm.classesTests;

import com.zipcodewilmington.froilansfarm.abstractClasses.EdibleStorage;
import com.zipcodewilmington.froilansfarm.classes.Froilan;
import com.zipcodewilmington.froilansfarm.classes.Froilanda;
import com.zipcodewilmington.froilansfarm.classes.food.EarCorn;
import com.zipcodewilmington.froilansfarm.classes.food.EdibleEgg;
import com.zipcodewilmington.froilansfarm.classes.food.Potato;
import com.zipcodewilmington.froilansfarm.classes.food.Tomato;
import com.zipcodewilmington.froilansfarm.classes.rideables.CropDuster;
import com.zipcodewilmington.froilansfarm.classes.rideables.Horse;
import com.zipcodewilmington.froilansfarm.classes.rideables.Tractor;
import com.zipcodewilmington.froilansfarm.classes.storage.CornStorage;
import com.zipcodewilmington.froilansfarm.classes.storage.PotatoStorage;
import com.zipcodewilmington.froilansfarm.classes.storage.TomatoStorage;
import org.junit.Assert;
import org.junit.Test;

public class FroilanTests {

    @Test
    public void testFroilanConstructor(){
        Froilan froilan = new Froilan();
        Assert.assertNotNull(froilan);
    }

    // we can't dismount a horse we're not even on
    // so we have to check if the horse is being
    // mounted first

    @Test
    public void testFroilanMountTractor(){
        Froilan froilan = new Froilan();
        Tractor tractor = new Tractor();

        Assert.assertTrue(froilan.mount(tractor));
    }

    @Test
    public void testFroilanMountHorse(){
        Froilan froilan = new Froilan();
        Horse horse = new Horse();

        Assert.assertTrue(froilan.mount(horse));
    }

    @Test
    public void testFroilanDisountHorse(){
        Froilan froilan = new Froilan();
        Horse horse = new Horse();
        froilan.mount(horse);

        Assert.assertTrue(froilan.dismount(horse));
    }
    @Test
    public void TestIfFrolianEatEarCorn(){
        Froilan froilan = new Froilan();
        EarCorn earCorn = new EarCorn();
        CornStorage cornStorage = new CornStorage();
        cornStorage.add(earCorn);
        Boolean eaten = froilan.eat(earCorn ,cornStorage);
        Assert.assertTrue(eaten);
    }
    @Test
    public void TestIfFrolianEatTomato(){
        Froilan froilan = new Froilan();
        Tomato tomato = new Tomato();
         TomatoStorage tomatoStorage = new TomatoStorage();
         tomatoStorage.add(tomato);
        Boolean eaten = froilan.eat(tomato ,tomatoStorage);
        Assert.assertTrue(eaten);
    }
    @Test
    public void TestIfFrolianEatEdibleEgg(){
        Froilan froilan = new Froilan();
        EdibleEgg edibleEgg = new EdibleEgg();
        EdibleStorage edibleStorage = new EdibleStorage() {
        };
        edibleStorage.add(edibleEgg);
        Boolean eaten = froilan.eat(edibleEgg ,edibleStorage);
        Assert.assertTrue(eaten);
    }
    @Test
    public void TestIfFrolianEaPotato(){
        Froilan froilan = new Froilan();
        Potato potato = new Potato();
        PotatoStorage potatoStorage = new PotatoStorage() {
        };
        potatoStorage.add(potato);
        Boolean eaten = froilan.eat(potato ,potatoStorage);
        Assert.assertTrue(eaten);
    }
}
