package com.zipcodewilmington.froilansfarm.abstractClasses;

import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;

public abstract class Aircraft extends Vehicle<Pilot> {

    public boolean fly(){
        System.out.println("Flying~~~");
        return true;
    }

}
