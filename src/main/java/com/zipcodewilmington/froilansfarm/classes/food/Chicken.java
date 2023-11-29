package com.zipcodewilmington.froilansfarm.classes.food;

import com.zipcodewilmington.froilansfarm.abstractClasses.EdibleStorage;
import com.zipcodewilmington.froilansfarm.classes.storage.PotatoStorage;
import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

import java.util.Random;

public class Chicken implements Animal<Potato>, Produce<EdibleEgg> {

    /*
     * DON'T LOOK AT METHODS THEY'RE MESSY :(
     * I'm kidding.
     * But ya, it's messy.
     *
     * Anyway, Chicken is inheriting Animal and Produce.
     * These two interfaces are GENERIC. You can tell because <> beside them.
     * You can see below that our Chicken's eat method has Potato as a
     * parameter. (Ignore the storage, it's following the same pattern though)
     * This method SIGNATURE was automatically made for us
     * when we told intelliJ that we'd like to implement methods,
     * and the reason why was written in Animal :D
     *
     */


    boolean hasBeenFertilized;

    public Chicken(){
        // setting hasBeenFertilized to random true or false
        Random random = new Random();
        int num = random.nextInt(2);
        if(num == 1){
            this.hasBeenFertilized = false;
        }
        else{
            this.hasBeenFertilized = true;
        }
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized){
        this.hasBeenFertilized = hasBeenFertilized;
    }

    @Override
    public String makeNoise() {

        return "chrip";
    }

    @Override
    public  EdibleEgg yield() {
        if (this.hasBeenFertilized == true){
            return null;
        }
        return new EdibleEgg();

    }


    @Override
    public boolean eat(Potato edible, EdibleStorage<Potato> edibleStorage) {
        if (edibleStorage.contains(edible)) {
            return edibleStorage.remove(edible);
        }
        System.out.println("We don't got this!");
        return false;

    }
}
