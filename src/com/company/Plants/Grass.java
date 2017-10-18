package com.company.Plants;

import java.awt.*;

public class Grass implements PlantType {
    private static final Color color = new Color(34,139,34);
    @Override
    public void draw(Graphics graphics, int weight, int height) {
        graphics.setColor(color);
        graphics.fillRect(0, 0, weight, height);
    }
}
