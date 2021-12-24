/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositedesignpattern;

import java.awt.*;

/**
 *
 * @author maaz
 */
public class CompositeDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                    new Circle(110, 110, 50, Color.RED),
                    new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                ),
                
                new CompoundShape(
                        new Triangle(new int[] {300, 350, 240}, new int[] {25, 125, 120}, Color.PINK),
                        new Circle(275, 70, 20, Color.BLUE)
                )
        );
    }
    
}
