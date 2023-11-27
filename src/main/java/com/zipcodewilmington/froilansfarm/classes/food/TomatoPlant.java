package com.zipcodewilmington.froilansfarm.classes.food;

import com.zipcodewilmington.froilansfarm.interfaces.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.EdibleCrops;

public class TomatoPlant implements Crop<Tomato> {

    boolean hasBeenFertilized = false;

    @Override
    public void setHasBeenFertilized(boolean hasBeenFertilized){
        this.hasBeenFertilized = hasBeenFertilized;
    }

    @Override
    public boolean getHasBeenFertilized(){
        return this.hasBeenFertilized;
    }

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
