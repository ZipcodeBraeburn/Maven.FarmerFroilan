package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.abstractClasses.Person;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.interfaces.Crop;

public class Farmer extends Person implements Rider, Botanist {
    @Override
    public boolean plant(Crop crop ,CropRow cropRow) {
       return true;
    }


}
