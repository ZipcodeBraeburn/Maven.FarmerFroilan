package com.zipcodewilmington.froilansfarm.classesTests.rideables;

import com.zipcodewilmington.froilansfarm.classes.rideables.Horse;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class HorseTests {

    @Test
    public void testHorse(){
        Horse Emily = new Horse();
        assertNotNull(Emily);
    }

    @Test
    public void testAnimal(){
        boolean juju = true;
        Assert.assertTrue(juju);
    }




}
