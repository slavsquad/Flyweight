package com.company.Plants;

import java.awt.*;

public class BushType implements PlantType {

    private String name;
    private Color color;
    private String otherBushData;

    public BushType(String name, Color color, String otherBushData) {
        this.name = name;
        this.color = color;
        this.otherBushData = otherBushData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(color);
        g.fillRoundRect(x - 5, y - 10, 13, 10, 5,5);
    }
}
