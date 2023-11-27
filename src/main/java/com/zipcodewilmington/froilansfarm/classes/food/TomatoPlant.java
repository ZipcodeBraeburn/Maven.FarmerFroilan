package com.zipcodewilmington.froilansfarm.classes.food;

import com.zipcodewilmington.froilansfarm.abstractClasses.Crop;

public class TomatoPlant extends Crop<Tomato> {


    @Override
    public Tomato yield() {
        if(this.hasBeenFertilized && this.hasBeenHarvested){
            this.hasBeenHarvested = false; // Begin the process again.
            this.hasBeenFertilized = false; //Begin the process again.
            return new Tomato();
        }
        return null;
    }
}
