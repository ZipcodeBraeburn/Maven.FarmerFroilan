package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public interface Rider<RideableType, RideableType2 extends Rideable>  {

    boolean mount(RideableType rideableType);
    boolean dismount(RideableType rideableType);

    boolean mount(RideableType2 rideableType2);
    boolean dismount(RideableType2 rideableType2);



}
