package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

class Wall extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('W',"Wall.jpg");

    /**
     * Instantiates a new ditchLeft.
     */
    Wall() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
