package com.company;

import com.company.Forest.Forest;

import java.awt.*;
public class Main {

    static int CANVAS_SIZE = 500;
    static int PLANTS_TO_DRAW = 1000000;
    static int PLANT_TYPES = 2;

    public static void main(String[] args) {

        forestPlant();
    }

    private static void forestPlant(){
        Forest forest = new Forest();

        forest.plantGrass();

        for (int i = 0; i < Math.floor(PLANTS_TO_DRAW / PLANT_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");

            forest.plantBush(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Red Barbaric", Color.RED, "Barbaric texture in all seasons");
            forest.plantBush(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Yellow Heather", Color.YELLOW, "Heather texture in all seasons");

        }

        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(PLANTS_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + PLANTS_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + PLANT_TYPES + "");
        System.out.println("---------------------");

        System.out.println(PLANTS_TO_DRAW + " bushes drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Bushes size (8 bytes) * " + PLANTS_TO_DRAW);
        System.out.println("+ BushTypes size (~30 bytes) * " + PLANT_TYPES + "");
        System.out.println("---------------------");

        System.out.println("Grass drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Grass size (~20 bytes)");
        System.out.println("---------------------");

        System.out.println("Total: " + ((PLANTS_TO_DRAW * 8 + PLANT_TYPES * 30)*2 / 1024 / 1024) +
                "MB (instead of " + (((PLANTS_TO_DRAW * 38)*2+20) / 1024 / 1024) + "MB)");



    }


    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}