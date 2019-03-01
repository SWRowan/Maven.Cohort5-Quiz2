package com.zipcodewilmington.assessment2.part2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Router {
    TreeMap<String, String> map = new TreeMap<>();

    public void add(String path, String controller) {
        map.put(path, controller);

    }

    public Integer size() {
        return map.size();
    }

    public String getController(String path) {
        return map.get(path);
    }

    public void update(String path, String studentController) {
        map.replace(path, studentController);
    }

    public void remove(String path) {
        map.remove(path);
    }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();

    for(Map.Entry thisPath : map.entrySet()){
        sb.append(""+ thisPath.getKey()+" -> "+thisPath.getValue()+"\n");
    }
        return sb.toString();
    }
}
