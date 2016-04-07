/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Omar Elfarouk
 */
public class Circle extends Shapes {

    private int x1, y1, x2, y2;

    public Circle(int X1, int Y1, int X2, int Y2) {
        x1 = X1;
        y1 = Y1;
        x2 = X2;
        y2 = Y2;
        point1 = new Point(x1,y1);
        point2 = new Point(x2,y2);
        type = 2;
        
    }
     
    @Override
    public Shape getShape() {
        int r = Math.abs((int)point2.getX() - (int)point1.getX());
        int p = Math.abs((int)point2.getY() - (int)point1.getY());
        int left1;
        int left2;
        int length;

        if (r > p) {
            length = r;
        } else {
            length = p;
        }
        if ((int)point2.getX() >= (int)point1.getX() && (int)point2.getY() <= (int)point1.getY()) {
            left1 = (int)point1.getX();
            left2 = (int)point2.getY();
        } else if ( (int)point2.getX() <= (int)point1.getX() && (int)point2.getY() <= (int)point1.getY()) {
            left1 = (int) point2.getX() ;
            left2 = (int)point2.getY();
        } else if ((int)point2.getX()  <= (int)point1.getX() && (int)point2.getY() >= (int)point1.getY()) {
            left1 = (int)point2.getX();
            left2 = (int)point1.getY();
        } else {
            left1 = (int)point1.getX();
            left2 = (int)point1.getY();
        }
        return new Ellipse2D.Double(left1, left2, length, length);
    }
    
}