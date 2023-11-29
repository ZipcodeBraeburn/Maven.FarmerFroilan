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
        if(tractor.isIfMounted() == false){ // is false cause nobody is on the tractor
            tractor.setIfMounted(true);  //  the tractor is  mounted
            return true;
        }
        return false;
    }

    @Override
    public boolean dismount(Tractor tractor) {
        if(tractor.isIfMounted() == true){ // is true cause somebody is on the  tractor
            tractor.setIfMounted(false);//  the tractor is not mounted
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

    // I forgot to ask dolio about theseeeee
    // ideally you would not want to write plant n times like this
    // supposed to use generics to make a general plant method
    // for all types of valid crops
    // i.e. plant(Crop crop, CropRow<Crop> cropRow)... or something like this
    // but it was giving us grief so we forced it like so below :D
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
