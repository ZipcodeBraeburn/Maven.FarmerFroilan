package com.zipcodewilmington.froilansfarm.classesTests.rideables;

import com.zipcodewilmington.froilansfarm.classes.Farm;
import com.zipcodewilmington.froilansfarm.classes.rideables.Tractor;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;
import org.junit.Test;

import javax.swing.text.Utilities;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TractorTests {

    @Test
    public void testTractor(){
        Tractor cropRowTractor = new Tractor();
        assertNotNull(cropRowTractor);
    }

    @Test
    public void testFarmVehicleExtends (){
        Tractor gardenTractors = new Tractor();
        assertTrue(gardenTractors instanceof Vehicle);

    }

    @Test
    public void testoperator(){
        Farm farm = new Farm();
        Tractor kubato = new Tractor();
        assertTrue(kubato.operator(farm));

    }
}

