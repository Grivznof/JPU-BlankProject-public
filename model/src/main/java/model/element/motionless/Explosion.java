package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Explosion extends MotionlessElement {

    private static final Sprite SPRITE = new Sprite('X',"Explosion.png");

    Explosion() {
        super(SPRITE, Permeability.BLOCKING);
    }
}

