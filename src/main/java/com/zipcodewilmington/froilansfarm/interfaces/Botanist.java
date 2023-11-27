package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.classes.CropRow;
import com.zipcodewilmington.froilansfarm.classes.food.CornStalk;
import com.zipcodewilmington.froilansfarm.classes.food.PotatoPlant;
import com.zipcodewilmington.froilansfarm.classes.food.TomatoPlant;

public interface Botanist {
     boolean plant(TomatoPlant crop, CropRow<TomatoPlant> cropRow);
     boolean plant(PotatoPlant crop, CropRow<PotatoPlant> cropRow);
     boolean plant(CornStalk crop, CropRow<CornStalk> cropRow);

}






