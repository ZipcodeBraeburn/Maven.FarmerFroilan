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
    public Tomato yield(Boolean hasBeen) {
        if(this.hasBeenFertilized && hasBeen){
            return new Tomato();
        }
        return null;
    }
}
