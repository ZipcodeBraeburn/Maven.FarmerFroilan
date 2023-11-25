package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public interface Produce < EdibleType extends Edible> {
    public void yield(Boolean hasBeenFertilized);
}
