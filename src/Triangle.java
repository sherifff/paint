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
public class Triangle extends Shapes {

    private int x1, y1, x2, y2;

    public Triangle(int X1, int Y1, int X2, int Y2) {
        x1 = X1;
        y1 = Y1;
        x2 = X2;
        y2 = Y2;
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
        type = 7;
    }

    @Override
    public Shape getShape() {
        Polygon triPolygon = new Polygon();
        if (point2.getY() < point1.getY()) {
            triPolygon.addPoint((int)((Math.abs(point2.getX() - point1.getX()) / 2) + Math.min(point1.getX(), point2.getX())), (int)point2.getY());
            triPolygon.addPoint((int) point1.getX(), (int)point1.getY());
            triPolygon.addPoint((int) point2.getX(), (int)point1.getY());
        } else {
            triPolygon.addPoint((int) ((Math.abs(point2.getX() - point1.getX()) / 2) + Math.min(point1.getX(), point2.getX())), (int)point1.getY());
            triPolygon.addPoint((int) point1.getX(), (int)point2.getY());
            triPolygon.addPoint((int) point2.getX(), (int)point2.getY());
        }
        return triPolygon;
    }
}
