/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Point;
import java.awt.Polygon;
import java.awt.Shape;

/**
 *
 * @author Omar Elfarouk
 */
public class Rectangle extends Shapes {

    private int x1, y1, x2, y2;

    public Rectangle(int X1, int Y1, int X2, int Y2) {
        x1 = X1;
        y1 = Y1;
        x2 = X2;
        y2 = Y2;
         point1 = new Point(x1,y1);
        point2 = new Point(x2,y2);
        type = 5;
     
    }

    @Override
    public Shape getShape() {

        Polygon rectPolygon = new Polygon();
        rectPolygon.addPoint((int)point1.getX(), (int)point1.getY());
        rectPolygon.addPoint((int)point2.getX(), (int)point1.getY());
        rectPolygon.addPoint((int)point2.getX(), (int)point2.getY() );
        rectPolygon.addPoint((int)point1.getX(), (int)point2.getY() );

        return rectPolygon;
    }
}
