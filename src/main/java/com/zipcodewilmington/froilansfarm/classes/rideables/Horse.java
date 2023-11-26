package com.zipcodewilmington.froilansfarm.classes.rideables;

import com.zipcodewilmington.froilansfarm.abstractClasses.EdibleStorage;
import com.zipcodewilmington.froilansfarm.abstractClasses.Person;
import com.zipcodewilmington.froilansfarm.classes.food.EarCorn;
import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse implements Rideable<Person>,Animal<EarCorn> {

    boolean ifMounted = false;// started the horse with nobody on the horse

    public boolean getIfMounted(){
        return this.ifMounted;
    }

    public void setIfMounted(boolean mounted){
        this.ifMounted = mounted;
    }



    @Override
    public String makeNoise() {
       return null;
    }



    @Override
    public boolean eat(EarCorn edible, EdibleStorage edibleStorage) {
        return edibleStorage.remove(edible);
    }
}
