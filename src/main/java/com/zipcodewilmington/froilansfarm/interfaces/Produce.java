package com.zipcodewilmington.froilansfarm.interfaces;

public interface Produce < EdibleType extends Edible> {
    EdibleType yield();

    /*
     * Produce is a generic interface with a type parameter
     * of something that extends Edible.
     * That something will be the return type of the yield method.
     *
     * Generics are Great because it can stop us from allowing
     * potentially silly things to happen in our code!
     *
     * For example, if we took out the generics, Produce would look like
     * this:
     * public interface Produce{
     *      Edible yield();
     * }
     *
     * Silly things can happen here!
     * We got 4 different things inheriting Produce, and we got
     * 4 different Edibles.
     * We could have TomatoPlants yielding Eggs
     * or PotatoPlants yielding EarCorn
     * or Chickens yielding Tomatoes
     *
     * !BECAUSE THIS CODE IS TOO VAGUE!
     *
     * With the generics, the code is saying,
     * "we got a produce, and we'll give it a certain type of edible,
     * and it'll only be able to yield that certain type of edible"
     *
     * ... and so Chickens never laid Tomatoes again :(
     * unless, y'know, you set its edible type as Tomato
     *
     *  >>> Edible
     */
}
