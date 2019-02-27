package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    public Integer input = 0;


    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public Boolean isWu() {

        return (input % 3 == 0);
    }

    public Boolean isTang() {
        return (input % 5 == 0);
    }

    public Boolean isWuTang() {
        return (input % 3 == 0 && input % 5 == 0);
    }
}
