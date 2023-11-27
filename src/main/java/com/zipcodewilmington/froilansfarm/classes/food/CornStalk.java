package com.zipcodewilmington.froilansfarm.classes.food;

import com.zipcodewilmington.froilansfarm.interfaces.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.EdibleCrops;

public class CornStalk implements Crop<CornStalk>, EdibleCrops {

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
    public CornStalk yield(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        if (hasBeenFertilized && hasBeenHarvested){
            return new CornStalk();
        }
        return null;
    }

    @Override
    public CornStalk yield(Boolean hasBeenFertilized) {
        return null;
    }
}
