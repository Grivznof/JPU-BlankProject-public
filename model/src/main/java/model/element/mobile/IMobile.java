package model.element.mobile;

import model.Dimension;
import model.Direction;
import model.Position;
import model.element.Sprite;

public interface IMobile {

    public Direction getDirection();

    public void setDirection(final Direction direction);

    public Position getPosition();

    public Dimension getDimension();

    public int getWidth();

    public int getHeight();

    public Sprite getSprite();

    public void move();
}
