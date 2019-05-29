package model.element.mobile;

import model.IArea;
import model.element.Permeability;
import model.element.Sprite;

import java.io.IOException;

public abstract class Player extends Mobile{

    private static final Sprite sprite = new Sprite('P', "Player.png");

    /** The Constant spriteTurnUp. */

    private static final Sprite spriteTurnUp  = new Sprite('P', "PlayerUp.png");

    /** The Constant spriteTurnDown. */

    private static final Sprite spriteTurnDown  = new Sprite('P', "PlayerDown.png");

    /** The Constant spriteTurnLeft. */
    private static final Sprite spriteTurnLeft  = new Sprite('P', "PlayerLeft.png");

    /** The Constant spriteTurnRight. */
    private static final Sprite spriteTurnRight = new Sprite('P', "PlayerRight.png");

    /** The Constant spriteExplode. */
    private static final Sprite spriteExplode   = new Sprite('P', "Explode.png");

    public Player(final int x, final int y, final IArea area) throws IOException {
        super(x, y, sprite, area, Permeability.BLOCKING);
        spriteTurnUp.loadImage();
        spriteTurnDown.loadImage();
        spriteTurnLeft.loadImage();
        spriteTurnRight.loadImage();
        spriteExplode.loadImage();
    }

    public final void moveUp() {
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
    }
}
