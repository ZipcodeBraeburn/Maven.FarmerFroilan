package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.classes.rideables.Horse;
import com.zipcodewilmington.froilansfarm.classes.rideables.Tractor;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.abstractClasses.Person;
import com.zipcodewilmington.froilansfarm.interfaces.Crop;

public class Farmer extends Person<Tractor, Horse> implements Botanist {
    @Override
    public boolean plant(Crop crop ,CropRow cropRow) {
       return true;
    }


    @Override
    public boolean mount(Tractor tractor) {
        return true;
    }

    @Override
    public boolean dismount(Tractor tractor) {
        return true;
    }

    @Override
    public boolean mount(Horse horse) {
        if(horse.getIfMounted() == false){
            horse.setIfMounted(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean dismount(Horse horse) {
        if(horse.getIfMounted() == true){
            horse.setIfMounted(false);
            return true;
        }
        return false;
    }
}
