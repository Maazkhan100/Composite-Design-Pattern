/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositedesignpattern;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author maaz
 */
public class Triangle extends BaseShape{
    
    int pointInTriangle = 3;
    int xPoints[];
    int yPoints[];
    public Triangle(int[] x, int[] y, Color color) {
        super(0, 0, color);
        this.xPoints = x;
        this.yPoints = y;
    }
    
    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        graphics.drawPolygon(xPoints, yPoints, pointInTriangle);
    }
    
}
