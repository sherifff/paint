/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

public class Select {

    public boolean isSelected(ArrayList<Shapes> shapes, int x, int y) {
        ArrayList<Integer> selected = new ArrayList<Integer>();
        boolean flag = false;
        for (int i = 0; i < shapes.size(); i++) {
                if ( shapes.get(i).getShape().intersects(x, y, shapes.get(i).getThik(), shapes.get(i).getThik()) ) {
                    shapes.get(i).setSelected(true);
                    flag = true;
                }
        }
        return flag;
    }
}
