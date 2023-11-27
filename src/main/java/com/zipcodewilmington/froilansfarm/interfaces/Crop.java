package com.zipcodewilmington.froilansfarm.interfaces;


import com.zipcodewilmington.froilansfarm.interfaces.EdibleCrops;

public interface Crop<EdibleCropsType extends EdibleCrops> extends Produce<EdibleCropsType> {
    void setHasBeenFertilized(boolean hasBeenFertilized);
    boolean getHasBeenFertilized();
}
