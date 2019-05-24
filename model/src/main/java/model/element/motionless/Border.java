package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

class Border extends MotionlessElement {

        /** The Constant SPRITE. */
        private static final Sprite SPRITE = new Sprite('B',"Border.jpg");

        /**
         * Instantiates a new ditchLeft.
         */
        Border() {
            super(SPRITE, Permeability.BLOCKING);
        }
}
