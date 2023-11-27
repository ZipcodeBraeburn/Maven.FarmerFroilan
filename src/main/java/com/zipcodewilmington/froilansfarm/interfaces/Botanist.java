package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.classes.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Crop;

public interface Botanist {
     boolean plant(Crop crop, CropRow<? extends Crop> cropRow);

}






