package com.zipcodewilmington.froilansfarm.interfaces;

public interface Produce < EdibleType extends Edible> {
    EdibleType yield(Boolean hasBeen);
}
