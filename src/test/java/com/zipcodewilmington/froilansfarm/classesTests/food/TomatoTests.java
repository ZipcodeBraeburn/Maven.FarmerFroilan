package com.zipcodewilmington.froilansfarm.classesTests.food;

import com.zipcodewilmington.froilansfarm.classes.food.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class TomatoTests {
    // constructor
    @Test
    public void testTomato(){
        Tomato tomato = new Tomato();

        Assert.assertNotNull(tomato);
    }

    // test it method
   // @Test
//    public void testIfhasBeenFertilized(){
//        Tomato tomato = new Tomato();
//       boolean fertile = tomato.hasBeenFertilized();
//       Assert.assertTrue(fertile);
//    }
//
//
//@Test
//public void TestisTomatoEdible(){ // test if edible
//        // test if it can be eaten
//  // call on tomato to see if the tomato is edible
//    Tomato tomato = new Tomato();
//   boolean eat = tomato.isTomatoEdible();
// Assert.assertTrue(eat);
//    }
//
//

}
