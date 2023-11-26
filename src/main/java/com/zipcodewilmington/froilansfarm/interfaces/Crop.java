package com.zipcodewilmington.froilansfarm.interfaces;


import com.zipcodewilmington.froilansfarm.interfaces.EdibleCrops;

public interface Crop<EdibleCropsType extends EdibleCrops> extends Produce<EdibleCropsType> {
    public EdibleCropsType yield(boolean hasBeenFertilized, boolean hasBeenHarvested);
}
