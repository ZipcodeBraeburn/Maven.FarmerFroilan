package com.zipcodewilmington.froilansfarm.classesTests;

import com.zipcodewilmington.froilansfarm.classes.Froilan;
import com.zipcodewilmington.froilansfarm.classes.rideables.CropDuster;
import com.zipcodewilmington.froilansfarm.classes.rideables.Horse;
import com.zipcodewilmington.froilansfarm.classes.rideables.Tractor;
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
}
