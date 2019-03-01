package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class ListUtility {
    List<Integer> answer = new ArrayList<>();
    ArrayUtility theGoodStuff = new ArrayUtility();

    public Boolean add(Integer i) {
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
        Set<Integer> temp = new LinkedHashSet<>();
        temp.addAll(answer);
        answer.clear();
        answer.addAll(temp);
        return answer;
    }

    public String join() {
        this.answer = answer;

        StringBuilder sb = new StringBuilder();
        for (Integer x : answer){
             sb.append(x);
             sb.append(", ");
        }
        sb.delete(sb.length()-2, sb.length());
        return sb.toString();
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
