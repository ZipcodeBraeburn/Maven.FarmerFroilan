package com.zipcodewilmington.froilansfarm.abstractClasses;


import com.zipcodewilmington.froilansfarm.interfaces.EdibleCrops;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop<EdibleCropsType extends EdibleCrops> implements Produce<EdibleCropsType> {
    public boolean hasBeenFertilized = false;
    public boolean hasBeenHarvested = false;
    public void setHasBeenFertilized(boolean hasBeenFertilized){
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested){
        this.hasBeenHarvested = hasBeenHarvested;
    }


    /*
     * So here in Crop, Crop is also a generic, because we'll want each class
     * inheriting it to specify what kind of Edible it will Produce, etc, etc.
     * We went through a similar process with Eater.
     *
     * Anyway! The cool thing about Crop is that its
     * type parameter upper bound is NOT Edible.
     * It's EdibleCrops!
     * By doing this, we'll be able to eliminate EdibleEgg as a possible thing
     * our Crops can yield -- because EdibleEgg will not be inheriting EdibleCrops.
     * AND we can still pass the EdibleCropsType into Produce because
     * EdibleCropsType is an Edible!
     * We are just using EdibleCrops to limit ourselves to a certain subset
     * of Edibles we can use for Crops.
     *
     * >>> CornStalk
     */

}
