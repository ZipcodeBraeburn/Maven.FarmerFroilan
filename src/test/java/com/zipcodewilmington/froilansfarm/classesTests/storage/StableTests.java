package com.zipcodewilmington.froilansfarm.classesTests.storage;

import com.zipcodewilmington.froilansfarm.abstractClasses.Housing;
import com.zipcodewilmington.froilansfarm.classes.rideables.Horse;
import com.zipcodewilmington.froilansfarm.classes.storage.Stable;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StableTests {
    @Test
    public void testStableConstructor(){
        Stable stable = new Stable();
        Assert.assertNotNull(stable);
    }

    @Test
    public void testStableExtendsEdibleStorageAndArrayList(){
        Stable stable = new Stable();

        Assert.assertTrue(ArrayList.class.isAssignableFrom(stable.getClass()));
        Assert.assertTrue(stable instanceof Housing);
    }

    @Test
    public void testStableAdd(){
        Stable stable = new Stable();
        Horse horse = new Horse();

        Assert.assertTrue(stable.add(horse));
    }

    @Test
    public void testStableRemove(){
        Stable stable = new Stable();
        Horse horse = new Horse();
        stable.add(horse);

        Assert.assertTrue(stable.remove(horse));
    }

    @Test
    public void testStableSize(){
        Stable stable = new Stable();
        Horse horse = new Horse();
        stable.add(horse);

        Assert.assertEquals(1, stable.size());
    }

    @Test
    public void testStableGet(){
        Stable stable = new Stable();
        Horse horse = new Horse();
        stable.add(horse);

        Assert.assertEquals(horse, stable.get(0));
    }
}
