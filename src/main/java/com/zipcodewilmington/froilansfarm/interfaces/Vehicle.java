package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.abstractClasses.Rider;

public interface Vehicle<RiderType extends VehiculeRider> extends NoiseMaker, Rideable<RiderType>{


    // Note: might have to make another interface for riders of man-made vehicles.
    // i.e., pilot, farmer
    // because horseRider can only ride horses, the <Rider> here is too vague
    // it will include horseRiders as an acceptable Rider for Vehicles
}
