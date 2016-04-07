/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Shape;

public class Square extends Shapes {

    private int x1, y1, x2, y2;

    public Square(int X1, int Y1, int X2, int Y2) {
        x1 = X1;
        y1 = Y1;
        x2 = X2;
        y2 = Y2;
        type = 8;
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
    }

    @Override
    public Shape getShape() {
        int r = Math.abs((int)point2.getX() - (int)point1.getX());
        int p = Math.abs((int)point2.getY() - (int)point1.getY());
        int value1;
        int value2;
        Polygon sqPolygon = new Polygon();
        int length;
        if (r > p) {
            length = r;
        } else {
            length = p;
        }
        if ((int)point2.getX() >= (int)point1.getX() && (int)point2.getY() <= (int)point1.getY()) {
            value1 = (int)point1.getX() + length;
            value2 = (int)point1.getY() - length;
        } else if ((int)point2.getX() <= (int)point1.getX() && (int)point2.getY() <= (int)point1.getY()) {
            value1 = (int)point1.getX() - length;
            value2 = (int)point1.getY() - length;
        } else if ((int)point2.getX() <= (int)point1.getX() && (int)point2.getY() >= (int)point1.getY()) {
            value1 = (int)point1.getX() - length;
            value2 = (int)point1.getY() + length;
        } else {
            value1 = (int)point1.getX() + length;
            value2 = (int)point1.getY() + length;
        }
        sqPolygon.addPoint((int)point1.getX(), (int)point1.getY());
        sqPolygon.addPoint(value1, (int)point1.getY());
        sqPolygon.addPoint(value1, value2);
        sqPolygon.addPoint((int)point1.getX(), value2);
        return sqPolygon;
    }
}