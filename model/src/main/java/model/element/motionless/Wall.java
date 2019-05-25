package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

class Wall extends MotionlessElement {

    private static final Sprite SPRITE = new Sprite('W',"Wall.jpg");

    Wall() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
