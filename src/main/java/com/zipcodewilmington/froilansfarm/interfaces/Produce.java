package com.zipcodewilmington.froilansfarm.interfaces;

public interface Produce < EdibleType extends Edible> {
    public EdibleType yield(Boolean hasBeenFertilized);
}
