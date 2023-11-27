package com.zipcodewilmington.froilansfarm.abstractClasses;

import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public abstract class Person<RideableType1, RideableType2 extends Rideable> implements Animal, Rider<RideableType1, RideableType2> {
@Override
    public String makeNoise() {
        System.out.println("What a great Day");

        return null;
    }

@Override
    public boolean eat(Edible edible, EdibleStorage edibleStorage) {

    return edibleStorage.remove(edible);
}
}
