package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

class Border extends MotionlessElement {

        private static final Sprite SPRITE = new Sprite('B',"Border.jpg");

        Border() {
            super(SPRITE, Permeability.BLOCKING);
        }
}
