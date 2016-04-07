/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Point;
import java.awt.Shape;

/**
 *
 * @author Omar Elfarouk
 */
public class Shapes {
    private int x1=0;
    private int y1=0;
    private int X2=0;
    private int y2=0;
    private Shape shape;
    private Color color;
    private int thik;
    private boolean fill;
    private boolean selected;
    protected Point point1;
    protected Point point2;
    protected int type;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return X2;
    }

    public void setX2(int X2) {
        this.X2 = X2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Shapes() {
        point1 = new Point(0,0);
        point2 = new Point(0,0);
    }

    public Shapes(Shape shape, Color color, int thik, boolean fill, boolean selected, Point point1, Point point2,int type) {
        this.shape = shape;
        this.color = color;
        this.thik = thik;
        this.fill = fill;
        this.selected = selected;
        this.point1 = point1;
        this.point2 = point2;
        this.type = type;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getThik() {
        return thik;
    }

    public void setThik(int thik) {
        this.thik = thik;
    }
}
