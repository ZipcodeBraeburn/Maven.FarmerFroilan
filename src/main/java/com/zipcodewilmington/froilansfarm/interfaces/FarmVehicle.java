package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.classes.Farm;

public interface FarmVehicle <RiderType extends Rider> extends Vehicle <RiderType>{

     boolean operator(Farm farm);
}
