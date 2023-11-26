package com.zipcodewilmington.froilansfarm.classes.food;

import com.zipcodewilmington.froilansfarm.interfaces.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.EdibleCrops;

public class TomatoPlant implements Crop<Tomato> {


    @Override
    public Tomato yield(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        if (hasBeenFertilized && hasBeenHarvested){
            return new Tomato();
        }
        return null;

    }

    @Override
    public Tomato yield(Boolean hasBeenFertilized) {
        return null;
    }
}
