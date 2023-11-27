package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.classes.storage.*;

import java.util.ArrayList;

public class Farm {
    ArrayList<Stable> stables;
    ArrayList<ChickenCoop> coops;
    FarmHouse farmHouse;
    Field field;
    TomatoStorage tomatoStorage;
    PotatoStorage potatoStorage;
    CornStorage cornStorage;
    EggStorage eggStorage;

    public Farm(FarmHouse farmHouse){
        this.farmHouse = farmHouse;
        this.stables = new ArrayList<>();
        this.coops = new ArrayList<>();
    }

    public void addStables(Stable stable){
        stables.add(stable);
    }

    public void addCoops(ChickenCoop coop){
        coops.add(coop);
    }

    public ArrayList<Stable> getStables(){ return this.stables; }
    public ArrayList<ChickenCoop> getCoops(){ return this.coops; }

    public void setTomatoStorage(TomatoStorage tomatoStorage){
        this.tomatoStorage = tomatoStorage;
    }

    public TomatoStorage getTomatoStorage(){
        return this.tomatoStorage;
    }

    public void setPotatoStorage(PotatoStorage potatoStorage) {
        this.potatoStorage = potatoStorage;
    }

    public PotatoStorage getPotatoStorage() {
        return potatoStorage;
    }

    public void setCornStorage(CornStorage cornStorage) {
        this.cornStorage = cornStorage;
    }

    public CornStorage getCornStorage() {
        return cornStorage;
    }

    public void setEggStorage(EggStorage eggStorage) {
        this.eggStorage = eggStorage;
    }

    public EggStorage getEggStorage() {
        return eggStorage;
    }

    public Field getField(){
        return this.field;
    }
    public void setField(Field field){
        this.field = field;
    }
}
