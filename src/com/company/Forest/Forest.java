package com.company.Forest;


import com.company.Plants.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

    public class Forest extends JFrame {
        private List<Tree> trees = new ArrayList<>();
        private List<Bush> bushes = new ArrayList<>();
        private Grass grass;

    public Forest() throws HeadlessException {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        PlantType type = PlantFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void plantBush(int x, int y, String name, Color color, String otherBushData){
        PlantType type = PlantFactory.getBushType(name, color, otherBushData);
        Bush bush = new Bush(x, y, type);
        bushes.add(bush);
    }

    public void plantGrass(){
        grass = PlantFactory.createGrass();
    }

    @Override
    public void paint(Graphics graphics) {

        if (grass!=null){
            grass.draw(graphics,this.getSize().width,this.getSize().height);
        }

        for (Tree tree : trees) {
            tree.draw(graphics);
        }

        for (Bush bush : bushes) {
            bush.draw(graphics);
        }

    }
}