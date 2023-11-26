package com.zipcodewilmington.froilansfarm.classes.rideables;

import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse implements Rideable,Animal {

    @Override
    public boolean eat(Edible edible) {
      return true;
    }

    @Override
    public String makeNoise() {
       return null;
    }
}
