package com.zipcodewilmington.froilansfarm.classesTests;

import com.zipcodewilmington.froilansfarm.classes.Farm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FarmTests {

    @Test
    public void testFarm() {
        Farm lilLake = new Farm();
        assertNotNull(lilLake);

    }
}
