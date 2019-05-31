package model.element;

import contract.ITileset;


import javax.naming.Name;

public class Tileset implements ITileset {

    private String factory;
    private int x;
    private int y;
    /*private int maxX = 1;
    private int maxY = 1;*/


    public Tileset(final String factory, final int x, final int y) {
        this.factory = factory;
        this.x = x;
        this.y = y;
    }

    public String getFactory() {return this.factory;}

    public void setFactory(final String Factory) {
        this.factory = (factory);
    }

    public int getX() { return this.x;}

    public void setX(final int x) {
        this.x = (x);

    }

    public int getY() {
        return this.y;
    }


    public void setY(final int y) {
        this.y = (y);
    }

    /*public void setMaxX(final int maxX) {
        this.maxX = maxX;
    }

    public void setMaxY(final int maxY) {
        this.maxY = maxY;
    }*/

}
