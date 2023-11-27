package com.zipcodewilmington.froilansfarm.classes.rideables;

import com.zipcodewilmington.froilansfarm.abstractClasses.EdibleStorage;
import com.zipcodewilmington.froilansfarm.abstractClasses.Person;
import com.zipcodewilmington.froilansfarm.classes.food.EarCorn;
import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Horse implements Rideable<Rider>,Animal<EarCorn> {

    boolean ifMounted = false;// started the horse with nobody on the horse

    public boolean getIfMounted(){
        return this.ifMounted;
    }

    public void setIfMounted(boolean mounted){
        this.ifMounted = mounted;
    }



    @Override
    public String makeNoise() {
       return "Neighhhhhh";
    }



    @Override
    public boolean eat(EarCorn edible, EdibleStorage<EarCorn> edibleStorage) {
        if (edibleStorage.contains(edible)) {
            return edibleStorage.remove(edible);
        }
        System.out.println("We don't got this!");
        return false;
    }
}
