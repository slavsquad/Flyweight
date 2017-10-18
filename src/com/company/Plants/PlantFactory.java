package com.company.Plants;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PlantFactory {
    static Map<String, PlantType> plantTypes = new HashMap<>();
    static Grass grass;

    public static PlantType getTreeType(String name, Color color, String otherTreeData) {
        PlantType result = plantTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            plantTypes.put(name, result);
        }
        return result;
    }

    public static PlantType getBushType(String name, Color color, String otherBushData) {
        PlantType result = plantTypes.get(name);
        if (result == null) {
            result = new BushType(name, color, otherBushData);
            plantTypes.put(name, result);
        }
        return result;
    }

    public static Grass createGrass(){
        if (grass==null){
            grass = new Grass();
        }
        return grass;
    }
}