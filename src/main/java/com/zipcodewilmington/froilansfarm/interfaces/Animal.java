package com.zipcodewilmington.froilansfarm.interfaces;

public interface Animal<EdibleType extends Edible> extends Eater<EdibleType>,NoiseMaker{

    /*
     * Animal is a generic interface that inherits from
     * the generic interface Eater and the interface NoiseMaker.
     *
     * Animal has type parameter of something that extends Edible.
     * This is because not every Animal will eat the same Edible,
     * so we're making it so that when an Animal is created, we
     * have to specify what Edible it eats, and we'll pass that onto Eater.
     * (that's why Eater here has <EdibleType>)
     *
     * In the case of Braeburn's farm, Chickens can only eat Potatoes.
     * You'll see later in Chicken that its signature will look like this:
     * public class Chicken implements Animal<Potato>... we're establishing in
     * the code that all Chickens will eat Potatoes.
     * That Potato will pass into this interface, then will be passed into Eater
     * where it will be set as the type for the eat method there.
     *
     * Pls head to Chicken :)
     */
}
