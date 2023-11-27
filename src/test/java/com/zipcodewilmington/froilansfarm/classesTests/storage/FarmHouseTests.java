package com.zipcodewilmington.froilansfarm.classesTests.storage;

import com.zipcodewilmington.froilansfarm.abstractClasses.Housing;
import com.zipcodewilmington.froilansfarm.classes.storage.FarmHouse;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FarmHouseTests {

    @Test
    public void testFarmHouseConstructor(){
        FarmHouse house = new FarmHouse();

        Assert.assertNotNull(house);
    }

    @Test
    public void testFarmHouseExtendsHousing(){
        FarmHouse house = new FarmHouse();

        Assert.assertTrue(house instanceof Housing);
    }
}
