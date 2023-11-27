package com.zipcodewilmington.froilansfarm.classes;
import com.zipcodewilmington.froilansfarm.classes.rideables.CropDuster;
import com.zipcodewilmington.froilansfarm.classes.rideables.Horse;
import com.zipcodewilmington.froilansfarm.interfaces.Pilot;

public class Froilanda implements Pilot {

    boolean ifMounted = false; // no one mounted it
    @Override
    public boolean mount(CropDuster cropDuster) {
        if(cropDuster.getIfMouted() == false){
            cropDuster.setIfMouted(true);
                    return true;
        }


        return false;
    }

    @Override
    public boolean dismount(CropDuster cropDuster) {
        if(cropDuster.getIfMouted() == true) {
            cropDuster.setIfMouted(false);
            return true;

        }
        return false;
    }

    @Override
    public boolean mount(Horse horse) {
        if(horse.getIfMounted() == false){
            horse.setIfMounted(true);
            return  true;
        }
        return false;
    }

    @Override
    public boolean dismount(Horse horse) {
        if(horse.getIfMounted() == true){
            horse.setIfMounted(true);
            return true;
        }
        return false;
    }
}
