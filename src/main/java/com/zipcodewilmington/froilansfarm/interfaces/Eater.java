package com.zipcodewilmington.froilansfarm.interfaces;

public interface Eater< EdibleType extends Edible> {
    public void eat(EdibleType edible);
}
