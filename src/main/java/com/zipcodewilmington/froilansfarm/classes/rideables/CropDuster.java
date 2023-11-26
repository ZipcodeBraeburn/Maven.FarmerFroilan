package com.zipcodewilmington.froilansfarm.classes.rideables;

import com.zipcodewilmington.froilansfarm.abstractClasses.Aircraft;
import com.zipcodewilmington.froilansfarm.abstractClasses.Pilot;
import com.zipcodewilmington.froilansfarm.classes.Farm;
import com.zipcodewilmington.froilansfarm.classes.Farmer;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class CropDuster extends Aircraft implements  FarmVehicle <Pilot> {
    @Override
    public boolean operator(Farm farm) {

        return  true;
    }

    @Override
    public void makeNoise() {

    }
}
