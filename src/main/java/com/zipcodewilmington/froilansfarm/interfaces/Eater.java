package com.zipcodewilmington.froilansfarm.interfaces;

public interface Eater< EdibleType extends Edible> {
    public boolean eat(EdibleType edible);
}
