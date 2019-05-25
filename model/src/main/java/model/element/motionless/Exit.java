package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

class Exit extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('E',"Exit.jpg");

    /**
     * Instantiates a new ditchLeft.
     */
    Exit() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
