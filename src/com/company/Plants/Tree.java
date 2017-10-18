package com.company.Plants;

import java.awt.*;

public class Tree {
    private int x;
    private int y;
    private PlantType type;

    public Tree(int x, int y, PlantType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}