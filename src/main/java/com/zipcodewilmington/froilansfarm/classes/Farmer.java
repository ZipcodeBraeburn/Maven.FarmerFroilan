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


    // boolean ifMounted = false; started the horse with nobody on the horse
    @Override
    public boolean mount(Horse horse) {
        if(horse.getIfMounted() == false){ // is false cause nobody is on the horse
            horse.setIfMounted(true);  //  the horse is  mounted
            return true;
        }
        return false;
    }

    @Override
    public boolean dismount(Horse horse) {
        if(horse.getIfMounted() == true){ // is true cause somebody is on the  horse
            horse.setIfMounted(false);//  the horse is not mounted
            return true;
        }
        return false;
    }
}
