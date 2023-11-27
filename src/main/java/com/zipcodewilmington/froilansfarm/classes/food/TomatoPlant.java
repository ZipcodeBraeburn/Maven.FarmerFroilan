package com.zipcodewilmington.froilansfarm.classes.food;

import com.zipcodewilmington.froilansfarm.abstractClasses.Crop;

public class TomatoPlant extends Crop<Tomato> {


    @Override
    public Tomato yield() {
        if(this.hasBeenFertilized && this.hasBeenHarvested){
            this.hasBeenHarvested = false;
            this.hasBeenFertilized = false;
            return new Tomato();
        }
        return null;
    }
}
