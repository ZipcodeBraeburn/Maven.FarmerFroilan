package com.zipcodewilmington.froilansfarm.classes.food;

import com.zipcodewilmington.froilansfarm.interfaces.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.EdibleCrops;

public class PotatoPlant implements Crop<Potato> {
    @Override
    public Potato yield(boolean hasBeenFertilized, boolean hasBeenHarvested) {

        if (hasBeenFertilized && hasBeenHarvested){
            return new Potato();
        }
        return null;
    }

    @Override
    public Potato yield(Boolean hasBeenFertilized) {
        return null;
    }
}
