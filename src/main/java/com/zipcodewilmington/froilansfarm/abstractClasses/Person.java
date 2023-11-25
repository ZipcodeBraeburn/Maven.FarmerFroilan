package com.zipcodewilmington.froilansfarm.abstractClasses;

import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public abstract class Person implements Animal {

    public void makeNoise() {
        System.out.println("What a great Day");

    }


    public void eat(Edible edible) {

    }
}
