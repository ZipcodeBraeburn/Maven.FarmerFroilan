package com.zipcodewilmington.froilansfarm.classes.food;

import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken implements Animal<Potato>, Produce<EdibleEgg> {



    @Override
    public boolean eat(Potato  potato) {

        return true;
    }

    @Override
    public String makeNoise() {

        return "chrip";
    }

    @Override
    public  EdibleEgg yield(Boolean hasBeenFertilized) {
        if (hasBeenFertilized == true){
            return null;
        }
        return new EdibleEgg();

    }



}
