package com.zipcodewilmington.froilansfarm.classes.rideables;

import com.zipcodewilmington.froilansfarm.classes.Farm;
import com.zipcodewilmington.froilansfarm.classes.Farmer;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class Tractor implements FarmVehicle<Farm> {
    @Override
    public boolean operator(Farm farm) {
        return true;
    }

    @Override
    public String  makeNoise() {
             return null;
    }
}
