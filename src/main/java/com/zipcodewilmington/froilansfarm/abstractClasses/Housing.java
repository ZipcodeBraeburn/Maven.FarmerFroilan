package com.zipcodewilmington.froilansfarm.abstractClasses;

import com.zipcodewilmington.froilansfarm.interfaces.Animal;

import java.util.ArrayList;

public abstract class Housing <AnimalType extends Animal> extends ArrayList<AnimalType> {

    /*
     * Housing is fun because you don't have to write anything in it
     * and in the things that inherit it!!! :DDDDDDDD
     *
     * Housing is inheriting from ArrayList (extends ArrayList),
     * so it inherits all of ArrayLists methods (add, remove, size, etc. etc.)
     *
     * The generics here are saying that Housing (and anything inheriting Housing)
     * will hold (or be a list of, since it's inheriting from ArrayList)
     * many certain somethings that is inheriting from Animal.
     * That's this line here: Housing<AnimalType extends Animal>
     * Since we want to be consistent, and since ArrayList itself is also a generic class,
     * we put AnimalType as a type parameter for ArrayList (ArrayList<AnimalType>)
     *
     * We put this generic here because we want Housing to only ever handle things that
     * are Animals!!!!
     * By doing this, we make it so that it can't handle
     * other things like Corn or Tractors or etc, etc, etc.
     *
     * Note: AnimalType here works like a method parameter name...
     * ... except instead of name, it's data type
     * So if you have any methods in here that uses/returns the animal,
     * you would use AnimalType as the data type
     *
     * The method signature for the add method inherited from ArrayList would look like this:
     * public boolean add(AnimalType animalToAdd);
     *
     */

}
