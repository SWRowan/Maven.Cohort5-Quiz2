package com.zipcodewilmington.assessment2.part2;

import java.util.*;

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
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, array);
        for (int i = 0; i < index; i++) {
            list.add(array[i]);
            list.remove(0);
        }

        Integer[] ans = new Integer[list.size()-index];
        ans = list.toArray(ans);

        System.out.println(list);

        return ans;
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

