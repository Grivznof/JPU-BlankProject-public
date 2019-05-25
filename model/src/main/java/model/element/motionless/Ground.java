package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

class Ground extends MotionlessElement {

    private static final Sprite SPRITE = new Sprite('G',"Ground.jpg");

    Ground() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}