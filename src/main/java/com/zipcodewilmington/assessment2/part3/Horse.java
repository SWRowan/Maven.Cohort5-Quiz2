package com.zipcodewilmington.assessment2.part3;

import java.util.HashMap;

public class Horse implements Animal {

    @Override
    public String move() {
        return "gallop";
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public String color() {
        return "brown";
    }
}
