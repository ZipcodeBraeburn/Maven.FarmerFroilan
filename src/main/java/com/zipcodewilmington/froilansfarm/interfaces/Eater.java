package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.abstractClasses.EdibleStorage;

public interface Eater< EdibleType extends Edible> {
    public boolean eat(EdibleType edible, EdibleStorage<EdibleType> edibleStorage);

    /*
     * Eater is a generic interface with a type parameter of something
     * extending Edible.
     * Anything inheriting Eater will have to provide something that extends Edible
     * and that something will be applied to the eat method (automatically!!!!)
     * in whatever class is implementing the methods.
     * For example, Chicken.
     *
     * But look at Animal first.
     */
}
