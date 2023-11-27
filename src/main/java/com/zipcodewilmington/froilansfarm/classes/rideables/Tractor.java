package com.zipcodewilmington.froilansfarm.classes.rideables;

import com.zipcodewilmington.froilansfarm.classes.CropRow;
import com.zipcodewilmington.froilansfarm.classes.Farm;
import com.zipcodewilmington.froilansfarm.classes.Farmer;
import com.zipcodewilmington.froilansfarm.classes.food.TomatoPlant;
import com.zipcodewilmington.froilansfarm.interfaces.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.EdibleCrops;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

import java.util.ArrayList;

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

    public int harvestCrop(CropRow <Crop> cropRow) {
        int countCrop = 0;

        for (int i = 0; i < cropRow.size(); i++) {
            if (cropRow.get(i).yield(true, true) != null) {
                countCrop++;
            }


        }return countCrop;
    }
}
