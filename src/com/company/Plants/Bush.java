package com.company.Plants;

import java.awt.*;

public class Bush {
    private int x;
    private int y;
    private PlantType type;

    public Bush(int x, int y, PlantType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
