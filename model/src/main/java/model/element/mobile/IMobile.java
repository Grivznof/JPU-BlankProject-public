package model.element.mobile;

import model.Dimension;
import model.Direction;
import model.IArea;
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

    void move();

    public void placeInArea(IArea area);

    void setPlayerModel(IPlayerModel playerModel);

    boolean isPlayer(int player);
}
