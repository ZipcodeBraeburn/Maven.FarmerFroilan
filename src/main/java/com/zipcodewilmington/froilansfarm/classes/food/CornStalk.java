package com.zipcodewilmington.froilansfarm.classes.food;

import com.zipcodewilmington.froilansfarm.abstractClasses.Crop;

public class CornStalk extends Crop<EarCorn> {

    @Override
    public EarCorn yield() {
        if(this.hasBeenFertilized && this.hasBeenHarvested){
            this.hasBeenHarvested = false;
            this.hasBeenFertilized = false;
            return new EarCorn();
        }
        return null;
    }

}
