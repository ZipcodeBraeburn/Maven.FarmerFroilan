package com.zipcodewilmington.froilansfarm.classes.food;

import com.zipcodewilmington.froilansfarm.abstractClasses.Crop;

public class CornStalk extends Crop<EarCorn> {

    /*
     * Here be Crop.
     * You may change EarCorn in the <> to EdibileEgg. IntelliJ will
     * yell at you and tell you that it's not within the bounds :)
     *
     */

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
