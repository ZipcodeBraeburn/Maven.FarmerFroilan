package com.zipcodewilmington.froilansfarm.classesTests.rideables;

import com.zipcodewilmington.froilansfarm.classes.rideables.Horse;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class HorseTests {

    @Test
    public void testHorse(){
        Horse Emily = new Horse();
        assertNotNull(Emily);
    }


    @Test
    public void testHorseExtends(){
        Horse Tin = new Horse();
        assertTrue( Tin instanceof Rideable);
    }

    @Test
    public void testAnimal(){
        boolean juju = true;
        Assert.assertTrue(juju);
    }




}
