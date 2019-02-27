package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> stepOne = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {

            stepOne.add(array1[i]);
        }

        for (int j = 0; j < array2.length; j++) {
            stepOne.add(array2[j]);
        }

        Integer[] answer = new Integer[stepOne.size()];
        answer = stepOne.toArray(answer);
        return answer;
    }

    public Integer[] rotate(Integer[] array, Integer index) {

        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer count = countOccurOneArray(array1, valueToEvaluate) + countOccurOneArray(array2, valueToEvaluate);

        return count;
    }

    public Integer mostCommon(Integer[] array) {
        Integer mostCommon = array[0];
        Integer counter = 1;

        for (int i = 0; i < array.length; i++) {
            Integer test = array[i];
            Integer numberOfOccur = countOccurOneArray(array, test);

            if (numberOfOccur == counter) {
                mostCommon = test;
                counter = numberOfOccur;
            }
        }
        return mostCommon;
    }

    public Integer countOccurOneArray(Integer[] array, Integer value) {
        Integer count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        return count;
    }
}
