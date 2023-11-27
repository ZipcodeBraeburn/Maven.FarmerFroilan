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
    public CornStalk yield(Boolean hasBeen) {
        if(this.hasBeenFertilized && hasBeen){
            return new CornStalk();
        }
        return null;
    }
}
