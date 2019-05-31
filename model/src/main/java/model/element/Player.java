package model.element;

import contract.Permeability;
import model.Dimension;
import contract.Direction;
import contract.IArea;
import model.Position;


import java.io.IOException;

public abstract class Player extends Mobile{


    /*private static final Sprite sprite = new Sprite('P', "Player.png");



    private static final Sprite spriteTurnUp  = new Sprite('P', "PlayerUp.png");



    private static final Sprite spriteTurnDown  = new Sprite('P', "PlayerDown.png");


    private static final Sprite spriteTurnLeft  = new Sprite('P', "PlayerLeft.png");


    private static final Sprite spriteTurnRight = new Sprite('P', "PlayerRight.png");


    private static final Sprite spriteExplode   = new Sprite('P', "Explode.png");

    public Player(final Direction direction, final Position position, final Dimension dimension, final IArea area, final Permeability permeability, final Sprite sprite) throws IOException {
        super(direction, position, dimension, area, Permeability.BLOCKING, sprite);
        spriteTurnUp.loadImage();
        spriteTurnDown.loadImage();
        spriteTurnLeft.loadImage();
        spriteTurnRight.loadImage();
        spriteExplode.loadImage();
    }
/**     public final void moveUp() {
        super.moveUp();
        this.setSprite(spriteTurnLeft);
    }

    public final void moveDown() {
        super.moveDown();
        this.setSprite(spriteTurnDown);
    }

    public final void moveLeft() {
        super.moveLeft();
        this.setSprite(spriteTurnLeft);
    }

    public final void moveRight() {
        super.moveRight();
        this.setSprite(spriteTurnLeft);
    }

    public Sprite getSprite() {
        return sprite;
    }*/

    public Player(Direction direction,  Tileset position,  Dimension dimension, String name, Permeability permeability, boolean state){
        super(direction, position, dimension, name, Permeability.BLOCKING, state);
    }
}




