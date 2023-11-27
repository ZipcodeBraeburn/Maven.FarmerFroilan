package com.zipcodewilmington.froilansfarm.interfaces;


public interface Vehicle<RiderType1 extends Rider> extends NoiseMaker, Rideable<RiderType1>{


    // Note: might have to make another interface for riders of man-made vehicles.
    // i.e., pilot, farmer
    // because horseRider can only ride horses, the <Rider> here is too vague
    // it will include horseRiders as an acceptable Rider for Vehicles
}
