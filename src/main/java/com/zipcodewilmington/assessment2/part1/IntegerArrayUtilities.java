package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        return (array.length % 2 == 0);
    }

    public Integer[] range(int start, int stop) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = start; i <= stop; i++) {
            arrList.add(i);
        }
        Integer[] answer = new Integer[arrList.size()];
                answer = arrList.toArray(answer);


        return answer;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer answer = array[0] + array[1];
        return answer;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        Integer answer = array[0] * array[1];
        return answer;
    }
}
