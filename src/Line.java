/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Line2D;

/**
 *
 * @author Omar Elfarouk
 */
public class Line extends Shapes {

    private int x1, y1, x2, y2;

    public Line(int X1, int Y1, int X2, int Y2) {
        x1 = X1;
        y1 = Y1;
        x2 = X2;
        y2 = Y2;
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
        type = 4;
        
    }

    @Override
    public Shape getShape() {
//        Polygon lineplo = new Polygon();
//        lineplo.addPoint(x1, y1);
//        lineplo.addPoint(x2, y2);
//        return lineplo;
        return new Line2D.Double((int)point1.getX(), (int)point1.getY(), (int)point2.getX(),(int)point2.getY());
    }
}
