package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.classes.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.classes.storage.FarmHouse;
import com.zipcodewilmington.froilansfarm.classes.storage.Stable;

import java.util.ArrayList;

public class Farm {
    ArrayList<Stable> stables;
    ArrayList<ChickenCoop> coops;
    FarmHouse farmHouse;

    public Farm(FarmHouse farmHouse){
        this.farmHouse = farmHouse;
        stables = new ArrayList<>();
        coops = new ArrayList<>();
    }

    public void addStables(Stable stable){
        stables.add(stable);
    }

    public void addCoops(ChickenCoop coop){
        coops.add(coop);
    }

    public ArrayList<Stable> getStables(){ return this.stables; }
    public ArrayList<ChickenCoop> getCoops(){ return this.coops; }

    public FarmHouse getFarmHouse(){ return this.farmHouse; }

}
