package com.zipcodewilmington.assessment2.part3;

public class BlueJay extends Bird implements Animal {


    public BlueJay(){

    }


    @Override
    public int getSpeed() {
        return 13;
    }

    @Override
    public String color() {
        return "blue";
    }


}
