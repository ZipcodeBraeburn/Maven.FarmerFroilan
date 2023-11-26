package com.zipcodewilmington.froilansfarm.abstractClasses;

import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public abstract class Person implements Animal {

    public String makeNoise() {
        System.out.println("What a great Day");

        return null;
    }


    public boolean eat(Edible edible) {

        return false;
    }
}
