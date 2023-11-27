package com.zipcodewilmington.froilansfarm.classes.food;

import com.zipcodewilmington.froilansfarm.abstractClasses.EdibleStorage;
import com.zipcodewilmington.froilansfarm.classes.storage.PotatoStorage;
import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken implements Animal<Potato>, Produce<EdibleEgg> {





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


    @Override
    public boolean eat(Potato edible, EdibleStorage edibleStorage) {
       return edibleStorage.remove(edible);

    }
}
