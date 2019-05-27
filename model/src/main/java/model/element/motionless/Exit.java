package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

class Exit extends MotionlessElement {

    private static final Sprite SPRITE = new Sprite('E',"Exit.png");


    Exit() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
