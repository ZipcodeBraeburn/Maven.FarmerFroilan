package com.zipcodewilmington.froilansfarm.classesTests;

import com.zipcodewilmington.froilansfarm.classes.CropRow;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CropRowTests {


    @Test
    public void testCropRow (){
        CropRow tomato = new CropRow();
        assertNotNull(tomato);
    }

}
