package model.element.mobile;

import model.Dimension;
import model.Direction;
import model.IArea;
import model.Position;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;


abstract class Mobile extends Element implements IMobile{

    private Direction direction;
    private Position position;
    private Dimension dimension;
    private Permeability permeability;
    private Sprite sprite;
    private IArea area;

    Mobile(final Direction direction, final Position position, final Dimension dimension, final IArea area, final Permeability permeability, final Sprite sprite) {
        super (area, permeability, sprite);
        this.direction = direction;
        this.position = position;
        this.dimension = dimension;
    }

    public Direction getDirection() {
        return this.direction;
    }

   
    public void setDirection(final Direction direction) {
        this.direction = direction;
    }

    
    public Position getPosition() {
        return this.position;
    }

    
    public Dimension getDimension() {
        return this.dimension;
    }

    
    public void placeInArea(final IArea area) {
        this.position.setMaxX(area.getDimension().getWidth());
        this.position.setMaxY(area.getDimension().getHeight());
    }

    public void move() {
        switch (this.direction) {
            case UP:
                this.moveUp();
                break;
            case RIGHT:
                this.moveRight();
                break;
            case DOWN:
                this.moveDown();
                break;
            case LEFT:
                this.moveLeft();
                break;
            default:
                break;
        }
    }

    void moveUp() {
        this.position.setY(this.position.getY() - 1);
    }

    void moveRight() {
        this.position.setX(this.position.getX() + 1);
    }

    void moveDown() {
        this.position.setY(this.position.getY() + 1);
    }

    void moveLeft() {
        this.position.setX(this.position.getX() - 1);
    }




}



