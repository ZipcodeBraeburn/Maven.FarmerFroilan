package com.zipcodewilmington.froilansfarm.classesTests;

import com.zipcodewilmington.froilansfarm.classes.Farm;
import com.zipcodewilmington.froilansfarm.classes.storage.FarmHouse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FarmTests {

    @Test
    public void testFarm() {
        FarmHouse farmHouse = new FarmHouse();
        Farm lilLake = new Farm(farmHouse);
        assertNotNull(lilLake);

    }
}
