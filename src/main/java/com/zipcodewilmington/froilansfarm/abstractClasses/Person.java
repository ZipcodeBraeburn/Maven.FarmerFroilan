package com.zipcodewilmington.froilansfarm.abstractClasses;

import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public abstract class Person implements Animal<Edible> {
    @Override
    public String makeNoise() {
        return "What a great Day";
    }

    @Override
    public boolean eat(Edible edible, EdibleStorage edibleStorage) {
        if (edibleStorage.contains(edible)) {
            return edibleStorage.remove(edible);
        }
        System.out.println("We don't got this!");
        return false;
    }
}
