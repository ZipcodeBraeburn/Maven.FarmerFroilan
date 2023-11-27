package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.abstractClasses.EdibleStorage;

public interface Eater< EdibleType extends Edible> {
    public boolean eat(EdibleType edible, EdibleStorage edibleStorage);
}
