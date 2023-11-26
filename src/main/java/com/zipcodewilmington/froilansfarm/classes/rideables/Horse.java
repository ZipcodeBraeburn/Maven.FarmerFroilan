package com.zipcodewilmington.froilansfarm.classes.rideables;

import com.zipcodewilmington.froilansfarm.abstractClasses.Person;
import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse implements Rideable<Person>,Animal {

    boolean ifMounted = false;

    public boolean getIfMounted(){
        return this.ifMounted;
    }

    public void setIfMounted(boolean mounted){
        this.ifMounted = mounted;
    }

    @Override
    public boolean eat(Edible edible) {
      return true;
    }

    @Override
    public String makeNoise() {
       return null;
    }
}
