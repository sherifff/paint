/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Point;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Omar Elfarouk
 */
public class Ellipse extends Shapes {

    private int x1, y1, x2, y2;

    public Ellipse(int X1, int Y1, int X2, int Y2) {
        x1 = X1;
        y1 = Y1;
        x2 = X2;
        y2 = Y2;
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
        type = 3;
    }

    @Override
    public Shape getShape() {
        int left1 = (int) Math.min(point1.getX(), point2.getX());
        int left2 = (int) Math.min(point1.getY(), point2.getY());
        return new Ellipse2D.Double(left1, left2, Math.abs(point2.getX() - point1.getX()), Math.abs(point2.getY() - point1.getY()));
    }
}