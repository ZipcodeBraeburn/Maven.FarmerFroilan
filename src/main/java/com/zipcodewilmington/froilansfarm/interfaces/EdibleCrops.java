package com.zipcodewilmington.froilansfarm.interfaces;

public interface EdibleCrops extends Edible {

    /*
     * But Braeburn why the heck do you have an EdibleCrops interface
     * when we already have Edible???
     *
     * Dolio told us to add it :D
     *
     * But really, it makes sense.
     * We have 4 things inheriting Produce: Chicken + our Crops
     * Our Produces have a type parameter extending Edible that
     * will be used as the return type for their yield methods.
     * So CornStalk will have a yield that returns EarCorn,
     * TomatoPlant will have a yield that returns Tomato,
     * etc.  etc. etc.
     * All good right? We made Produce generic!
     *
     * :DDDD Not really :DDDD
     *
     * Because the upper bound for the type in Produce is vague,
     * when Crop inherits Produce, it'll allow the classes inheriting it to be able to yield
     * things that they aren't supposed to be yielding. Like:
     * TomatoPlant will have a yield that returns EdibleEgg.
     * This is something that could happen because EdibleEgg is also an Edible!
     *
     * So! We have to create something that will only
     * encapsulate all Edibles but EdibleEgg -- which is this EdibleCrops interface!
     * (Our tomatoe, potato, and corn inherit this interface)
     *
     * >>> Crop
     */
}