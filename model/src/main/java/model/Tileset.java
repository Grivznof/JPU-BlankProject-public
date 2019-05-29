package model;

import javax.naming.Name;

public class Tileset {

    private Name name;
    private int x;
    private int y;


    private Tileset(final Name name, final int x, final int y) {
        this.name = name;
        this.x = x;
        this.y = y;

    }

    public name getName() {return this.name;}

    public void setName(final String name) {
        this.name = (name);
    }

    public int getX() {
        return this.x;
    }

    public void setX(final int x) {
        this.x = (x);
    }

    public int getY() {
        return this.y;
    }

    public void setY(final int y) {
        this.y = (y);
    }
}
