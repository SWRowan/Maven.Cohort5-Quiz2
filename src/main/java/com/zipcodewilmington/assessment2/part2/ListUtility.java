package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.List;


public class ListUtility {
    List<Integer> answer = new ArrayList<>();

    public Boolean add(Integer i) {
        this.answer = answer;
        Integer baseLine = 0;
        answer.add(i);
        Integer size = answer.size();
        return (baseLine != size);
    }

    public Integer size() {
        this.answer = answer;

        return answer.size();
    }

    public List<Integer> getUnique() {
        this.answer = answer;
        return null;
    }

    public String join() {
//        this.answer = answer;
//        Integer[] quizTime = new Integer[answer.size()];
//        quizTime = answer.toArray(quizTime);
//        String str = quizTime.toString(str);
//        System.out.println(str);
//        //String answerString = str.join();
        return null;
    }

    public Integer mostCommon() {
        this.answer = answer;
        Integer[] quizTime = new Integer[answer.size()];
        quizTime = answer.toArray(quizTime);
        Integer count = 0;
        Integer mostCommon = quizTime[0];
        Integer secondCounter = 1;


        for (int i = 0; i < quizTime.length; i++) {
            Integer test = quizTime[i];
            for (int j = 1; j < quizTime.length; j++) {
                if (quizTime[j] == quizTime[j - 1]) {
                    count++;
                }

                if (count == secondCounter) {
                    mostCommon = test;
                    secondCounter = count;
                }
            }

        }
        return mostCommon;
    }

    public Boolean contains(Integer valueToAdd) {
        this.answer = answer;
        return answer.contains(valueToAdd);
    }
}
