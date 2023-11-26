package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.classes.Farm;
import com.zipcodewilmington.froilansfarm.classes.Farmer;

public interface FarmVehicle <RiderType extends VehiculeRider> extends Vehicle <RiderType>{

     boolean operator(Farm farm);
}
