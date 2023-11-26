package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.abstractClasses.Botanist;
import com.zipcodewilmington.froilansfarm.abstractClasses.Person;
import com.zipcodewilmington.froilansfarm.abstractClasses.Rider;
import com.zipcodewilmington.froilansfarm.interfaces.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.VehiculeRider;

public class Farmer extends Person implements Rider, Botanist {
    @Override
    public boolean plant(Crop crop ,CropRow cropRow) {
       return true;
    }


}
