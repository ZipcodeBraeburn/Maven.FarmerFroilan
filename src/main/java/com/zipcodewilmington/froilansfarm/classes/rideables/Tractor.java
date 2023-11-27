package com.zipcodewilmington.froilansfarm.classes.rideables;

import com.zipcodewilmington.froilansfarm.abstractClasses.EdibleStorage;
import com.zipcodewilmington.froilansfarm.classes.CropRow;
import com.zipcodewilmington.froilansfarm.classes.Farm;
import com.zipcodewilmington.froilansfarm.classes.Farmer;
import com.zipcodewilmington.froilansfarm.abstractClasses.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class Tractor implements FarmVehicle<Farmer> {

    boolean ifMouted = false;

    public boolean isIfMouted() {
        return this.ifMouted;
    }

    public void setIfMouted(boolean mouted) {
        this.ifMouted = mouted;
    }


// needs a havest crop method

    @Override
    public boolean operator(Farm farm) {
        return true;
    }

    @Override
    public String makeNoise() {
        return "RrrooMMMMM";
    }

    public int harvestCrop(CropRow <Crop> cropRow, EdibleStorage storage) {
        int countCrop = 0;

        for (Crop c : cropRow) {
            c.setHasBeenHarvested(true);
            if(c.yield() != null){
                storage.add(c);
            }
            countCrop++;
        }
        return countCrop;
    }
}
