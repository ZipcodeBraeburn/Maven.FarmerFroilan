package com.zipcodewilmington.froilansfarm.classes.rideables;

import com.zipcodewilmington.froilansfarm.abstractClasses.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.Pilot;
import com.zipcodewilmington.froilansfarm.classes.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class CropDuster extends Aircraft implements  FarmVehicle <Pilot> {


    boolean ifMouted = false;


    public boolean getIfMouted() {
        return this.ifMouted;
    }


    public boolean setIfMouted(boolean mounted) {
       return this.ifMouted = mounted;



}


    @Override
    public boolean operator(Farm farm) {

        return  true;
    }

    @Override
    public String makeNoise() {
       return null;
    }
}
