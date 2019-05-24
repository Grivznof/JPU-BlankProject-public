package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

class Ground extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite('G',"Ground.jpg");

    /**
     * Instantiates a new ditchLeft.
     */
    Ground() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}