package com.zipcodewilmington.froilansfarm.abstractClasses;


import com.zipcodewilmington.froilansfarm.interfaces.EdibleCrops;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop<EdibleCropsType extends EdibleCrops> implements Produce<EdibleCropsType> {
    public boolean hasBeenFertilized = false;
    public boolean hasBeenHarvested = false;
    public void setHasBeenFertilized(boolean hasBeenFertilized){
        this.hasBeenFertilized = hasBeenFertilized;
    }
    public boolean getHasBeenFertilized(){ return this.hasBeenFertilized;}

    public void setHasBeenHarvested(boolean hasBeenHarvested){
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public boolean getHasBeenHarvested(){
        return this.hasBeenHarvested;
    }
}
