package com.zipcodewilmington.froilansfarm.classes.food;

import com.zipcodewilmington.froilansfarm.abstractClasses.Crop;

public class PotatoPlant extends Crop<Potato> {


    @Override
    public Potato yield() {
        if(this.hasBeenFertilized && this.hasBeenHarvested){
            this.hasBeenHarvested = false;
            this.hasBeenFertilized = false;
            return new Potato();
        }
        return null;
    }
}
