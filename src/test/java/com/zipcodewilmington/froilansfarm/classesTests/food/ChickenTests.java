package com.zipcodewilmington.froilansfarm.classesTests.food;

import com.zipcodewilmington.froilansfarm.classes.food.Chicken;
import com.zipcodewilmington.froilansfarm.classes.food.EdibleEgg;
import com.zipcodewilmington.froilansfarm.classes.food.Potato;
import com.zipcodewilmington.froilansfarm.classes.storage.PotatoStorage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenTests {
    Potato potato;
    PotatoStorage potatoStorage;
    EdibleEgg edibleEgg;
    Chicken chicken;
    @Before
    public void setup(){
    chicken = new Chicken();
    edibleEgg = new EdibleEgg();
    potato = new Potato();
      potatoStorage  = new PotatoStorage();
    }

    @Test
    public void TestIsChicken(){
        Assert.assertNotNull(chicken);
    }
    // dose it lay an egg
@Test
    public void TestYield(){
        EdibleEgg eggLayed = chicken.yield(true);
        Assert.assertNull(eggLayed);
}
    @Test
    public void TestYieldNot(){
        EdibleEgg eggLayed = chicken.yield(false);
        Assert.assertNotNull(eggLayed);
    }




    // dose it make noise
    @Test
    public void TestWhatSoundchickenMake(){
        String expected= "chrip";
        String actual =  chicken.makeNoise();
    }
    // dose it eat potato
    @Test
    public void TestIfChickenEatPotato(){
        potatoStorage.add(potato);
        boolean eaten = chicken.eat( potato,potatoStorage );
        Assert.assertTrue(eaten);
    }
}
