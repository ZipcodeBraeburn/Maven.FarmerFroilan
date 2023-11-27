package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.classes.food.CornStalk;
import com.zipcodewilmington.froilansfarm.classes.food.PotatoPlant;
import com.zipcodewilmington.froilansfarm.classes.food.TomatoPlant;
import com.zipcodewilmington.froilansfarm.classes.rideables.Horse;
import com.zipcodewilmington.froilansfarm.classes.rideables.Tractor;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.abstractClasses.Person;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Farmer extends Person implements Botanist, Rider<Tractor,Horse> {

    @Override
    public boolean mount(Tractor tractor) {
        if(tractor.isIfMounted() == false){ // is false cause nobody is on the horse
            tractor.setIfMounted(true);  //  the horse is  mounted
            return true;
        }
        return false;
    }

    @Override
    public boolean dismount(Tractor tractor) {
        if(tractor.isIfMounted() == true){ // is true cause somebody is on the  horse
            tractor.setIfMounted(false);//  the horse is not mounted
            return true;
        }
        return false;
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

    @Override
    public boolean plant(TomatoPlant crop, CropRow<TomatoPlant> cropRow) {
        return cropRow.add(crop);
    }

    @Override
    public boolean plant(PotatoPlant crop, CropRow<PotatoPlant> cropRow) {
        return cropRow.add(crop);
    }

    @Override
    public boolean plant(CornStalk crop, CropRow<CornStalk> cropRow) {
        return cropRow.add(crop);
    }
}
